package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/novel")
public class novel {
   
	@GET
	@Produces(MediaType.TEXT_XML)
	public String author_XML()
	{
		String response="<?xml version='1.0'?>"+"<author> kanchana</author>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String author_Json()
	{
		String response="<?xml version='1.0'?>"+"<author> kanchana</author>";
		return response;
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("{name}")
	public String author_XML_value(@PathParam("name") String name)
	{
		String response="<?xml version='1.0'?>"+"<author>hello"+name+"</author>";
		return response;
	}

}
