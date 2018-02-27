package com.sudaksha.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/welcome")
public class WelcomeService {
	@GET
	@Path("/{name}")
	public String sayHello(@PathParam("name")String name)
	{
		return "Welcome to "+name;
	}

}
