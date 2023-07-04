package com.example.SpringComDb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/*para que essa classe seja monitorada pelo JPA*/
@Entity

/*Para dar o nome da tabela*/
@Table(name="tb_users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*fazer Id altoincrementavel*/
	private Long id;
	private String name;
	private String password;
	private String email;
	private Double salary;
	
	public User() {
	}

	public User(Long id, String name, String password, String email, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
