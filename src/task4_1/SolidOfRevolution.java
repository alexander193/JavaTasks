package task4_1;

abstract class SolidOfRevolution extends Shape {
    double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

}
