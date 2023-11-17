package task4_0;

public class Pyramid extends Shape {
    double heigth;
    double s; // Площадь основания пирамиды
    public Pyramid(double heigth, double s) {
        super(heigth * s * 3/4);
        this.heigth = heigth;
        this.s = s;
    }
}