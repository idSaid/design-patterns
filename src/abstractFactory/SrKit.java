package abstractFactory;

public class SrKit implements PersisitKit {
    @Override
    public HighScore add() {
        return new HighScoreSr();
    }

    @Override
    public String whoTheHellAreYou() {
        return "SR";
    }
}
