package com.ceiba.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.ceiba.domain.Person;
import com.ceiba.testdatabuilder.PersonTestDataBuilder;


public class NotifyPersonServiceTest {
	private NotifyPersonService notifyPersonService;
	private EmailService emailService;
	
	@Before
	public void setup() {
		emailService =  Mockito.mock(EmailService.class);
		notifyPersonService = new NotifyPersonService(emailService);
	}
	
	@Test
	public void notificationEmailTest() {
		//Arrange
		Person person =  new PersonTestDataBuilder().build();
		Mockito.when(emailService.sendMail(Mockito.anyString())).thenReturn("Hola mundo");
		//Act
		String message = notifyPersonService.notify(person);
		//Assert
		Assert.assertNotNull(message);
	}
    
}
