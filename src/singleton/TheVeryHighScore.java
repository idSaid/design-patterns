package singleton;

public class TheVeryHighScore {

    private static TheVeryHighScore uniqueInstance = null;
    int singletonScore;

    static {
        uniqueInstance = new TheVeryHighScore();
    }

    private TheVeryHighScore() {
        singletonScore = 0;
    }

    public static synchronized TheVeryHighScore getUniqueInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new TheVeryHighScore();
        return uniqueInstance;
    }

    public int getSingletonScore() {
        return singletonScore;
    }

    public void setSingletonScore(int singletonScore) {
        this.singletonScore = singletonScore;
    }
}
