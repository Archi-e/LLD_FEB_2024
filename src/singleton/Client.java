package singleton;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getObject();
        System.out.println(s1);   //singleton.Singleton@7b23ec81

        Singleton s2 = Singleton.getObject();
        System.out.println(s2);   //singleton.Singleton@7b23ec81

        Singleton s3 = Singleton.getObject();
        System.out.println(s3);   //singleton.Singleton@7b23ec81

        Singleton s4 = Singleton.getObject();
        System.out.println(s4);   //singleton.Singleton@7b23ec81 : same object for all

        DBconn newDb = DBconn.getObject();
        System.out.println(newDb.connectToDb());
        System.out.println(newDb.connectToDb());
        System.out.println(newDb.connectToDb());
        System.out.println(newDb.connectToDb());
    }
}
