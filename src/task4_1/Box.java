package task4_1;

import java.util.ArrayList;

public class Box extends Shape {
    ArrayList<Shape> shapes = new ArrayList<>();

    public double getCurrentVolume() {
        return currentVolume;
    }

    private double currentVolume = 0;
    public Box(double volume) {
        super(volume);
    }

    boolean add(Shape shape) {
        if (shape.volume + currentVolume < this.volume) {
            shapes.add(shape);
            currentVolume += shape.volume;
            return true;
        }
        return false;
    }
}