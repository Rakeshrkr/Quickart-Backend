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
	@Id
	private String userId;
	// @Pattern(regexp="[^0-9]^", message = "Name can not contain digits.")
	@Size(min = 3, max = 30, message = "Please enter a value for Name field between {2} and {1} character.")
	private String fullName;
	@NotNull
	@Email(message = "Please enter valid email address")
	private String email;
	@Size(min = 3, max = 20, message = "Password must between 3 and 20 characters")
	private String password;
	@NotEmpty
	private String mobilenumber;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Past(message = "Please enter valid date of birth!")
	private Date birthDate;
	private String country;
	private String gender;
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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
