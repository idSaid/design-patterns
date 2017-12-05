package composite;

public class Text implements Graphic {
    @Override
    public void draw() {
        System.out.println("Text");
    }

    @Override
    public void add(Graphic graphic) {

    }

    @Override
    public void remove(Graphic graphic) {

    }

    @Override
    public Graphic getChild(int id) {
        return null;
    }

}
