package com.octo.poc.gwt.validation.client;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.octo.poc.gwt.validation.client.domain.editor.SomeDomainClassEditor;
import com.octo.poc.gwt.validation.client.domain.proxy.SomeDomainClassProxy;
import com.octo.poc.gwt.validation.shared.MyRequestFactory;
import com.octo.poc.gwt.validation.shared.SomeDomainClassRequest;

public class Main extends Composite implements EntryPoint {

	public interface Binder extends UiBinder<Widget, Main> {
	};

	private static Binder binder = GWT.create(Binder.class);

	private static final Logger log = Logger.getLogger(Main.class.getName());

	final EventBus eventBus = new SimpleEventBus();
	private MyRequestFactory requestFactory = GWT.create(MyRequestFactory.class);

	@UiField
	protected FlexTable flexTable;

	@UiField
	protected Button addButton;

	@UiField
	protected Label errors;

	@Override
	public void onModuleLoad() {
		requestFactory.initialize(eventBus);
		initWidget(binder.createAndBindUi(this));
		GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {

			@Override
			public void onUncaughtException(Throwable e) {
				log.log(Level.SEVERE, e.getMessage(), e);
			}
		});

		updateList();
		RootPanel.get().add(this);
	}

	public void updateList() {
		requestFactory.someDomainClassRequest().getAll().fire(new Receiver<List<SomeDomainClassProxy>>() {

			@Override
			public void onSuccess(List<SomeDomainClassProxy> response) {
				int i = 0;
				flexTable.clear();
				for (SomeDomainClassProxy sdc : response) {
					flexTable.setWidget(i, 0, new Label(sdc.getId().toString()));
					SomeDomainClassEditor someDomainClassEditor = new SomeDomainClassEditor(Main.this, requestFactory);
					flexTable.setWidget(i++, 1, someDomainClassEditor);
					someDomainClassEditor.edit(sdc);
				}
			}
		});
	}

	public void setErrorMessage(String errorMessage) {
		if (errorMessage != null && !errorMessage.isEmpty()) {
			errors.setVisible(true);
			errors.setText(errorMessage);
		} else {
			errors.setVisible(false);
			errors.setText("");
		}
	}

	@UiHandler("addButton")
	public void onAddButtonClick(ClickEvent clickEvent) {
		SomeDomainClassRequest request = requestFactory.someDomainClassRequest();
		SomeDomainClassProxy sdc = request.create(SomeDomainClassProxy.class);
		int row = flexTable.getRowCount();
		sdc.setId(new Long(row + 1));
		flexTable.setWidget(row, 0, new Label(sdc.getId().toString()));
		SomeDomainClassEditor someDomainClassEditor = new SomeDomainClassEditor(Main.this, requestFactory);
		flexTable.setWidget(row, 1, someDomainClassEditor);
		someDomainClassEditor.edit(sdc, request);
	}
}
