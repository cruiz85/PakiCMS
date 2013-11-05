package com.pakis.cms.client.view;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.pakis.cms.client.presenter.EditPakiPresenter;
import com.sencha.gxt.widget.core.client.TabPanel;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FormPanel;
import com.sencha.gxt.widget.core.client.form.TextField;

public class EditPakiView extends Composite implements
		EditPakiPresenter.Display {
	private final TextBox shopName;
	private final TextBox openingHour;
	private final TextBox closingHour;
	private final FlexTable detailsTable;
	private final Button saveButton;
	private final Button cancelButton;
	private final Label emailNotificationLabel;

	public EditPakiView() {
		emailNotificationLabel = new Label();
		DecoratorPanel contentDetailsDecorator = new DecoratorPanel();
		contentDetailsDecorator.setWidth("18em");
		initWidget(contentDetailsDecorator);

		// Form Tab Panel
		VerticalPanel contentDetailsPanel = new VerticalPanel();
		FormPanel panel = new FormPanel();
		panel.setWidth(300);

		TabPanel tabs = new TabPanel();
		panel.setWidget(tabs);

		VerticalLayoutContainer p = new VerticalLayoutContainer();
		p.setLayoutData(new MarginData(8));

		tabs.add(p, "Detalles de la Tienda");

		TextField firstName = new TextField();
		firstName.setAllowBlank(false);
		firstName.setValue("Darrell");
		p.add(new FieldLabel(firstName, "First Name"), new VerticalLayoutData(
				1, -1));

		contentDetailsPanel.setWidth("100%");

		// Create the contacts list
		//
		detailsTable = new FlexTable();
		detailsTable.setCellSpacing(0);
		detailsTable.setWidth("100%");
		detailsTable.addStyleName("contacts-ListContainer");
		detailsTable.getColumnFormatter().addStyleName(1, "add-contact-input");
		shopName = new TextBox();
		openingHour = new TextBox();
		closingHour = new TextBox();
		initDetailsTable();
		contentDetailsPanel.add(detailsTable);

		HorizontalPanel menuPanel = new HorizontalPanel();
		saveButton = new Button("Guardar");
		cancelButton = new Button("Cancelar");
		menuPanel.add(saveButton);
		menuPanel.add(cancelButton);
		contentDetailsPanel.add(menuPanel);
		contentDetailsPanel.add(emailNotificationLabel);
		contentDetailsDecorator.add(contentDetailsPanel);

		createTabForm();

	}

	private void createTabForm() {
		VerticalPanel vp = new VerticalPanel();
		FormPanel panel = new FormPanel();
		panel.setWidth(300);

		TabPanel tabs = new TabPanel();
		panel.setWidget(tabs);

		VerticalLayoutContainer p = new VerticalLayoutContainer();
		p.setLayoutData(new MarginData(8));

		tabs.add(p, "Person Details");

		TextField firstName = new TextField();
		firstName.setAllowBlank(false);
		firstName.setValue("Darrell");
		p.add(new FieldLabel(firstName, "First Name"), new VerticalLayoutData(
				1, -1));

		TextField lastName = new TextField();
		lastName.setAllowBlank(false);
		lastName.setValue("Meyer");
		p.add(new FieldLabel(lastName, "Last Name"), new VerticalLayoutData(1,
				-1));

		TextField email = new TextField();
		email.setAllowBlank(false);
		p.add(new FieldLabel(email, "Email"), new VerticalLayoutData(1, -1));

		p = new VerticalLayoutContainer();
		p.setLayoutData(new MarginData(8));

		tabs.add(p, "Phone Numbers");

		TextField home = new TextField();
		home.setValue("888-888-888");
		p.add(new FieldLabel(home, "Home"), new VerticalLayoutData(1, -1));

		TextField business = new TextField();
		business.setValue("888-888-888");
		p.add(new FieldLabel(business, "Business"), new VerticalLayoutData(1,
				-1));

		vp.add(panel);
	}

	private void initDetailsTable() {
		detailsTable.setWidget(0, 0, new Label("Nombre de la Tienda"));
		detailsTable.setWidget(0, 1, shopName);
		detailsTable.setWidget(1, 0, new Label("Horario de apertura"));
		detailsTable.setWidget(1, 1, openingHour);
		detailsTable.setWidget(2, 0, new Label("Horario de Cierre"));
		detailsTable.setWidget(2, 1, closingHour);
		shopName.setFocus(true);
	}

	public HasClickHandlers getSaveButton() {
		return saveButton;
	}

	public HasClickHandlers getCancelButton() {
		return cancelButton;
	}

	public Widget asWidget() {
		return this;
	}

	@Override
	public void setEmailNotificationMessage(String emailMessage) {
		emailNotificationLabel.setText(emailMessage);

	}

	@Override
	public HasValue<String> getShopName() {
		return shopName;
	}

	@Override
	public HasValue<String> getClosingHour() {
		return closingHour;
	}

	@Override
	public HasValue<String> getOpeningHour() {
		return openingHour;
	}

}
