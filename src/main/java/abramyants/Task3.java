package abramyants;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите оператор (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Деление на ноль невозможно");
                    return;
                }
                break;
            default:
                System.out.println("Неверный оператор");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
