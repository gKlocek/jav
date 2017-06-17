package dupa;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

/**
 * Created by grzes on 20.05.17.
 */
public class Dupa {
    public static void main(String[] args) {
        ResourceConfig config = new ResourceConfig();
        config.packages("dupa");
        config.register(new CORSFilter());
        ServletHolder servlet = new ServletHolder(new ServletContainer(config));

        Server server = new Server(2222);
        ServletContextHandler context = new ServletContextHandler(server, "/*");
        context.addServlet(servlet, "/*");


        try {
            try {
                server.start();
                server.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            server.destroy();
        }
    }
}
