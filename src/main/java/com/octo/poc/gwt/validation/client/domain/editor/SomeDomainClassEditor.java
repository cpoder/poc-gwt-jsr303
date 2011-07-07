package com.octo.poc.gwt.validation.client.domain.editor;

import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.ui.client.ValueBoxEditorDecorator;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.requestfactory.gwt.client.RequestFactoryEditorDriver;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Violation;
import com.octo.poc.gwt.validation.client.Main;
import com.octo.poc.gwt.validation.client.domain.proxy.SomeDomainClassProxy;
import com.octo.poc.gwt.validation.shared.MyRequestFactory;
import com.octo.poc.gwt.validation.shared.SomeDomainClassRequest;

public class SomeDomainClassEditor extends Composite implements Editor<SomeDomainClassProxy> {

	private static SomeDomainClassEditorUiBinder uiBinder = GWT.create(SomeDomainClassEditorUiBinder.class);

	interface SomeDomainClassEditorUiBinder extends UiBinder<Widget, SomeDomainClassEditor> {
	}

	interface Driver extends RequestFactoryEditorDriver<SomeDomainClassProxy, SomeDomainClassEditor> {
	}

	private Driver driver = GWT.create(Driver.class);

	@UiField
	protected ValueBoxEditorDecorator<String> someString;

	@UiField
	@Path("someString")
	protected TextBox someStringValue;

	private MyRequestFactory requestFactory;

	private Main main;

	public SomeDomainClassEditor(Main main, MyRequestFactory requestFactory) {
		this.requestFactory = requestFactory;
		this.main = main;
		initWidget(uiBinder.createAndBindUi(this));

		driver.initialize(requestFactory, this);

		someStringValue.addValueChangeHandler(new ValueChangeHandler<String>() {

			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				save();
			}
		});
	}

	private SomeDomainClassProxy editedSomeDomainClassProxy;

	public void edit(SomeDomainClassProxy someDomainClass) {
		edit(someDomainClass, requestFactory.someDomainClassRequest());
	}

	public void edit(SomeDomainClassProxy someDomainClass, RequestContext request) {
		this.editedSomeDomainClassProxy = someDomainClass;
		driver.edit(someDomainClass, request);
	}

	public void save() {
		final SomeDomainClassRequest request = (SomeDomainClassRequest) driver.flush();
		request.persist().using(editedSomeDomainClassProxy);
		if (!driver.hasErrors()) {
			main.setErrorMessage(null);
			request.fire(new Receiver<Void>() {

				@Override
				public void onSuccess(Void response) {
					main.updateList();
				}

				@Override
				public void onViolation(Set<Violation> errors) {
					main.setErrorMessage("Violations were detected remotely");
					driver.setViolations(errors);
				}
			});
		} else {
			main.setErrorMessage("Errors were detected locally");
		}
	}
}
