public class Circle {
private double radius;
private double circumference;
private double area;

public Circle() {
this(3.1);
}
public Circle(double rad) {
radius = rad;
circumference = getCirc();
area = getArea();
}
public double getRad() {
return radius;
}
public void setRad(double rad) {
radius = rad;
circumference = getCirc();
area = getArea();
}
public double getCirc() {
return (2.0 *radius * Math.PI);
}
public double getArea() {
return(radius * radius * Math.PI);
}
}
