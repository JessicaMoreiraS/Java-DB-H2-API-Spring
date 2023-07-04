package com.example.SpringComDb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringComDb.dto.UserDTO;
import com.example.SpringComDb.entities.User;
import com.example.SpringComDb.repositories.UserRepository;


@Service
public class UserService {
	/*Criar um metodo para chamar a busca do usuario do repository, retornando o UserDTO parao controlador*/
	
	@Autowired
	private UserRepository repository; /*injecao de dependencia*/

	UserDTO userDto = new UserDTO();
	
	@Transactional(readOnly = true) /*deixa a operacao mais rapida porque é uma operacao somente de leitura*/ 
	public UserDTO findById (Long id) {
		User entity = repository.findById(id).get();	
		UserDTO dto = new UserDTO(entity);
		return dto;
	}
	
	public List<UserDTO>findAll() {
		List<User> entityAll = repository.findAll();
		List<UserDTO> dtoAll = userDto.UserDTOAll(entityAll);
		return dtoAll;
	}
}
