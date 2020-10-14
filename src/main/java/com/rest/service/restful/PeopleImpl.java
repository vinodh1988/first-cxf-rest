package com.rest.service.restful;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.rest.service.model.Person;

@Service
public class PeopleImpl implements PeopleRest{
private List<Person> people = new ArrayList<Person>();

{
	  
      people.add(new Person(1,"Rajan","Mumbai"));
      people.add(new Person(2,"Kevin","Chennai"));
      people.add(new Person(3,"Subhash","Mumbai"));
}
	@Override
	public List<Person> getPeople() {
		// TODO Auto-generated method stub
		return people;
	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return people.get(id-1);
	}

	@Override
	public Response createPatient(Person person) {
		// TODO Auto-generated method stub
		people.add(person);
		return Response.ok(person).build();
	}

}
