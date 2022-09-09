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
}