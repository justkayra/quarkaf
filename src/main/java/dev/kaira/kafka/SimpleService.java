package dev.kaira.kafka;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/public")
public class SimpleService {


    @GET
    @Path("/info")
    public String addPrice(@QueryParam("code") String code, @QueryParam("state") String state ) {
        return "a company info";
    }
}