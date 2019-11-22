package com.ecart.usecase.ecartusecasepractice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "user")
@ApiModel(description="All details about the user. ")
public class User implements Serializable{
	
	@ApiModelProperty(notes = "customerId")
	private int customerId ;
	
	@ApiModelProperty(notes = "username")
	private String username ;
	
	@ApiModelProperty(notes = "email")
	private String email ;
	
	@ApiModelProperty(notes = "password")
	private String password;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_Id", nullable = false)
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	@Column(name = "pass_word", nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
