package com.pakis.cms.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
import com.pakis.cms.client.event.SavePakiEvent;
import com.pakis.cms.client.event.SavePakiEventHandler;
import com.pakis.cms.client.presenter.PakisPresenter;
import com.pakis.cms.client.presenter.EditContactPresenter;
import com.pakis.cms.client.presenter.Presenter;
import com.pakis.cms.client.view.PakisView;
import com.pakis.cms.client.view.EditContactView;

public class AppController implements Presenter, ValueChangeHandler<String> {
	private final HandlerManager eventBus;
	private final CMSServiceAsync rpcService;
	private HasWidgets container;

	public AppController(CMSServiceAsync rpcService, HandlerManager eventBus) {
		this.eventBus = eventBus;
		this.rpcService = rpcService;
		bind();
	}

	private void bind() {
		History.addValueChangeHandler(this);

		eventBus.addHandler(SavePakiEvent.TYPE, new SavePakiEventHandler() {
			public void onSavePaki(SavePakiEvent event) {
				sendPakiEmail();
			}
		});
	}

	private void sendPakiEmail() {

		// Pintar el Label de se ha enviado el correo y enviar el correo
	}

	public void go(final HasWidgets container) {
		this.container = container;

		if ("".equals(History.getToken())) {
			History.newItem("add");
		} else {
			History.fireCurrentHistoryState();
		}
	}

	public void onValueChange(ValueChangeEvent<String> event) {
		String token = event.getValue();

		if (token != null) {
			Presenter presenter = null;

			if (token.equals("add")) {
				presenter = new EditContactPresenter(rpcService, eventBus,
						new EditContactView());
			}

			if (presenter != null) {
				presenter.go(container);
			}
		}
	}
}
