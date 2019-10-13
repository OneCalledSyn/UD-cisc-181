class Circle {
    /**Data field*/
    double radius = 1.0;

    /**Constructor for a Circle object*/
    Circle() {

    }

    /**Constructor for a Circle object*/
    Circle(double newRadius) {
        radius = newRadius;
    }

    /**Method to return area of this circle*/
    double getArea() {
        return(radius*radius*Math.PI);
    }
}