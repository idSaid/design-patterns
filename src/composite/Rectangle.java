package composite;

public class Rectangle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Rectangle");
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
