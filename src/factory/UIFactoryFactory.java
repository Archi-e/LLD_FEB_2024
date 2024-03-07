package factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(SupportedPlatforms supportedPlatforms){
        switch(supportedPlatforms){
            case ANDROID: return new AndroidUIFactory();
            case IOS: return new IOSFactory();
        }
        return null;
    }
}
