package com.google.gwt.sample.contacts.test;

import com.google.gwt.event.shared.HandlerManager;
import com.pakis.cms.client.CMSServiceAsync;
import com.pakis.cms.client.presenter.ContactsPresenter;

import java.util.ArrayList;

import junit.framework.TestCase;
import static org.easymock.EasyMock.createStrictMock;

public class ExampleJRETest extends TestCase {
	private ContactsPresenter contactsPresenter;
	private CMSServiceAsync mockRpcService;
	private HandlerManager eventBus;
	private ContactsPresenter.Display mockDisplay;

	protected void setUp() {
		mockRpcService = createStrictMock(CMSServiceAsync.class);
		eventBus = new HandlerManager(null);
		mockDisplay = createStrictMock(ContactsPresenter.Display.class);
		contactsPresenter = new ContactsPresenter(mockRpcService, eventBus,
				mockDisplay);
	}

	public void testContactSort() {

	}
}
