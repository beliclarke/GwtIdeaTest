package pf.test.gwtIdeaTest.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("GwtIdeaTestService")
public interface GwtIdeaTestService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use GwtIdeaTestService.App.getInstance() to access static instance of GwtIdeaTestServiceAsync
     */
    public static class App {
        private static GwtIdeaTestServiceAsync ourInstance = GWT.create(GwtIdeaTestService.class);

        public static synchronized GwtIdeaTestServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
