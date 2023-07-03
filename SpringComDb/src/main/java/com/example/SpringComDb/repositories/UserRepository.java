/*objeto responsavel por acessar os dados do DB relacionados ao User*/
package com.example.SpringComDb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringComDb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
