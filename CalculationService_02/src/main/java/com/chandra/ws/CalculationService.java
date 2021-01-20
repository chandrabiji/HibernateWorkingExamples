package com.chandra.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/calc")
public class CalculationService {
	
	@GET
	@Path("/add/{i}/{j}")
	public String add(@PathParam("i")int i,@PathParam("j")int j) {
		return "Result = "+(i+j);
	}
	
	@GET
	@Path("/sub/{i}/{j}")
	public String sub(@PathParam("i")int i, @PathParam("j")int j) {
		return "Result = "+(i-j);
	}
	
	@GET
	@Path("/mul/{i}/{j}")
	public String mul(@PathParam("i")int i, @PathParam("j")int j) {
		return "Result = "+(i*j);
	}

}
