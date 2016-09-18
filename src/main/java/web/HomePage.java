package web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

public class HomePage extends WebPage {
    private static final long serialVersionUID = 4446734116832840538L;
    private Label helloWorld;

    public HomePage() {
        helloWorld = new Label("helloWorld", Model.of("Hello World"));
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();
        
        this.add(helloWorld);
    }
}
