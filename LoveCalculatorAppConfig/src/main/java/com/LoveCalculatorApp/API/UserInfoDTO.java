package com.LoveCalculatorApp.API;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserInfoDTO {

	@NotEmpty(message = "Username is required")
	@Size(min = 5, message = "Username should be at least 5 characters long")
	@Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Username can only contain letters, numbers, and underscores")
	// @NotStartsWithNumber(message = "Username cannot start with a number")
	private String userName;
	@NotEmpty(message = "crushname is required")
	@Size(min = 5, message = "crushname should be at least 5 characters long")
	@Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "crushname can only contain letters, numbers, and underscores")
	// @NotStartsWithNumber(message = "crushname cannot start with a number")
	private String crushName;

	@AssertTrue(message = "agree to terms and conditions")
	private boolean termsAndConditions;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public Boolean getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(Boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + ", termsAndConditions="
				+ termsAndConditions + "]";
	}

}
