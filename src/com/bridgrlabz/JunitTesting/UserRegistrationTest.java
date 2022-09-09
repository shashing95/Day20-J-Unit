package com.bridgrlabz.JunitTesting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.bridgrlabz.UserRegistrationJ;

class UserRegistrationTest {
	
	UserRegistrationJ userRegistration = new UserRegistrationJ();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Shashi");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
		boolean result = userRegistration.firstName("shashi");
		Assert.assertEquals(false, result);
	}

	
@Test
public void givenLastName_WhenProper_ShouldReturnTrue() {
	boolean result = userRegistration.lastName("Gudasalamani");
	Assert.assertEquals(true, result);
}

@Test
public void givenLastName_WhenNotProper_ShouldReturnFalse() {
	boolean result = userRegistration.lastName("gudasalamani");
	Assert.assertEquals(false, result);

}

@Test
public void givenEmail_WhenProper_ShouldReturnTrue() {
	boolean result = userRegistration.email("shashidharngg@gmail.com");
	Assert.assertEquals(true, result);
}

@Test
public void givenEmail_WhenNotProper_ShouldReturnFalse() {
	boolean result = userRegistration.email("shashidhar&nggn@gmail.com");
	Assert.assertEquals(false, result);
}

@Test
public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
	boolean result = userRegistration.phoneNumber("91 9538639621");
	Assert.assertEquals(true, result);
}

@Test
public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
	boolean result = userRegistration.phoneNumber("919538639621");
	Assert.assertEquals(false, result);
}

@Test
public void givenPassword_WhenProper_ShouldReturnTrue() {
	boolean result = userRegistration.password("shashi@123");
	Assert.assertEquals(true, result);
}

@Test
public void givenPassword_WhenNotProper_ShouldReturnFalse() {
	boolean result = userRegistration.password("shas@22");
	Assert.assertEquals(false, result);
}

@Test
public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
    boolean result = userRegistration.passwordRule2("passWord@123");
    Assert.assertEquals(true, result);
}

@Test
public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
    boolean result = userRegistration.passwordRule2("sng@");
    Assert.assertEquals(false, result);
}

@Test
public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
	boolean result = userRegistration.passwordRule3("shashi@123");
	Assert.assertEquals(true, result);
}

@Test
public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
	boolean result = userRegistration.passwordRule3("shashin@gn");
	Assert.assertEquals(false, result);
}


@Test
public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
	boolean result = userRegistration.password("shashi@123");
	Assert.assertEquals(true, result);
}

@Test
public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
	boolean result = userRegistration.password("shashi22");
	Assert.assertEquals(false, result);
}


@Test
public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
	boolean result = userRegistration.emailIdValidator("abc@abc@gmail.com");
	Assert.assertEquals(false, result);
}

@Test
public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
	boolean result = userRegistration.emailIdValidator("abc..2022@gmail.com");
	Assert.assertEquals(false, result);
}

}