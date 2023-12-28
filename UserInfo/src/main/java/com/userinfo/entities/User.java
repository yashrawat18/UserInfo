package com.userinfo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String Firstname;
	private String SecondName;
	private String Address;
	private String gender;
	private String state;
	private String country;
	private String about;
	private String hobbies;	
	
}
