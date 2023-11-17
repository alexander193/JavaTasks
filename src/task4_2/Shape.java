package task4_2;

interface Shape extends Comparable<Shape> {
    default int compareTo(Shape shape) {
        return Double.compare(getVolume(), shape.getVolume());
    }

    double getVolume();
}
