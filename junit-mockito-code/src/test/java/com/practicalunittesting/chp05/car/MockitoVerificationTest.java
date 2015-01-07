package com.practicalunittesting.chp05.car;

import org.junit.Test;
//import org.mockito.internal.verification.AtLeast;
//import org.mockito.verification.VerificationMode;

import static org.mockito.Mockito.*;

//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MockitoVerificationTest {

	private Car myFerrari = mock(Car.class);

	@Test
	public void testVerification() {
		myFerrari.driveTo("Sweet home Alabama");
		myFerrari.needsFuel();
		myFerrari.needsFuel();

		verify(myFerrari).driveTo("Sweet home Alabama");
		
		//verifica que se ha invocado una sola vez 
		//verify(myFerrari).needsFuel();
		
		//verifica que se ha invocado dos veces
		verify(myFerrari, times(2)).needsFuel();
		
		//verifica que se ha invocado al menos una vez
		verify(myFerrari, atLeast(1)).needsFuel();
		
		/*
		 * verify(mock, atLeast(2)).someMethod("was called at least twice");
 		   verify(mock, times(3)).someMethod("was called exactly three times");
		 */
	}
}
