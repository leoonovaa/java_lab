package lab;

public class lab2_2 {
    public static void main(String[] args) {
        // завдання 1
        int n = 120;
        System.out.println("завдання 1:");
        if (n > 25 && n < 100) {
            System.out.println("число " + n + " міститься в проміжку (25; 100)");
        } else {
            System.out.println("число " + n + " не міститься в проміжку (25; 100)");
        }

        // завдання 2
        int number = 365;
        int first = number / 100;
        int second = (number / 10) % 10;
        int third = number % 10;
        int maxNumber = Math.max(first, Math.max(second, third));

        System.out.println("завдання 2:");
        System.out.println("найбільша цифра у числі " + number + " => " + maxNumber);
        System.out.println();

        // завдання 3
        System.out.println("завдання 3:");
        String direction = "до низу";
        int floor = 6;

        if (direction.equals("до гори")) {
            if (floor == 1) {
                System.out.println("ви піднялись на 1 поверх");
            } else if (floor == 2) {
                System.out.println("ви піднялись на 3 поверх");
            } else if (floor == 3) {
                System.out.println("ви піднялись на 3 поверх");
            } else if (floor == 4) {
                System.out.println("ви піднялись на 4 поверх");
            } else if (floor == 5) {
                System.out.println("ви піднялись на 5 поверх");
            } else if (floor == 6) {
                System.out.println("ви піднялись на 6 поверх");
            } else if (floor == 7) {
                System.out.println("ви піднялись на 7 поверх");
            } else if (floor == 8) {
                System.out.println("ви піднялись на 8 поверх");
            } else if (floor == 9) {
                System.out.println("ви піднялись на 9 поверх");
            } else {
                System.out.println("вказано неіснуючий поверх");
            }
        } else if (direction.equals("до низу")) {
            if (floor == 9) {
                System.out.println("Ви спустились на 9 поверх");
            } else if (floor == 8) {
                System.out.println("ви спустились на 8 поверх");
            } else if (floor == 7) {
                System.out.println("ви спустились на 7 поверх");
            } else if (floor == 6) {
                System.out.println("ви спустились на 6 поверх");
            } else if (floor == 5) {
                System.out.println("ви спустились на 5 поверх");
            } else if (floor == 4) {
                System.out.println("ви спустились на 4 поверх");
            } else if (floor == 3) {
                System.out.println("ви спустились на 3 поверх");
            } else if (floor == 2 || floor == 1) {
                System.out.println("ви спустились на 1 поверх");
            } else {
                System.out.println("вказано неіснуючий поверх");
            }
        }

        // завдання 4
        System.out.println("завдання 4:");
        String response = "Ok";

        switch (response) {
            case "Так":
            case "ОК":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("я погоджуюсь");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("я відмовляюсь");
                break;
            default:
                System.out.println("невідомий вибір");
        }

        // завдання 5
        System.out.println("завдання 5:");
        int x = 18, y = 6, z = 24;
        if (x > y) {
            int temp = x; x = y; y = temp;
        }
        if (x > z) {
            int temp = x; x = z; z = temp;
        }
        if (y > z) {
            int temp = y; y = z; z = temp;
        }

        System.out.println("числа в порядку зростання: " + x + ", " + y + ", " + z);
    }
}