package com.pakis.cms.client.presenter;

import com.pakis.cms.shared.Location;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.Window;
import com.pakis.cms.client.CMSServiceAsync;
import com.pakis.cms.shared.Paki;

public class EditContactPresenter implements Presenter {
	public interface Display {
		HasClickHandlers getSaveButton();

		HasClickHandlers getCancelButton();

		HasValue<String> getShopName();

		HasValue<String> getClosingHour();

		HasValue<String> getOpeningHour();

		void setEmailNotificationMessage(String emailMessage);

		Widget asWidget();
	}

	private Paki paki;
	private final CMSServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;

	public EditContactPresenter(CMSServiceAsync rpcService,
			HandlerManager eventBus, Display display) {
		this.rpcService = rpcService;
		this.eventBus = eventBus;
		this.paki = new Paki();
		this.display = display;
		bind();
	}

	public void bind() {
		this.display.getSaveButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				doSave();
			}
		});

	}

	public void go(final HasWidgets container) {
		container.clear();
		container.add(display.asWidget());
	}

	private void doSave() {
		fillPakiInfo();

		paki.setShopName(display.getShopName().getValue());
		paki.setOpeningHour((Integer.parseInt(display.getOpeningHour()
				.getValue())));
		paki.setClosingHour((Integer.parseInt(display.getClosingHour()
				.getValue())));

		rpcService.savePaki(paki, new AsyncCallback<Paki>() {
			public void onSuccess(Paki result) {
				display.setEmailNotificationMessage("Se ha enviado un correo a su dirección e-mail para comprobación de cuenta...");
			}

			public void onFailure(Throwable caught) {
				Window.alert("Error updating contact");
			}
		});
	}

	private void fillPakiInfo() {
		paki.setAddress(new Location());
	}
}
