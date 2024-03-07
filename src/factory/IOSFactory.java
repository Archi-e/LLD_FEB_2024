package factory;

import factory.components.button.IOSButton;
import factory.components.menu.IOSMenu;

public class IOSFactory implements UIFactory{
    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }
}
