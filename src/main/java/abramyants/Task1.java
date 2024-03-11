package abramyants;

//Вычисление n-ого треугольного числа и факториала:

public class Task1 {
    public static void main(String[] args) {
        int n = 10; // Замените на нужное значение n

        int triangularNumber = calculateTriangularNumber(n);
        System.out.println("Треугольное число для n = " + n + " равно " + triangularNumber);

        int factorial = calculateFactorial(n);
        System.out.println("Факториал для n = " + n + " равен " + factorial);
    }

    public static int calculateTriangularNumber(int n) {
        return n * (n + 1) / 2;
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}