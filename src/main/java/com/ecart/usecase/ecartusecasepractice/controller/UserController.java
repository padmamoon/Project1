package com.ecart.usecase.ecartusecasepractice.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecart.usecase.ecartusecasepractice.DTO.UserDTO;
import com.ecart.usecase.ecartusecasepractice.DTO.UserResponseDTO;
import com.ecart.usecase.ecartusecasepractice.service.UserService;

@RestController
@RequestMapping("/ecart")
public class UserController {
	
	
			@org.springframework.beans.factory.annotation.Autowired(required=true)
			private UserService userService;
			
	/*
	 * @Autowired private ProductService productService;
	 */
			
			Logger logger = LoggerFactory.getLogger(UserController.class);
			
			@PostMapping("/login")
			public ResponseEntity<UserResponseDTO> userLogin(@Valid @RequestBody UserDTO userDTO) {
				
				logger.info("INSIDE USER LOGIN");
				UserResponseDTO userResponseDTO = userService.userLogin(userDTO);
				
				return new ResponseEntity<>(userResponseDTO,HttpStatus.CREATED);
			}
			
			@PostMapping("/userRegistration")
			public ResponseEntity<UserResponseDTO> userRegistration(@Valid @RequestBody UserDTO userDTO) {
				
				logger.info("INSIDE USER LOGIN");
				UserResponseDTO userResponseDTO = userService.userRegistration(userDTO);
				
				return new ResponseEntity<>(userResponseDTO,HttpStatus.CREATED);
			}
			
				
	/*
	 * @GetMapping("/getProducts") public ResponseEntity<List<ProductDTO>>
	 * getProducts() {
	 * 
	 * logger.info(" :: getProducts ----");
	 * 
	 * return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK); }
	 */
	 
			
}
