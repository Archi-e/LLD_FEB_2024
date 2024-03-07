package factory;

import factory.components.button.AndroidButton;
import factory.components.menu.AndroidMenu;

//import java.awt.*;


public class AndroidUIFactory implements UIFactory{

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }
}
