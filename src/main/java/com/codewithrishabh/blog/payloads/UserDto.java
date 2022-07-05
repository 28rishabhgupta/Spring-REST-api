package com.codewithrishabh.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {
	
	private int id;
	@NotEmpty
	@Size(min = 4, message="User name should be of 4 characters")
	private String name;
	@Email(message = "Email address is not Valid:::")
	private String email;
	@NotEmpty
	//@Size(min = 4, max = 9, message="Please put passsword atleast of 4 characters")
	@Pattern(regexp = "^[a-zA-Z0-9]{6,12}$",
    message = "username must be of 6 to 12 length with no special characters")
	private String password;
	@NotEmpty
	private String about;

}
