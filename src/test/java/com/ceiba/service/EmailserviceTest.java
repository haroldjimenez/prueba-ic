package com.ceiba.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class EmailserviceTest {
	private EmailService emailService;

	@Before
	public void setup() {
		emailService = new  EmailService();
	}
	
	@Test
	public void sendEmailTest() {
		//Arrange
		//Act
		String message = emailService.sendMail("Hector");
		//Assert
		Assert.assertNotNull(message);
	}
}
