package com.ecart.usecase.ecartusecasepractice.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecart.usecase.ecartusecasepractice.DTO.UserDTO;
import com.ecart.usecase.ecartusecasepractice.DTO.UserResponseDTO;
import com.ecart.usecase.ecartusecasepractice.model.User;
import com.ecart.usecase.ecartusecasepractice.repository.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserResponseDTO userLogin(UserDTO userDto) {

		UserResponseDTO userResponseDTO = null;
		Optional<User> userResp = userRepository.findByUserNameAndPassword(userDto.getCustomerId(),
				userDto.getPassword());

		if (userResp.isPresent()) {
			userResponseDTO = new UserResponseDTO();
			/*
			 * userResponseDTO.setMessage("Login successfully.");
			 * userResponseDTO.setStatus("Success");
			 * userResponseDTO.setUserId(userResp.get().getCustomerId());
			 */
		}

		return userResponseDTO;
	}

	@Override
	public UserResponseDTO userRegistration(UserDTO userDTO) {

		UserResponseDTO userResponseDTO = null;
		Optional<User> userRegistrationResp = userRepository.save(userDTO);
		/*
		 * userResponseDTO.setMessage("User Registration successfully Created");
		 * userResponseDTO.setStatus("OK");
		 * userResponseDTO.setUserId(userRegistrationResp.get().getCustomerId());
		 */

		return null;
	}

}
