package server;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("home")
public class Resource {
    @POST
    @Path("post")
    @Consumes(MediaType.APPLICATION_JSON)
    public String function(String json) {
        return "<h2> " + json + "</h2>";
    }

    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "<h2> PONG </h2>";
    }
}
