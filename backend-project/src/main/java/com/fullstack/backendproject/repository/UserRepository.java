package com.fullstack.backendproject.repository;

import com.fullstack.backendproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
	

}
