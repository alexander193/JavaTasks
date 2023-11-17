package task4;

public class Cylinder extends SolidOfRevolution {
    double height;
    public Cylinder(double volume, double height, double radius) {
        super(2.0 * Math.PI * radius * height, radius);
        this.height = height;
        this.radius = radius;
    }
}