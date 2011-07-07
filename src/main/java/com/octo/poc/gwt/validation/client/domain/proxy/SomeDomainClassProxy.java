package com.octo.poc.gwt.validation.client.domain.proxy;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.octo.poc.gwt.validation.server.domain.SomeDomainClass;

@ProxyFor(SomeDomainClass.class)
public interface SomeDomainClassProxy extends EntityProxy {
	Long getId();

	void setId(Long Id);

	String getSomeString();

	void setSomeString(String someString);
}
