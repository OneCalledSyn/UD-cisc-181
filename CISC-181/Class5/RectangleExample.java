public class Rectangle {
private double length;
private double width;
private double area;
private String fillcolor;

Rectangle() {
length = 1.0;
width = 1.0;
setArea();
fillcolor = "white";
}
Rectangle(double l, double w) {
length = l;
width = w;
setArea();
fillcolor = "white";
}
Rectangle(String s) {
length = 1.0;
width = 1.0;
setArea();
fillcolor = s;
}
private void setArea(){
area = length * width;
}
public void setlen(double l) {
length = l;
setArea();
}
public void setwid(double w) {
width = w;
setArea();
}
public String toString(){
String s="Rect: "+(double)((int)(length*100))/100+", "+(double)((int)(width*100))/100+" Area: "+(double)((int)(area*100))/100;
return s;
}
}
