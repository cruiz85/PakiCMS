package com.pakis.cms.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.pakis.cms.client.CMSServiceAsync;
import com.pakis.cms.client.event.SavePakiEvent;
import com.pakis.cms.shared.Paki;

import java.util.ArrayList;
import java.util.List;

public class ContactsPresenter implements Presenter {

	private List<Paki> pakies;

	public interface Display {
		HasClickHandlers getAddButton();

		HasClickHandlers getList();

		void setData(List<String> data);

		int getClickedRow(ClickEvent event);

		List<Integer> getSelectedRows();

		Widget asWidget();
	}

	private final CMSServiceAsync cmsService;
	private final HandlerManager eventBus;
	private final Display display;

	public ContactsPresenter(CMSServiceAsync cmsService,
			HandlerManager eventBus, Display view) {
		this.cmsService = cmsService;
		this.eventBus = eventBus;
		this.display = view;
	}

	public void bind() {
		display.getAddButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new SavePakiEvent());
			}
		});

	}

	public void go(final HasWidgets container) {
		bind();
		container.clear();
		container.add(display.asWidget());
		fetchPaki();
	}

	public void setPaki(List<Paki> pakies) {
		this.pakies = pakies;
	}

	public Paki getContactDetail(int index) {
		return pakies.get(index);
	}

	private void fetchPaki() {
		cmsService.getAllPakis(new AsyncCallback<ArrayList<Paki>>() {
			public void onSuccess(ArrayList<Paki> result) {
				// Cuando recupere pakis de DBs
				// pakies = result;
				//
				// List<String> data = new ArrayList<String>();
				//
				// for (int i = 0; i < result.size(); ++i) {
				// data.add(pakies.get(i).toString());
				// }
				//
				// display.setData(data);
			}

			public void onFailure(Throwable caught) {
				Window.alert("Error fetching contact details");
			}
		});
	}

}
