package factory;

import factory.components.button.Button;
import factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new Flutter(SupportedPlatforms.IOS);
        UIFactory factory = flutter.createUIFactory();

        Button button = factory.createButton();
        Menu menu = factory.createMenu();


    }
}
