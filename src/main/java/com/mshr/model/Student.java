package com.mshr.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import com.vaadin.annotations.AutoGenerated;

@Entity
public class Student {

	@Id 
	private Integer id;

	private String stu_name;

	private String password;

	private String present_class;

	private Date date_of_birth;

	private String phone_number;

	private String father_name;

	private String an_in_father;

	private String nationality;

	private String gender;

	private String category;

	private String college_or_school_id;

	private String marr_status;

	private String present_address;

	private String permanent_address;

	private String city;

	public Student() {

	}

	public Student(String stu_name, String password) {
		this.stu_name = stu_name;
		this.password = password;
	}

	public Student(Integer id, String stu_name, String password, String present_class, Date date_of_birth,
			String phone_number, String father_name, String an_in_father, String nationality, String gender,
			String category, String college_or_school_id, String marr_status, String present_address,
			String permanent_address, String city) {
		this.id = id;
		this.stu_name = stu_name;
		this.password = password;
		this.present_class = present_class;
		this.date_of_birth = date_of_birth;
		this.phone_number = phone_number;
		this.father_name = father_name;
		this.an_in_father = an_in_father;
		this.nationality = nationality;
		this.gender = gender;
		this.category = category;
		this.college_or_school_id = college_or_school_id;
		this.marr_status = marr_status;
		this.present_address = present_address;
		this.permanent_address = permanent_address;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPresent_class() {
		return present_class;
	}

	public void setPresent_class(String present_class) {
		this.present_class = present_class;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getAn_in_father() {
		return an_in_father;
	}

	public void setAn_in_father(String an_in_father) {
		this.an_in_father = an_in_father;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCollege_or_school_id() {
		return college_or_school_id;
	}

	public void setCollege_or_school_id(String college_or_school_id) {
		this.college_or_school_id = college_or_school_id;
	}

	public String getMarr_status() {
		return marr_status;
	}

	public void setMarr_status(String marr_status) {
		this.marr_status = marr_status;
	}

	public String getPresent_address() {
		return present_address;
	}

	public void setPresent_address(String present_address) {
		this.present_address = present_address;
	}

	public String getPermanent_address() {
		return permanent_address;
	}

	public void setPermanent_address(String permanent_address) {
		this.permanent_address = permanent_address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}