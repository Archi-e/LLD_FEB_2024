package singleton;

public class Singleton {
    //create a variable to store the Object reference
    private static Singleton instance;  //need to keep it static as we will access this in static method

    //make the constructor private so that we can limit object creation
    private Singleton(){

    }

    //need some method to access constructor, also we won't have object so make it class level: use static
    public static Singleton getObject(){
        //if no object is there, allow creation
        if(instance == null) instance = new Singleton();
        //if object is already there, return it
        return instance;
    }
}
