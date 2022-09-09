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

	
}
