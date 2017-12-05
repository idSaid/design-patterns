package command;

public interface AppareilElectronique {

    public void allumer();
    public void eteindre();
    public void augmenterLaPuissance(int val);
    public void diminuerLaPuissance(int val);
}
