package br.com.kontopp.APIJAVA.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String nameUser;
	
	@Column
	int ageUser;
	
	@Column
	String dateBirth;
	
	@Column
	String usersGender;
	
	public User() {
		super();
	}

	public User(String nameUser, int ageUser, String dateBirth, String usersGender) {
		super();
		this.nameUser = nameUser;
		this.ageUser = ageUser;
		this.dateBirth = dateBirth;
		this.usersGender = usersGender;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public int getAgeUser() {
		return ageUser;
	}

	public void setAgeUser(int ageUser) {
		this.ageUser = ageUser;
	}

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getUsersGender() {
		return usersGender;
	}

	public void setUsersGender(String usersGender) {
		this.usersGender = usersGender;
	}

	public int getId() {
	return id;
	
	}

	public void setId(int id) {
	this.id = id;
	
	}
	
}
