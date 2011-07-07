package com.octo.poc.gwt.validation.shared;

public class SomeDomainClassRequestImpl_FactoryImpl extends com.google.web.bindery.autobean.gwt.client.impl.AbstractAutoBeanFactory implements com.octo.poc.gwt.validation.shared.SomeDomainClassRequestImpl.Factory {
  @Override protected void initializeCreatorMap(com.google.web.bindery.autobean.gwt.client.impl.JsniCreatorMap map) {
    map.add(com.octo.poc.gwt.validation.client.SomeDomainClassProxy.class, getConstructors_com_octo_poc_gwt_validation_client_SomeDomainClassProxy());
  }
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_com_octo_poc_gwt_validation_client_SomeDomainClassProxy() /*-{
    return [
      @com.octo.poc.gwt.validation.client.SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;),
      @com.octo.poc.gwt.validation.client.SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Lcom/octo/poc/gwt/validation/client/SomeDomainClassProxy;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_com_google_web_bindery_requestfactory_shared_EntityProxyId() /*-{
    return [
      @com.google.web.bindery.requestfactory.shared.EntityProxyIdAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;),
      @com.google.web.bindery.requestfactory.shared.EntityProxyIdAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Lcom/google/web/bindery/requestfactory/shared/EntityProxyId;)
    ];
  }-*/;
  @Override protected void initializeEnumMap() {
  }
  public com.google.web.bindery.autobean.shared.AutoBean com_octo_poc_gwt_validation_client_SomeDomainClassProxy() {
    return new com.octo.poc.gwt.validation.client.SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory(SomeDomainClassRequestImpl_FactoryImpl.this);
  }
}
