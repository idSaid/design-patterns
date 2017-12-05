package command;

public class Eteindre implements Command {

    private AppareilElectronique appareilElectronique;

    public Eteindre(AppareilElectronique appareilElectronique) {
        this.appareilElectronique = appareilElectronique;
    }

    @Override
    public void execute() {
        this.appareilElectronique.eteindre();
    }

    @Override
    public void undo() {
        this.appareilElectronique.allumer();
    }
}
