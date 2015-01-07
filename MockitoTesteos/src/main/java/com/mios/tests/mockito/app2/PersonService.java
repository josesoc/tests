package com.mios.tests.mockito.app2;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

	private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public List<Person> getAllPersons(int var) {
		personDao.fetchPerson(var);
		return new ArrayList<Person>();
	}
}
