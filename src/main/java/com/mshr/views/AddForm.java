package com.mshr.views;

import org.springframework.beans.factory.annotation.Autowired;

import com.mshr.model.Student;
import com.mshr.repo.StudentRepo;
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

public class AddForm extends Composite implements View {

	@Autowired
	private StudentRepo studentRepo;

	String a = "123";

	public AddForm() {
		setCompositionRoot(add());
	}

	private Component add() {
		Label l = new Label("Form");
		l.addStyleName(ValoTheme.BUTTON_LARGE);

		TextField textField = new TextField("User Name");
		textField.focus();
		textField.getDefaultValidator();
		PasswordField passwordField = new PasswordField("Password");

		Button button = new Button("Save");
		button.setIcon(FontAwesome.SAVE);
		button.addStyleNames(ValoTheme.BUTTON_PRIMARY, ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
		button.addClickListener(e -> {

			/*
			 * String userName = textField.getValue(); String pass =
			 * passwordField.getValue();
			 * 
			 * Student s = new Student(userName, pass);
			 */
			studentRepo.save(new Student("Rajub", "12"));

		});

		VerticalLayout layout = new VerticalLayout(l, textField, passwordField, button);

		return layout;
	}

}
