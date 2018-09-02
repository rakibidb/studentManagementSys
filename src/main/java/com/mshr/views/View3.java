package com.mshr.views;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.repository.SelectiveStats;

import com.mshr.model.Student;
import com.mshr.repo.StudentRepo;
import com.vaadin.event.ShortcutListener;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.event.ShortcutAction.ModifierKey;
import com.vaadin.navigator.View;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.Column;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.SelectiveRenderer;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.renderers.NumberRenderer;
import com.vaadin.ui.renderers.ProgressBarRenderer;
import com.vaadin.ui.themes.ValoTheme;

import scala.annotation.meta.setter;

public class View3 extends Composite implements View {

	@Autowired
	private StudentRepo studentRepo;

	public View3() {
		setCompositionRoot(pluginmethod());
	}

	private Component pluginmethod() {

		Label l1 = new Label("Form");
		l1.addStyleName(ValoTheme.BUTTON_LARGE);

		Label l = new Label("Grid");
		l.addStyleName(ValoTheme.BUTTON_LARGE);

		/* Grid<Student> grid = new Grid<>(); */

		/* grid.setItems(studentRepo.findAll()); */

		RichTextArea textArea = new RichTextArea();
		textArea.addShortcutListener(new ShortcutListener("  ", KeyCode.ENTER, null) {

			/**
			 * 
			 */
			private static final long serialVersionUID = -8373258883174107471L;

			@Override
			public void handleAction(Object sender, Object target) {
				// TODO Auto-generated method stub
				Notification.show("Shortcut handle action");
			}
		});

		textArea.focus();

		// grid object
		Grid<Student> grid = new Grid<Student>(Student.class);
		grid.setColumnReorderingAllowed(true);

		// Save data
		grid.setItems(
				new Student(1, "Rakib", "123", "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
						"Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
						"savar,Dhaka"),
				new Student(2, "Sakib", "789", "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
						"Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
						"savar,Dhaka"),
				new Student(3, "Aakib", "456", "class 13", new Date(), "01688211511", "MD Mizanur Rahman", "Teacher",
						"Bangladeshi", "Male", "Business Study", "4500", "none", "Uttor dendabor", "Uttor dendabor",
						"savar,Dhaka")

		);

		// for serial maintain
		grid.setColumnOrder("id", "stu_name", "password", "present_class", "date_of_birth", "phone_number",
				"father_name", "an_in_father", "nationality", "gender", "category", "college_or_school_id",
				"marr_status", "present_address", "permanent_address", "city");

		// overriding of column header
		grid.getColumn("stu_name").setCaption("Students Name");
		grid.getColumn("present_class").setCaption("Read in");
		grid.getColumn("date_of_birth").setCaption("DOB");
		grid.getColumn("marr_status").setCaption("married");
		grid.getColumn("college_or_school_id").setCaption("ENII");

		// for hidden some columns
		grid.removeColumn("category");
		grid.removeColumn("date_of_birth");
		grid.removeColumn("password");
		grid.removeColumn("an_in_father");
		grid.removeColumn("present_address");
		grid.removeColumn("permanent_address");

		// freze some columns
		grid.setFrozenColumnCount(0);

		Button button = new Button("Print", e -> Notification.show("this is: " + grid.getBodyRowHeight()));

		button.addStyleNames(ValoTheme.BUTTON_PRIMARY, ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
		button.setIcon(FontAwesome.PRINT);

		VerticalLayout rootlayour = new VerticalLayout(l1, l, grid, button);

		rootlayour.setSizeFull();
		return rootlayour;
	}

}