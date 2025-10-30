package com.gyojincompany.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyojincompany.home.entity.User;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long>{
	 Optional<User> findByUsername(String username);
}
