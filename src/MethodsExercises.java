public class MethodsExercises {
    public static void main (String[] args) {
        System.out.println("Methods exercise is ready!");
        System.out.println("sum() " + sum(1, 2));
        System.out.println("minus() " + minus(1, 2));
        System.out.println("multiply " + multiply(2, 4));
        System.out.println("divide() " + divide(28, 4));
        System.out.println("modulus() " + modulus(28,5));
    }

    public static int sum ( int num1, int num2 ) {
        return num1 + num2;
    }

    public static int minus ( int num1, int num2 ) {
        return num2 - num1;
    }

    public static int multiply ( int num1, int num2 ) {
        return num1 * num2;
    }

    public static int divide ( int num1, int num2 ) {
        return num1/num2;
    }

    public static int modulus ( int num1, int num2 ) {
        return num1 % num2;
    }


}
