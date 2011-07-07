package com.google.web.bindery.requestfactory.shared;

public class EntityProxyIdAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.google.web.bindery.requestfactory.shared.EntityProxyId> {
  private final com.google.web.bindery.requestfactory.shared.EntityProxyId shim = new com.google.web.bindery.requestfactory.shared.EntityProxyId() {
    public java.lang.Class getProxyClass()  {
      java.lang.Class toReturn = EntityProxyIdAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.getWrapped().getProxyClass();
      if (toReturn != null) {
        if (EntityProxyIdAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.isWrapped(toReturn)) {
          toReturn = EntityProxyIdAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.getFromWrapper(toReturn);
        } else {
        }
      }
      toReturn = com.google.web.bindery.requestfactory.shared.impl.BaseProxyCategory.__intercept(EntityProxyIdAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this, toReturn);
      return toReturn;
    }
    @Override public boolean equals(Object o) {
      return this == o || getWrapped().equals(o);
    }
    @Override public int hashCode() {
      return getWrapped().hashCode();
    }
    @Override public String toString() {
      return getWrapped().toString();
    }
  };
  { com.google.gwt.core.client.impl.WeakMapping.set(shim, com.google.web.bindery.autobean.shared.AutoBean.class.getName(), this); }
  public EntityProxyIdAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public EntityProxyIdAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.google.web.bindery.requestfactory.shared.EntityProxyId wrapped) {
    super(wrapped, factory);
  }
  public com.google.web.bindery.requestfactory.shared.EntityProxyId as() {return shim;}
  public Class<com.google.web.bindery.requestfactory.shared.EntityProxyId> getType() {return com.google.web.bindery.requestfactory.shared.EntityProxyId.class;}
  @Override protected com.google.web.bindery.requestfactory.shared.EntityProxyId createSimplePeer() {
    return new com.google.web.bindery.requestfactory.shared.EntityProxyId() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.google.web.bindery.requestfactory.shared.EntityProxyIdAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.data;
      public java.lang.Class getProxyClass()  {
        return (java.lang.Class) getOrReify("proxyClass");
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.google.web.bindery.requestfactory.shared.EntityProxyId as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getProxyClass());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(EntityProxyIdAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this, "proxyClass"),
      new Class<?>[] {java.lang.Class.class, com.google.web.bindery.requestfactory.shared.EntityProxy.class},
      new int[] {1, 0}
    );
    if (visitor.visitReferenceProperty("proxyClass", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitReferenceProperty("proxyClass", bean, propertyContext);
  }
}
