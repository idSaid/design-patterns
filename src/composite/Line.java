package composite;

public class Line implements Graphic {
    @Override
    public void draw() {
        System.out.println("line");
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
