package overloading;

public class MathFunctions {



    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double abs(double a) {
        if (a < 0) return a * -1;
        return a;
    }

    public static double pow(double a, double b) {
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }



    public static void main(String[] args) {

        System.out.println(add(1, 2));
        System.out.println(sub(1, 2));
        System.out.println(mul(1, 2));
        System.out.println(div(1, 2));
        System.out.println(abs(-1));
        System.out.println(pow(2, 3));
    }
}
