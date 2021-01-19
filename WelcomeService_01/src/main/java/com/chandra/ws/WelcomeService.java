package com.chandra.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class WelcomeService {

	@GET
	@Path("/{msg}")
	public Response getMessage(@PathParam("msg")String msg) {
		String output = "Welcome to Restful WebServices Mr. "+msg;
		return Response.status(200).entity(output).build();
	}
}
