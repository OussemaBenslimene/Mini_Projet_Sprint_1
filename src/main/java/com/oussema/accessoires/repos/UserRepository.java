package com.oussema.accessoires.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oussema.accessoires.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
}
