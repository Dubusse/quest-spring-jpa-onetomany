package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.*;

import java.sql.Date;


@Entity
public class Wizard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private Date birthday;
    private String birth_place;
    private String biography;
    private boolean muggle;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH, targetEntity = School.class)
    @JoinColumn(name = "school_id")
    private School school;

    public Wizard() {

    }

	public Wizard(Long id, String firstName, String lastName, Date birthday, String birthPlace, String biography,
			boolean muggle) {
		super();
		this.id = id;
		this.first_name = firstName;
		this.last_name = lastName;
		this.birthday = birthday;
		this.birth_place = birthPlace;
		this.biography = biography;
		this.muggle = muggle;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return first_name;
	}


	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}


	public String getLastName() {
		return last_name;
	}


	public void setLastName(String lastName) {
		this.last_name = lastName;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getBirthPlace() {
		return birth_place;
	}


	public void setBirthPlace(String birthPlace) {
		this.birth_place = birthPlace;
	}


	public String getBiography() {
		return biography;
	}


	public void setBiography(String biography) {
		this.biography = biography;
	}


	public boolean isMuggle() {
		return muggle;
	}


	public void setMuggle(boolean muggle) {
		this.muggle = muggle;
	}


	public School getSchool() {
		return school;
	}


	public void setSchool(School school) {
		this.school = school;
	}


	public String getBirth_place() {
		return birth_place;
	}


	public void setBirth_place(String birth_place) {
		this.birth_place = birth_place;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


}