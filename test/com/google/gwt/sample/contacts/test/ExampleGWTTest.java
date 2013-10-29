package com.google.gwt.sample.contacts.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.junit.client.GWTTestCase;
import com.pakis.cms.client.CMSService;
import com.pakis.cms.client.CMSServiceAsync;
import com.pakis.cms.client.presenter.ContactsPresenter;
import com.pakis.cms.client.view.ContactsView;

public class ExampleGWTTest extends GWTTestCase {
	private ContactsPresenter contactsPresenter;
	private CMSServiceAsync rpcService;
	private HandlerManager eventBus;
	private ContactsPresenter.Display display;

	public String getModuleName() {
		return "com.google.gwt.sample.contacts.Contacts";
	}

	public void gwtSetUp() {
		rpcService = GWT.create(CMSService.class);
		eventBus = new HandlerManager(null);
		display = new ContactsView();
		contactsPresenter = new ContactsPresenter(rpcService, eventBus, display);
	}

	public void testContactSort() {

	}
}
