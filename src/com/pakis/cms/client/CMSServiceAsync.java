package com.pakis.cms.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import java.util.ArrayList;

import com.pakis.cms.shared.Paki;

public interface CMSServiceAsync {

	void savePaki(Paki paki, AsyncCallback<Paki> callback);

	void getAllPakis(AsyncCallback<ArrayList<Paki>> callback);

}
