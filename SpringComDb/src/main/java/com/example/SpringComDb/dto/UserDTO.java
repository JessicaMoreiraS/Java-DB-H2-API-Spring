/*Objeto de trafegar dados do Usuario*/
package com.example.SpringComDb.dto;

import com.example.SpringComDb.entities.User;

public class UserDTO {

	/*nao poe a senha para nao expor a senha do usuario pois esse objeto vai ser exposto*/
	private Long id;
	private String name;
	
	public UserDTO() {
	}

	public UserDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public UserDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
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
}
