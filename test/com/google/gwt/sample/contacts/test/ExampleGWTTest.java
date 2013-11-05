package com.google.gwt.sample.contacts.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.junit.client.GWTTestCase;
import com.pakis.cms.client.CMSService;
import com.pakis.cms.client.CMSServiceAsync;

public class ExampleGWTTest extends GWTTestCase {
	private CMSServiceAsync rpcService;
	private HandlerManager eventBus;

	public String getModuleName() {
		return "com.google.gwt.sample.contacts.Contacts";
	}

	public void gwtSetUp() {
		rpcService = GWT.create(CMSService.class);
		eventBus = new HandlerManager(null);
		// display = new PakisView();
		// pakisPresenter = new PakisPresenter(rpcService, eventBus, display);
	}

	public void testContactSort() {

	}
}
