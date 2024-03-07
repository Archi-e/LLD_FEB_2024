package factory;

import static factory.SupportedPlatforms.ANDROID;
import static factory.SupportedPlatforms.IOS;

public class Flutter {

    //Flutter class will contain fundamental methods
    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    private void collectData(){
        System.out.println("Data is getting collected");
    }

    private void setTheme(){
        System.out.println("Theme is getting set");
    }

    //Add a method to create factory here so that client should not interact with the Factory Method
    public UIFactory createUIFactory(){
        return UIFactoryFactory.getUIFactory(supportedPlatforms);
    }

}
