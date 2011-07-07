package com.octo.poc.gwt.validation.shared;

import java.util.List;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;
import com.octo.poc.gwt.validation.client.domain.proxy.SomeDomainClassProxy;
import com.octo.poc.gwt.validation.server.domain.SomeDomainClass;

@Service(SomeDomainClass.class)
public interface SomeDomainClassRequest extends RequestContext {
	Request<Integer> countSomeDomainClasses();

	InstanceRequest<SomeDomainClassProxy, Void> persist();

	Request<List<SomeDomainClassProxy>> getAll();
}
