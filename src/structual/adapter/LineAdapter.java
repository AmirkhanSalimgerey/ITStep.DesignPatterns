package structual.adapter;

public class LineAdapter implements Shape{
    private Line adaptee;

    public LineAdapter(Line adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw(int x, int y, int z, int j) {
        adaptee.draw(x, y, z, j);
    }
}
