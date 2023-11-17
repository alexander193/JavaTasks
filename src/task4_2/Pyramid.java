package task4_2;

public class Pyramid implements Shape {
    double heigth;
    double s; // Площадь основания пирамиды
    public Pyramid(double heigth, double s) {
        this.heigth = heigth;
        this.s = s;
    }

    @Override
    public double getVolume() {
        return heigth * s * 3/4;
    }
}