package com.rest.service.restful;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.rest.service.model.Person;

@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/peopleservice")
public interface PeopleRest {
	
	@Path("/people")
	@GET
	List<Person> getPeople();

	@Path("/people/{id}")
	@GET
	Person getPerson(@PathParam("id") int id);

	@Path("/people")
	@POST
	Response createPatient(Person person);


}