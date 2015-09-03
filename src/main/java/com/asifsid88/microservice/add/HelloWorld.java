package com.asifsid88.microservice.add;

import com.asifsid88.utilities.JSONUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("microservice/add/v1")
public class HelloWorld {

    @GET
    @Produces("application/json")
    @Path("{a}/{b}")
    public Response add(@PathParam("a") int a, @PathParam("b") int b) {
        int result = a + b;
        return Response.status(200).entity(JSONUtils.toJSON(result)).build();
    }
}
