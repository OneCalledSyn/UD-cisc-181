class Circle extends GraphicObject {
    int radius;

    public void draw() {
        pendown();
        drawCircle(radius);
    }

    public void resize (int x) {
        eraseCircle(radius);
        radius = radius + radius*((double x)/100);
        drawCircle(radius);
    }
}