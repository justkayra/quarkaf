package dev.kaira.kafka;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/secured")
@RolesAllowed({"Everyone"})
public class SecureResource {

    @GET
    @Path("/info")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "secure hello";
    }
}
