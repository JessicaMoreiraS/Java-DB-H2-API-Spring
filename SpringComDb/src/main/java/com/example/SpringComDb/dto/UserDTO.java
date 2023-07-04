/*Objeto de trafegar dados do Usuario*/
package com.example.SpringComDb.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

import com.example.SpringComDb.entities.User;

public class UserDTO {

	/*nao poe a senha para nao expor a senha do usuario pois esse objeto vai ser exposto*/
	private Long id;
	private String name;
	private String email;
	private Double salary;
	
	public UserDTO() {
	}

	public UserDTO(Long id, String name, String email, Double salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public UserDTO(User user){
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
		this.salary = user.getSalary();
	}
	
	
	public List<UserDTO> UserDTOAll(List<User> usuarios) {
		List<UserDTO> usuariosDTO = new ArrayList<>();
		int max = usuarios.size();
		for(int i=0; i<max; i++) {
			UserDTO pessoaDTO = new UserDTO(usuarios.get(i));
			usuariosDTO.add(pessoaDTO);
		}
		return usuariosDTO;
	}
	
	
	public List<UserDTO> UserDTOConvertToDTO (Page<User> userSalary){
		List<User> usuarios = userSalary.getContent();
		List<UserDTO> result = UserDTOAll(usuarios);
		return result;
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
