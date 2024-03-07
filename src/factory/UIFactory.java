package factory;

import factory.components.button.AndroidButton;
import factory.components.button.Button;
import factory.components.menu.AndroidMenu;
import factory.components.menu.Menu;

public interface UIFactory {
    //UI Factor will contain factor methods: Methods that has sole purpose of creating objects
    Menu createMenu();
    Button createButton();

}
