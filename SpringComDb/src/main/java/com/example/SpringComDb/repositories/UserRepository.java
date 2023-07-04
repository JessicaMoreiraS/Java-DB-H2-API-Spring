/*objeto responsavel por acessar os dados do DB relacionados ao User*/
package com.example.SpringComDb.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.SpringComDb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "SELECT obj FROM User obj WHERE obj.salary >= :minSalary AND obj.salary <= :maxSalary")
	Page<User> searchSalary(@Param("minSalary") Double minSalary, @Param("maxSalary") Double maxSalary, Pageable pageable);
	
	/*O Spring conegue analizar o nome da funcao, desde que escrito corretamente, para realizar
	 * a consulta SQL sem precisar escrever a Query, como no exemplo acima*/
	Page<User> findBySalaryBetween(@Param("minSalary") Double minSalary, @Param("maxSalary") Double maxSalary, Pageable pageable);

	
	/*Com Query*/
	@Query(value = "SELECT obj FROM User obj WHERE LOWER(obj.name) LIKE LOWER(CONCAT('%',:name,'%'))")
	Page<User> searchName(@Param("name") String name, Pageable pageable);
	
	/*Sem Query*/
	Page<User> findByNameContainingIgnoreCase(@Param("name") String name, Pageable pageable);
}
