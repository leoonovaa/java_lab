package lab;

public class lab2_1 {
    public static void main(String[] args) {
        // завдання 1
        int a = 16;
        int b = 5;
        int division = a / b;
        int remainder = a % b;
        System.out.println("завдання 1:");
        System.out.println("результат: " + division);
        System.out.println("залишок від ділення: " + remainder);

        // завдання 2
        int num1 = 24;
        int first = num1 / 10;
        int second = num1 % 10;
        int sum = first + second;
        System.out.println("завдання 2:");
        System.out.println("сума цифр числа " + num1 + ": " + sum);

        // завдання 3
        double num2 = 7.6;
        long rounded = Math.round(num2);
        System.out.println("завдання 3:");
        System.out.println("округлене число " + num2 + " до найближчого цілого: " + rounded);
    }
}