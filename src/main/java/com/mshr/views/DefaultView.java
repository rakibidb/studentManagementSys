package com.mshr.views;

import com.vaadin.navigator.View;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class DefaultView extends Composite implements View {

	// in mocel class , password return type is String
	String a = "123";

	public DefaultView() {
		setCompositionRoot(myMenuBar());

	}

	public Component myMenuBar() {
		Label l = new Label("Login page");
		l.addStyleName(ValoTheme.BUTTON_LARGE);

		TextField textField = new TextField("User ID");
		textField.focus();
		textField.getDefaultValidator();
		PasswordField passwordField = new PasswordField("Password");

		Button button = new Button("Login");
		button.setIcon(FontAwesome.SIGN_IN);
		button.addStyleNames(ValoTheme.BUTTON_PRIMARY, ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
		button.addClickListener(e -> {

			if (passwordField.getValue() == null || passwordField.getValue() == "") {

				Notification.show("Password null", Notification.TYPE_ERROR_MESSAGE);
			}

			else if (passwordField.getValue().equals(a)) {

				Notification.show("Welcome,  Rakib");
			}

			else {
				Notification.show("Password not matched", Notification.TYPE_WARNING_MESSAGE);
			}

		});

		VerticalLayout layout = new VerticalLayout(l, textField, passwordField, button);

		return layout;
	}

}