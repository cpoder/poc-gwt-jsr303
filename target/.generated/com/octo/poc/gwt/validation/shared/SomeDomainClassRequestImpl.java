package com.octo.poc.gwt.validation.shared;

public class SomeDomainClassRequestImpl extends com.google.web.bindery.requestfactory.shared.impl.AbstractRequestContext implements com.octo.poc.gwt.validation.shared.SomeDomainClassRequest {
  public SomeDomainClassRequestImpl(com.google.web.bindery.requestfactory.shared.impl.AbstractRequestFactory requestFactory) {super(requestFactory, com.google.web.bindery.requestfactory.shared.impl.AbstractRequestContext.Dialect.STANDARD);}
  @com.google.web.bindery.autobean.shared.AutoBeanFactory.Category({com.google.web.bindery.requestfactory.shared.impl.EntityProxyCategory.class, com.google.web.bindery.requestfactory.shared.impl.ValueProxyCategory.class, com.google.web.bindery.requestfactory.shared.impl.BaseProxyCategory.class})
  @com.google.web.bindery.autobean.shared.AutoBeanFactory.NoWrap(com.google.web.bindery.requestfactory.shared.EntityProxyId.class)
  interface Factory extends com.google.web.bindery.autobean.shared.AutoBeanFactory {
    com.google.web.bindery.autobean.shared.AutoBean<com.octo.poc.gwt.validation.client.SomeDomainClassProxy> com_octo_poc_gwt_validation_client_SomeDomainClassProxy();
  }
  public static Factory FACTORY;
  @Override public Factory getAutoBeanFactory() {
    if (FACTORY == null) {
      FACTORY = com.google.gwt.core.client.GWT.create(Factory.class);
    }
    return FACTORY;
  }
  public  com.google.web.bindery.requestfactory.shared.Request<java.lang.Long> countSomeDomainClasses() {
    class X extends com.google.web.bindery.requestfactory.shared.impl.AbstractRequest<java.lang.Long> implements com.google.web.bindery.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(SomeDomainClassRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.web.bindery.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.web.bindery.requestfactory.shared.impl.RequestData("com.octo.poc.gwt.validation.shared.SomeDomainClassRequest::countSomeDomainClasses", new Object[] {}, propertyRefs, java.lang.Long.class, null);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.web.bindery.requestfactory.shared.Request<java.util.List<com.octo.poc.gwt.validation.client.SomeDomainClassProxy>> getAll() {
    class X extends com.google.web.bindery.requestfactory.shared.impl.AbstractRequest<java.util.List<com.octo.poc.gwt.validation.client.SomeDomainClassProxy>> implements com.google.web.bindery.requestfactory.shared.Request<java.util.List<com.octo.poc.gwt.validation.client.SomeDomainClassProxy>> {
      public X() { super(SomeDomainClassRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.web.bindery.requestfactory.shared.impl.RequestData makeRequestData() {
        return new com.google.web.bindery.requestfactory.shared.impl.RequestData("com.octo.poc.gwt.validation.shared.SomeDomainClassRequest::getAll", new Object[] {}, propertyRefs, java.util.List.class, com.octo.poc.gwt.validation.client.SomeDomainClassProxy.class);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
}
