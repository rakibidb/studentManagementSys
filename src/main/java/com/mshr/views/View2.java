package com.mshr.views;

import com.vaadin.event.ShortcutListener;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.UIClassSelectionEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class View2 extends Composite implements View {

	UI ui = new UI() {

		@Override
		protected void init(VaadinRequest request) {
			// TODO Auto-generated method stub

		}
	};

	Label l;
	TextField phone;

	public View2() {
		setCompositionRoot(pluginmethod());
	}

	void notice() {
		Notification.show("Hello,  " + phone.getValue() + " . ");

	}

	private Component pluginmethod() {

		l = new Label("Reset Password");
		l.addStyleName(ValoTheme.BUTTON_LARGE);
		phone = new TextField("Phone No");

		phone.addShortcutListener(new ShortcutListener("  ", KeyCode.ENTER, null) {

			private static final long serialVersionUID = -8373258883174107471L;

			@Override
			public void handleAction(Object sender, Object target) {

				notice();
			}
		});

		phone.focus();

		Button button = new Button("Send");
		button.addClickListener(e -> notice());

		button.addStyleNames(ValoTheme.BUTTON_PRIMARY, ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
		button.setIcon(FontAwesome.SEND);

		VerticalLayout rootlayour = new VerticalLayout(l, phone, button);

		rootlayour.setSizeFull();
		return rootlayour;
	}

}