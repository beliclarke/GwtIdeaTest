package pf.test.gwtIdeaTest.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Petr Fiser
 */
public class Login extends Composite {

    interface LoginUiBinder extends UiBinder<Widget, Login> {
    }

    private static LoginUiBinder ourUiBinder = GWT.create(LoginUiBinder.class);

    public Login() {
        initWidget(ourUiBinder.createAndBindUi(this));
        textBox.setText("initial 17:53");
        button.setText("Hi");
    }

    @UiField
    TextBox textBox;

    @UiField
    Button button;

    @UiHandler("button")
    void handle(ClickEvent clickEvent) {
        System.out.println("Login.handle");
    }

}