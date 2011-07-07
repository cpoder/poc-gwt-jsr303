package com.google.web.bindery.requestfactory.shared.messages;

public class ViolationMessageAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.google.web.bindery.requestfactory.shared.messages.ViolationMessage> {
  private final com.google.web.bindery.requestfactory.shared.messages.ViolationMessage shim = new com.google.web.bindery.requestfactory.shared.messages.ViolationMessage() {
    public com.google.web.bindery.requestfactory.shared.messages.IdMessage.Strength getStrength()  {
      com.google.web.bindery.requestfactory.shared.messages.IdMessage.Strength toReturn = ViolationMessageAutoBean.this.getWrapped().getStrength();
      return toReturn;
    }
    public int getClientId()  {
      int toReturn = ViolationMessageAutoBean.this.getWrapped().getClientId();
      return toReturn;
    }
    public int getSyntheticId()  {
      int toReturn = ViolationMessageAutoBean.this.getWrapped().getSyntheticId();
      return toReturn;
    }
    public java.lang.String getMessage()  {
      java.lang.String toReturn = ViolationMessageAutoBean.this.getWrapped().getMessage();
      return toReturn;
    }
    public java.lang.String getPath()  {
      java.lang.String toReturn = ViolationMessageAutoBean.this.getWrapped().getPath();
      return toReturn;
    }
    public java.lang.String getServerId()  {
      java.lang.String toReturn = ViolationMessageAutoBean.this.getWrapped().getServerId();
      return toReturn;
    }
    public java.lang.String getTypeToken()  {
      java.lang.String toReturn = ViolationMessageAutoBean.this.getWrapped().getTypeToken();
      return toReturn;
    }
    public void setClientId(int value)  {
      ViolationMessageAutoBean.this.getWrapped().setClientId(value);
      ViolationMessageAutoBean.this.set("setClientId", value);
    }
    public void setMessage(java.lang.String value)  {
      ViolationMessageAutoBean.this.getWrapped().setMessage(value);
      ViolationMessageAutoBean.this.set("setMessage", value);
    }
    public void setPath(java.lang.String value)  {
      ViolationMessageAutoBean.this.getWrapped().setPath(value);
      ViolationMessageAutoBean.this.set("setPath", value);
    }
    public void setServerId(java.lang.String value)  {
      ViolationMessageAutoBean.this.getWrapped().setServerId(value);
      ViolationMessageAutoBean.this.set("setServerId", value);
    }
    public void setStrength(com.google.web.bindery.requestfactory.shared.messages.IdMessage.Strength value)  {
      ViolationMessageAutoBean.this.getWrapped().setStrength(value);
      ViolationMessageAutoBean.this.set("setStrength", value);
    }
    public void setSyntheticId(int value)  {
      ViolationMessageAutoBean.this.getWrapped().setSyntheticId(value);
      ViolationMessageAutoBean.this.set("setSyntheticId", value);
    }
    public void setTypeToken(java.lang.String value)  {
      ViolationMessageAutoBean.this.getWrapped().setTypeToken(value);
      ViolationMessageAutoBean.this.set("setTypeToken", value);
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
  public ViolationMessageAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public ViolationMessageAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.google.web.bindery.requestfactory.shared.messages.ViolationMessage wrapped) {
    super(wrapped, factory);
  }
  public com.google.web.bindery.requestfactory.shared.messages.ViolationMessage as() {return shim;}
  public Class<com.google.web.bindery.requestfactory.shared.messages.ViolationMessage> getType() {return com.google.web.bindery.requestfactory.shared.messages.ViolationMessage.class;}
  @Override protected com.google.web.bindery.requestfactory.shared.messages.ViolationMessage createSimplePeer() {
    return new com.google.web.bindery.requestfactory.shared.messages.ViolationMessage() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.google.web.bindery.requestfactory.shared.messages.ViolationMessageAutoBean.this.data;
      public com.google.web.bindery.requestfactory.shared.messages.IdMessage.Strength getStrength()  {
        return (com.google.web.bindery.requestfactory.shared.messages.IdMessage.Strength) getOrReify("R");
      }
      public int getClientId()  {
        java.lang.Integer toReturn = getOrReify("C");
        return toReturn == null ? 0 : toReturn;
      }
      public int getSyntheticId()  {
        java.lang.Integer toReturn = getOrReify("Y");
        return toReturn == null ? 0 : toReturn;
      }
      public java.lang.String getMessage()  {
        return (java.lang.String) getOrReify("M");
      }
      public java.lang.String getPath()  {
        return (java.lang.String) getOrReify("P");
      }
      public java.lang.String getServerId()  {
        return (java.lang.String) getOrReify("S");
      }
      public java.lang.String getTypeToken()  {
        return (java.lang.String) getOrReify("T");
      }
      public void setClientId(int value)  {
        setProperty("C", value);
      }
      public void setMessage(java.lang.String value)  {
        setProperty("M", value);
      }
      public void setPath(java.lang.String value)  {
        setProperty("P", value);
      }
      public void setServerId(java.lang.String value)  {
        setProperty("S", value);
      }
      public void setStrength(com.google.web.bindery.requestfactory.shared.messages.IdMessage.Strength value)  {
        setProperty("R", value);
      }
      public void setSyntheticId(int value)  {
        setProperty("Y", value);
      }
      public void setTypeToken(java.lang.String value)  {
        setProperty("T", value);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.google.web.bindery.requestfactory.shared.messages.ViolationMessage as = as();
    value = as.getStrength();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ViolationMessageAutoBean.this, "R"),
      com.google.web.bindery.requestfactory.shared.messages.IdMessage.Strength.class
    );
    if (visitor.visitValueProperty("R", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("R", value, propertyContext);
    value = as.getClientId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ViolationMessageAutoBean.this, "C"),
      int.class
    );
    if (visitor.visitValueProperty("C", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("C", value, propertyContext);
    value = as.getSyntheticId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ViolationMessageAutoBean.this, "Y"),
      int.class
    );
    if (visitor.visitValueProperty("Y", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("Y", value, propertyContext);
    value = as.getMessage();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ViolationMessageAutoBean.this, "M"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("M", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("M", value, propertyContext);
    value = as.getPath();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ViolationMessageAutoBean.this, "P"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("P", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("P", value, propertyContext);
    value = as.getServerId();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ViolationMessageAutoBean.this, "S"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("S", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("S", value, propertyContext);
    value = as.getTypeToken();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(ViolationMessageAutoBean.this, "T"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("T", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("T", value, propertyContext);
  }
}
