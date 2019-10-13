abstract class GraphicObject {
    protected int x,y;
    protected String color;

    public void moveTo (int newX, int newY) {
        penup();
        goto(x,y)
    }

    public abstract void draw();
    public abstract void resize(int x);
}