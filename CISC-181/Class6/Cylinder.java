public class Cylinder extends Circle {
    private double height; //Private field in subclass, just for Cylinder objects

    public Cylinder(double radius, double h) { //Constructor
        super(radius);  //radius is from the superclass, this invokes the superclass' constructor
        height = h;
    }

    public Cylinder (double h) {
        super();
        height = h;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double h) {
        height = h;
    }
    public double getVolume() {
        return getArea()*height;   // Use Circle's getArea()
    }
}

public static void main(String[] args) {
    Circle x = new Circle(4.2);
    System.out.format("Circle Area: %5.2f\n", x.getArea());
    System.out.format("Circle Circumference: %5.2f\n",x.getCirc());
    Cylinder y = new Cylinder(3.0, 2.0);
    System.out.format("Cylinder Area: %5.2f\n",y.getArea());
    System.out.format("Cylinder Circumference: %5.2f\n",y.getCirc());
    System.out.format("Cylinder Volume: %5.2f\n",y.getVolume());
}
