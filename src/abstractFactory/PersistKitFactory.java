package abstractFactory;

public class PersistKitFactory {

    public static PersisitKit getPersistKitInstance(String type){
        switch (type){
            case "JDBC": return new JdbcKit();
            case "SR": return new SrKit();
            default: return null;
        }
    }
}
