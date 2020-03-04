package com.ntpu.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class HealthResource {

    @GET
    @Path("health-check")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHealth() {
        return Response.ok("OK").build();
    }
}
