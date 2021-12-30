package com.hitzseb.StockApp.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hitzseb.StockApp.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	@Query("SELECT u FROM User u WHERE u.username = username")
	public User getUserByUserName(@Param("username") String username);
}
