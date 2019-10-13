class Rectangle extends GraphicObject {
   int length;
   int width;

    public void draw() {
        pendown()
	    forward(length);
	    rotate(90);
	    forward(width);
	    rotate(90);
	    forward(length);
	    rotate(90);
	    forward(width);
	    rotate(90);
    }

    public void resize(int x) {
        length = length * ((double)x/100);
        width = width * ((double)x/100);
    }
}
