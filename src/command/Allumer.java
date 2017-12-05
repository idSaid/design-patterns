package command;

public class Allumer implements Command {

    private AppareilElectronique appareilElectronique;

    public Allumer(AppareilElectronique appareilElectronique) {
        this.appareilElectronique = appareilElectronique;
    }

    @Override
    public void execute() {
        this.appareilElectronique.allumer();
    }

    @Override
    public void undo() {
        this.appareilElectronique.eteindre();
    }
}
