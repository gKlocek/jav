package dupa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("home")
public class Resource {
        @POST
        @Path("post")
        //@Consumes(MediaType.JSON)
        @Consumes(MediaType.APPLICATION_JSON)
       // @Produces(MediaType.TEXT_PLAIN)
        public String function(String json) {
                // http://localhost:2222/home/post
                return "<h2>xD:  " + json + "</h2>";
        }
}
/*
 @POST
@Path("post")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.TEXT_HTML)
public String postMethod(@FormParam("name") String name) {
  return "<h2>Hello, " + name + "</h2>";
}
*/

/*
@Path("home")
public class Resource {

        @GET
        @Path("path/{var}")
        @Produces(MediaType.TEXT_PLAIN)
        public String pathMethod(@PathParam("var") String name) {
                return "Hello, " + name;
        }

}*/