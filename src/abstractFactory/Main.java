package abstractFactory;

public class Main {

    static PersisitKit jdbcKit = PersistKitFactory.getPersistKitInstance("JDBC");
    static PersisitKit srKit = PersistKitFactory.getPersistKitInstance("SR");

    static HighScore jdbcHighScore = jdbcKit.add();
    static HighScore srHighScore = srKit.add();

    public static void main(String[] args){
        System.out.println(jdbcHighScore.iam());
        System.out.println(srHighScore.iam());
    }


}
