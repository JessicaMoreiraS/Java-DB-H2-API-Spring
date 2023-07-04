/*receber e reponder requisicoes*/
package com.example.SpringComDb.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringComDb.dto.UserDTO;
import com.example.SpringComDb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping(value = "/{id}")
	public UserDTO findById (@PathVariable Long id) {
		return service.findById(id);
	}
	@GetMapping(value="/all")
	public List<UserDTO> findAll(){
		List<UserDTO> result = service.findAll();
		return result;
	}
	
	@GetMapping(value="/page")
	public Page<UserDTO> findAllPag(Pageable pageable){
		List<UserDTO> result = service.findAll();
		Page<UserDTO> page = new PageImpl<>(result, pageable, result.size());
		return page;
	}
}
