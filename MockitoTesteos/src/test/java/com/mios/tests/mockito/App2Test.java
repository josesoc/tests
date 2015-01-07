package com.mios.tests.mockito;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.mios.tests.mockito.app2.Person;
import com.mios.tests.mockito.app2.PersonDao;
import com.mios.tests.mockito.app2.PersonService;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class App2Test 
{
	private PersonDao personDao;
	private PersonService personService;
	
	@Before
	public void setUp() {
		personDao=mock(PersonDao.class);
		personService=new PersonService();
		personService.setPersonDao(personDao);
	}
	
	@Test
    public void testOne() {
		// pre conditions
    	Person value=new Person(4, "pepe");
    	
    	// setup mock
		when(personDao.fetchPerson(22)).thenReturn(value);	
		
		// service
		List<Person> allPersons = this.personService.getAllPersons(22);
		
		// tearDown mock
		verify(this.personDao).fetchPerson(22);
		
		// post conditions
		assertTrue(allPersons.isEmpty());
    }
}
