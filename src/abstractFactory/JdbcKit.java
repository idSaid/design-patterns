package abstractFactory;

public class JdbcKit implements PersisitKit {
    @Override
    public HighScore add() {
        return new HighScoreJdbc();
    }

    @Override
    public String whoTheHellAreYou() {
        return "JDBC";
    }
}
