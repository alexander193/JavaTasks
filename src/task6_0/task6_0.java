package task6_0;

public class task6_0 {
    public static void main(String[] args) {
        double celsiusValue = 20;
        System.out.println(new CelsiusConverter().convert(celsiusValue));
        System.out.println(new FahrenheitConverter().convert(celsiusValue));
        System.out.println(new KelvinConverter().convert(celsiusValue));
    }
}

class CelsiusConverter implements Converter {
    @Override
    public double convert(double celsiusValue) {
        return celsiusValue;
    }
}

class FahrenheitConverter implements Converter {
    @Override
    public double convert(double celsiusValue) {
        return celsiusValue * 1.8 + 32;
    }
}

class KelvinConverter implements Converter {
    @Override
    public double convert(double celsiusValue) {
        return celsiusValue + 273.15;
    }
}
