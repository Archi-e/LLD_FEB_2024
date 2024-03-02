package singleton;

public class DBconn {
    private static DBconn instance;  //using singleton because if we create a new object everytime
    // the noOfConnections will initially be zero and thus it will always be less than limit which defeats the purpose
    private final int limit = 3;
    private int noOfConnections =0;
    private DBconn(){

    }

    public static DBconn getObject(){
        if(instance == null) instance = new DBconn();
        return instance;
    }

    public boolean connectToDb(){
        if(noOfConnections < limit){
            noOfConnections++;
            return true;
        }
        return false;
    }


}
