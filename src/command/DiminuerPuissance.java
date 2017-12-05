package command;

public class DiminuerPuissance implements Command {

    private AppareilElectronique appareilElectronique;
    int val = 10;

    public DiminuerPuissance(AppareilElectronique appareilElectronique, int val) {
        this.appareilElectronique = appareilElectronique;
        this.val = val;
    }

    @Override
    public void execute() {
        appareilElectronique.diminuerLaPuissance(val);
    }

    @Override
    public void undo() {
        appareilElectronique.augmenterLaPuissance(val);
    }
}
