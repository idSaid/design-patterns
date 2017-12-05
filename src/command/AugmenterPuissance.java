package command;

public class AugmenterPuissance implements Command {

    private AppareilElectronique appareilElectronique;
    int val = 0;

    public AugmenterPuissance(AppareilElectronique appareilElectronique, int val) {
        this.appareilElectronique = appareilElectronique;
        this.val = val;
    }

    @Override
    public void execute() {
        appareilElectronique.augmenterLaPuissance(val);
    }

    @Override
    public void undo() {
        appareilElectronique.diminuerLaPuissance(val);
    }
}
