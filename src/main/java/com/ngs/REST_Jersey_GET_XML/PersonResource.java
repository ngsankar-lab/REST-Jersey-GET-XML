package com.ngs.REST_Jersey_GET_XML;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("persons")
public class PersonResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Person> getPersons() {
		System.out.println("Inside get Persons");
		Person p1=new Person();
		p1.setPid(1);
		p1.setPname("Dhruv");
		Person p2=new Person();
		p1.setPid(2);
		p1.setPname("Sreshta");
		
		List<Person> persons =new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		return persons;
				
	}
}
