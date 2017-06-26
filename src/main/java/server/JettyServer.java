package server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class JettyServer {
    public static void main(String[] args) {
        final String PACKAGE = "server";
        ResourceConfig config = new ResourceConfig();
        config.packages(PACKAGE);
        config.register(new CORSFilter());
        ServletHolder servlet = new ServletHolder(new ServletContainer(config));
        int port=Integer.parseInt(args[0]);
        Server server = new Server(port);
        ServletContextHandler context = new ServletContextHandler(server, "/*");
        context.addServlet(servlet, "/*");


        try {
                server.start();
                server.join();
        } catch (Exception e) {
                e.printStackTrace();
        } finally {
            server.destroy();
        }
    }
}
