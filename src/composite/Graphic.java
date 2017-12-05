package composite;

public interface Graphic {
    public void draw();
    public void add(Graphic graphic);
    public void remove(Graphic graphic);
    public Graphic getChild(int id);
}
