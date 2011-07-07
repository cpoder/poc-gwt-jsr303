package com.octo.poc.gwt.validation.client;

public class SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.octo.poc.gwt.validation.client.SomeDomainClassProxy> {
  private final com.octo.poc.gwt.validation.client.SomeDomainClassProxy shim = new com.octo.poc.gwt.validation.client.SomeDomainClassProxy() {
    public java.lang.Long getId()  {
      java.lang.Long toReturn = SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.getWrapped().getId();
      toReturn = com.google.web.bindery.requestfactory.shared.impl.BaseProxyCategory.__intercept(SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this, toReturn);
      return toReturn;
    }
    public java.lang.String getSomeString()  {
      java.lang.String toReturn = SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.getWrapped().getSomeString();
      toReturn = com.google.web.bindery.requestfactory.shared.impl.BaseProxyCategory.__intercept(SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this, toReturn);
      return toReturn;
    }
    public void setId(java.lang.Long Id)  {
      SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.getWrapped().setId(Id);
      SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.set("setId", Id);
    }
    public void setSomeString(java.lang.String someString)  {
      SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.getWrapped().setSomeString(someString);
      SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.set("setSomeString", someString);
    }
    public com.google.web.bindery.requestfactory.shared.EntityProxyId stableId()  {
      com.google.web.bindery.requestfactory.shared.EntityProxyId toReturn = SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.getWrapped().stableId();
      toReturn = com.google.web.bindery.requestfactory.shared.impl.BaseProxyCategory.__intercept(SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this, toReturn);
      SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.call("stableId", toReturn );
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
  public SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.octo.poc.gwt.validation.client.SomeDomainClassProxy wrapped) {
    super(wrapped, factory);
  }
  public com.octo.poc.gwt.validation.client.SomeDomainClassProxy as() {return shim;}
  public Class<com.octo.poc.gwt.validation.client.SomeDomainClassProxy> getType() {return com.octo.poc.gwt.validation.client.SomeDomainClassProxy.class;}
  @Override protected com.octo.poc.gwt.validation.client.SomeDomainClassProxy createSimplePeer() {
    return new com.octo.poc.gwt.validation.client.SomeDomainClassProxy() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.octo.poc.gwt.validation.client.SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this.data;
      public java.lang.Long getId()  {
        return (java.lang.Long) getOrReify("id");
      }
      public java.lang.String getSomeString()  {
        return (java.lang.String) getOrReify("someString");
      }
      public void setId(java.lang.Long Id)  {
        setProperty("id", Id);
      }
      public void setSomeString(java.lang.String someString)  {
        setProperty("someString", someString);
      }
      public com.google.web.bindery.requestfactory.shared.EntityProxyId stableId()  {
        return com.google.web.bindery.requestfactory.shared.impl.EntityProxyCategory.stableId(SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this);
      }
      public boolean equals(java.lang.Object other)  {
        return com.google.web.bindery.requestfactory.shared.impl.EntityProxyCategory.equals(SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this, other);
      }
      public int hashCode()  {
        return com.google.web.bindery.requestfactory.shared.impl.EntityProxyCategory.hashCode(SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.octo.poc.gwt.validation.client.SomeDomainClassProxy as = as();
    value = as.getId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this, "id"),
      java.lang.Long.class
    );
    if (visitor.visitValueProperty("id", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("id", value, propertyContext);
    value = as.getSomeString();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(SomeDomainClassProxyAutoBean_com_google_web_bindery_requestfactory_shared_impl_EntityProxyCategory_com_google_web_bindery_requestfactory_shared_impl_ValueProxyCategory_com_google_web_bindery_requestfactory_shared_impl_BaseProxyCategory.this, "someString"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("someString", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("someString", value, propertyContext);
  }
}
