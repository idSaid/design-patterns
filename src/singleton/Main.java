package singleton;

public class Main {

    public static void main(String[] args){

        // Not allowed to use the private constructor
        // TheVeryHighScore tvhs = new TheVeryHighScore();

        TheVeryHighScore tvhs1 = TheVeryHighScore.getUniqueInstance();
        TheVeryHighScore tvhs2 = TheVeryHighScore.getUniqueInstance();

        tvhs1.setSingletonScore(5);
        System.out.println(tvhs2.getSingletonScore());

    }

}
