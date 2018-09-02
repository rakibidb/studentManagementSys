package com.mshr.views;

import com.vaadin.navigator.View;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.datefield.DateResolution;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Composite;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class View1 extends Composite implements View {

	/*
	 * public View1(PageRepo pageRepo) { this.pageRepo = pageRepo; }
	 */

	public View1() {
		setCompositionRoot(pluginmethod());
	}

	private Component pluginmethod() {
		Label l = new Label("Student's Registration Form");
		l.addStyleNames(ValoTheme.BUTTON_LARGE);
		TextField id = new TextField("Id");
		TextField studentName = new TextField("Student name");
		PasswordField password = new PasswordField("Password");
		TextField presentClass = new TextField("What class do you read in");
		DateField dob = new DateField("Date of birth");
		TextField phone = new TextField("Phone No");
		TextField father_name = new TextField("Father name");
		TextField an_in_father = new TextField("An_in_father");
		TextField nationality = new TextField("Nationality");
		TextField gender = new TextField("Gender");
		TextField category = new TextField("Category");
		TextField college_or_school_id = new TextField("School/College code");
		TextField marr_status = new TextField("Married status");
		TextArea present_address = new TextArea("Current address");

		Button button = new Button("Save");
		button.addStyleNames(ValoTheme.BUTTON_PRIMARY, ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
		button.setIcon(FontAwesome.SAVE);

		VerticalLayout rootlayour = new VerticalLayout(l, id, studentName, password, presentClass, dob, phone,
				father_name, an_in_father, nationality, gender, category, college_or_school_id, marr_status,
				present_address, button);

		rootlayour.setSizeFull();

		return rootlayour;
	}
}