package task4_2;

public class Cylinder extends SolidOfRevolution {
    double height;
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 2.0 * Math.PI * radius * height;
    }
}