package com.octo.poc.gwt.validation.shared;

import com.google.web.bindery.requestfactory.shared.RequestFactory;

public interface MyRequestFactory extends RequestFactory {
	SomeDomainClassRequest someDomainClassRequest();
}
