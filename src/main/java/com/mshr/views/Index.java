package com.mshr.views;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.PushStateNavigation;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI(path = "/index")
@Title("Student Management Ststem")
@Theme("valo")
@PushStateNavigation
public class Index extends UI {

	@Override
	protected void init(VaadinRequest request) {

		Label title = new Label("Menu");
		title.addStyleName(ValoTheme.MENU_TITLE);

		Button login = new Button("Home", e -> getNavigator().navigateTo("home"));
		login.addStyleNames(ValoTheme.BUTTON_LINK, ValoTheme.MENU_ITEM);

		Button view1 = new Button("Sign up", e -> getNavigator().navigateTo("view1"));
		view1.addStyleNames(ValoTheme.BUTTON_LINK, ValoTheme.MENU_ITEM);

		Button view2 = new Button("Reset Password", e -> getNavigator().navigateTo("view2"));
		view2.addStyleNames(ValoTheme.BUTTON_LINK, ValoTheme.MENU_ITEM);

		Button addForm = new Button("Add Student", e -> getNavigator().navigateTo("addForm"));
		addForm.addStyleNames(ValoTheme.BUTTON_LINK, ValoTheme.MENU_ITEM);

		Button view3 = new Button("grid layout", e -> getNavigator().navigateTo("view3"));
		view3.addStyleNames(ValoTheme.BUTTON_LINK, ValoTheme.MENU_ITEM);

		CssLayout menu = new CssLayout(title, login, view2, addForm, view3);
		menu.addStyleName(ValoTheme.MENU_ROOT);

		CssLayout viewContainer = new CssLayout();

		HorizontalLayout mainLayout = new HorizontalLayout(menu, viewContainer);
		mainLayout.setSizeFull();

		setContent(mainLayout);

		Navigator navigator = new Navigator(this, viewContainer);
		navigator.addView("", DefaultView.class);
		navigator.addView("home",
				DefaultView.class);/*
									 * navigator.addView("view1", View1.class);
									 */
		navigator.addView("view2", View2.class);
		navigator.addView("addForm", AddForm.class);
		navigator.addView("view3", View3.class);

	}

}
