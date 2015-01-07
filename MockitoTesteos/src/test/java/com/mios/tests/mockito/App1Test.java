package com.mios.tests.mockito;

import org.junit.Test;

import com.mios.tests.mockito.app1.App1;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class App1Test {
	
	private App1 myApp = mock(App1.class);

	@Test
	public void testIfCarIsACar() {
		when(myApp.validacion()).thenReturn(true);
		assertTrue(myApp.validacion());
	}
}
