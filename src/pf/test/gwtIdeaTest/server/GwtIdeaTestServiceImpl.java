package pf.test.gwtIdeaTest.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import pf.test.gwtIdeaTest.client.GwtIdeaTestService;

public class GwtIdeaTestServiceImpl extends RemoteServiceServlet implements GwtIdeaTestService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}