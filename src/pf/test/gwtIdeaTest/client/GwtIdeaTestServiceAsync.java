package pf.test.gwtIdeaTest.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GwtIdeaTestServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
