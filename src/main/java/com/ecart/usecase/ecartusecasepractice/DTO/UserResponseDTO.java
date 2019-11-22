package com.ecart.usecase.ecartusecasepractice.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserResponseDTO {

	private String status;
	private String message;
	private String userName;
	private int userId;
	

}
