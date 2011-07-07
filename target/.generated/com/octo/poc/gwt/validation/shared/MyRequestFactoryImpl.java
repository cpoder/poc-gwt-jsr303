package com.octo.poc.gwt.validation.shared;

public class MyRequestFactoryImpl extends com.google.web.bindery.requestfactory.gwt.client.impl.AbstractClientRequestFactory implements com.octo.poc.gwt.validation.shared.MyRequestFactory {
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
  public com.octo.poc.gwt.validation.shared.SomeDomainClassRequestImpl someDomainClassRequest() {
    return new com.octo.poc.gwt.validation.shared.SomeDomainClassRequestImpl(this);
  }
  private static final java.util.HashMap<String, Class<?>> tokensToTypes = new java.util.HashMap<String, Class<?>>();
  private static final java.util.HashMap<Class<?>, String> typesToTokens = new java.util.HashMap<Class<?>, String>();
  private static final java.util.HashSet<Class<?>> entityProxyTypes = new java.util.HashSet<Class<?>>();
  private static final java.util.HashSet<Class<?>> valueProxyTypes = new java.util.HashSet<Class<?>>();
  static {
    tokensToTypes.put("com.octo.poc.gwt.validation.client.SomeDomainClassProxy", com.octo.poc.gwt.validation.client.SomeDomainClassProxy.class);
    typesToTokens.put(com.octo.poc.gwt.validation.client.SomeDomainClassProxy.class, "com.octo.poc.gwt.validation.client.SomeDomainClassProxy");
    entityProxyTypes.add(com.octo.poc.gwt.validation.client.SomeDomainClassProxy.class);
  }
  @Override protected Class getTypeFromToken(String typeToken) {
    return tokensToTypes.get(typeToken);
  }
  @Override protected String getTypeToken(Class type) {
    return typesToTokens.get(type);
  }
  @Override public boolean isEntityType(Class<?> type) {
    return entityProxyTypes.contains(type);
  }
  @Override public boolean isValueType(Class<?> type) {
    return valueProxyTypes.contains(type);
  }
}
