package command;

public class Main {

    public static void main(String[] args){

        AppareilElectronique lampe = new Lampe();;

        Command allumer = new Allumer(lampe);
        Command eteindre = new Eteindre(lampe);
        Command augmenter10 = new AugmenterPuissance(lampe,10);
        Command augmenter20 = new AugmenterPuissance(lampe,20);
        Command diminuer10 = new DiminuerPuissance(lampe,10);

        Telecommande telecommande1 = new Telecommande();
        //Telecommande telecommande2 = new Telecommande();

        telecommande1.addCommand(allumer);
        telecommande1.addCommand(augmenter10);
        telecommande1.addCommand(augmenter20);
        telecommande1.addCommand(diminuer10);

        //telecommande2.addCommand(eteindre);

        telecommande1.invoquer();
        telecommande1.annuler();

        //telecommande2.invoquer();

    }
}
