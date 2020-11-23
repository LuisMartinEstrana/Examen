package Covid19Manager;

import com.sun.net.httpserver.HttpServer;
import com.sun.tools.javac.Main;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;


public class TestComponentes {

    private HttpServer server;
    private WebTarget target;

    @Before
    public void setUp() throws Exception {
        server = Main.startServer();
        Client c = ClientBuilder.newClient();
        target = c.terget(Main.BASE_URI);
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }

    @Test
    public void

}
