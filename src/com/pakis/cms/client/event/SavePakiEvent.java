package com.pakis.cms.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class SavePakiEvent extends GwtEvent<SavePakiEventHandler> {
  public static Type<SavePakiEventHandler> TYPE = new Type<SavePakiEventHandler>();
  
  @Override
  public Type<SavePakiEventHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(SavePakiEventHandler handler) {
    handler.onSavePaki(this);
  }
}
