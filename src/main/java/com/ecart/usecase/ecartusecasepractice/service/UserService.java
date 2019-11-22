package com.ecart.usecase.ecartusecasepractice.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecart.usecase.ecartusecasepractice.DTO.UserDTO;
import com.ecart.usecase.ecartusecasepractice.DTO.UserResponseDTO;

@Service
public interface UserService {

	UserResponseDTO userLogin(@RequestBody UserDTO userDto);

	UserResponseDTO userRegistration(@Valid UserDTO userDTO);

}
