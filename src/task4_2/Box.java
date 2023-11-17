package task4_2;

import java.util.TreeSet;

public class Box implements Shape {
    @Override
    public double getVolume() {
        return volume;
    }

    private final double volume;
    private double currentVolume = 0;
    public TreeSet<Shape> shapes = new TreeSet<>();

    public double getCurrentVolume() {
        return currentVolume;
    }


    public Box(double volume) {
        this.volume = volume;
    }

    public boolean add(Shape shape) {
        if (shape.getVolume() + currentVolume < this.getVolume()) {
            shapes.add(shape);
            currentVolume += shape.getVolume();
            return true;
        }
        return false;
    }
}