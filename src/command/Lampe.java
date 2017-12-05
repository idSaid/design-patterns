package command;

public class Lampe implements AppareilElectronique {

    private boolean on = false;
    private int puissance = 0;

    @Override
    public void allumer() {
        System.out.println("Lampe allumée");
        this.on = true;
    }

    @Override
    public void eteindre() {
        System.out.println("Lampe éteinte");
        this.on = false;
    }

    @Override
    public void augmenterLaPuissance(int val) {
        this.puissance = this.puissance + val;
        System.out.println("Puissance : "+this.puissance);
    }

    @Override
    public void diminuerLaPuissance(int val) {
        this.puissance = this.puissance - val;
        System.out.println("Puissance : "+this.puissance);
    }
}
