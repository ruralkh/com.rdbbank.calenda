package com.rdbbank.calenda.models.secusers;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rdbbank.calenda.models.base.BaseEntity;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

import javax.persistence.*;
import java.util.Set;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */

@Entity
@Table(name = "sec_user")
public class SecUser extends BaseEntity{
	private String email;

	private String password;

	private String name;

	private String lastName;

	private String gender;

	private Integer active;

	private String imageName;

	private Set<SecRole> roles;

	private String realImageUrl;

	@Column(name = "email")
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@Column(name = "password")
	@Length(min = 5, message = "*Your password must have at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	@Transient
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name")
	@NotEmpty(message = "*Please provide your name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "last_name")
	@NotEmpty(message = "*Please provide your last name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "active")
	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Column(name = "image_name")
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	public Set<SecRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<SecRole> roles) {
		this.roles = roles;
	}

	public SecUser() {
	}

	@Column(name = "real_image_url")
	public String getRealImageUrl() {
		return realImageUrl;
	}

	public void setRealImageUrl(String realImageUrl) {
		this.realImageUrl = realImageUrl;
	}
}
