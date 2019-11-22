package com.ecart.usecase.ecartusecasepractice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecart.usecase.ecartusecasepractice.DTO.UserDTO;
import com.ecart.usecase.ecartusecasepractice.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findByUserNameAndPassword(String username,String password);
	Optional<User>	save(UserDTO userDto);

}
