package task3_1;

public class task3_1 {
    public static void main(String[] args) {
        System.out.println(solve(0, 10));
    }

    public static double solve(double start, double end) {
        if (end - start < 0.001)
            return start;
        double mid = (start + end) / 2;
        if (function(start) * function(mid) > 0)
            return solve(mid, end);
        else
            return solve(start, mid);
    }

    public static double function(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }
}
