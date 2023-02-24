package com.fieb.tcc.academicologin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))	
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long d;
	private String firstName;
	private String lastName;
	
	private String email;
	private String password;
}	