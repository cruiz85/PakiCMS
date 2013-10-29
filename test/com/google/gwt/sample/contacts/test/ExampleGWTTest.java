package com.google.gwt.sample.contacts.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.junit.client.GWTTestCase;
import com.pakis.cms.client.CMSService;
import com.pakis.cms.client.CMSServiceAsync;
import com.pakis.cms.client.presenter.PakisPresenter;
import com.pakis.cms.client.view.PakisView;

public class ExampleGWTTest extends GWTTestCase {
	private PakisPresenter pakisPresenter;
	private CMSServiceAsync rpcService;
	private HandlerManager eventBus;
	private PakisPresenter.Display display;

	public String getModuleName() {
		return "com.google.gwt.sample.contacts.Contacts";
	}

	public void gwtSetUp() {
		rpcService = GWT.create(CMSService.class);
		eventBus = new HandlerManager(null);
		display = new PakisView();
		pakisPresenter = new PakisPresenter(rpcService, eventBus, display);
	}

	public void testContactSort() {

	}
}
