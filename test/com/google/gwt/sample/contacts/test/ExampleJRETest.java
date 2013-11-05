package com.google.gwt.sample.contacts.test;

import com.google.gwt.event.shared.HandlerManager;
import com.pakis.cms.client.CMSServiceAsync;
//import com.pakis.cms.client.presenter.PakisPresenter;

import java.util.ArrayList;

import junit.framework.TestCase;
import static org.easymock.EasyMock.createStrictMock;

public class ExampleJRETest extends TestCase {
//	private PakisPresenter pakisPresenter;
	private CMSServiceAsync mockRpcService;
	private HandlerManager eventBus;
//	private PakisPresenter.Display mockDisplay;

	protected void setUp() {
		mockRpcService = createStrictMock(CMSServiceAsync.class);
		eventBus = new HandlerManager(null);
//		mockDisplay = createStrictMock(PakisPresenter.Display.class);
//		pakisPresenter = new PakisPresenter(mockRpcService, eventBus,
//				mockDisplay);
	}

	public void testContactSort() {

	}
}
