package overloading;

public class MathFunctions {



    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double abs(double a) {
        if (a < 0) return a * -1;
        return a;
    }

    public double pow(double a, double b) {
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }



    public static void main(String[] args) {
        MathFunctions math = new MathFunctions();
        System.out.println(math.add(1, 2));
        System.out.println(math.sub(1, 2));
        System.out.println(math.mul(1, 2));
        System.out.println(math.div(1, 2));
        System.out.println(math.abs(-1));
        System.out.println(math.pow(2, 3));
    }
}
