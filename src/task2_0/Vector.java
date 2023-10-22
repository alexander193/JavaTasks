package task2_0;

public class Vector {

    private final double coordX;
    private final double coordY;
    private final double coordZ;

    public Vector(double coordX, double coordY, double coordZ) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.coordZ = coordZ;
    }

    public double length() {
        return Math.sqrt(coordX * coordX + coordY * coordY + coordZ * coordZ);
    }
    public double scalarProduct(Vector vector) {
        return vector.coordX * coordX + vector.coordY * coordY + vector.coordZ * coordZ;
    }

    public Vector crossProduct(Vector vector) {
        return new Vector(
                vector.coordY * coordZ - vector.coordZ * coordY,
                vector.coordZ * coordX - vector.coordX * coordZ,
                vector.coordX * coordY - vector.coordY * coordX
        );
    }

    public double cos(Vector vector) {
        return this.scalarProduct(vector) / (Math.abs(this.length() * vector.length()));
    }

    public Vector sum(Vector vector) {
        return new Vector(
                coordX + vector.coordX,
                coordY + vector.coordY,
                coordZ + vector.coordZ
        );
    }

    public Vector subtract(Vector vector) {
        return new Vector(
                coordX - vector.coordX,
                coordY - vector.coordY,
                coordZ - vector.coordZ
        );
    }

    public static Vector[] generate(int N) {
        Vector[] vectors = new Vector[N];
        for (int i = 0; i < N; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
    @Override
    public String toString() {
        return "Vector {" +
                "x = " + coordX +
                ", y = " + coordY +
                ", z = " + coordZ +
                '}';
    }
}
