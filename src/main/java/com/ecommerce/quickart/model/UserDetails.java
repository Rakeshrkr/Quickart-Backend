package com.ecommerce.quickart.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
@Table(name="USERDETAILS")
@Component
public class UserDetails {
	
	// @Pattern(regexp="[^0-9]^", message = "Name can not contain digits.")
	/*@Size(min = 3, max = 30, message = "Please enter a value for Name field between {2} and {1} character.")*/
	/*@NotNull
	@Email(message = "Please enter valid email address")*/
	/*@Size(min = 3, max = 20, message = "Password must between 3 and 20 characters")*/
	/*@Past(message = "Please enter valid date of birth!")*/
	
	
	@Id
	private String userId;
	private String fullName;
	private String email;
	private String password;
	@NotEmpty
	private String mobileNumber;
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	private Date dOB;
	private String address;
	/*private String gender;*/
	private String roleId;
	
	
	public UserDetails() {
		super();
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String rollId) {
		this.roleId = rollId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/*public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}*/

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getdOB() {
		return dOB;
	}
	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}
	

}
