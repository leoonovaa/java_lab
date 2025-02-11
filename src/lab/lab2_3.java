package lab;

public class lab2_3 {
    public static void main(String[] args) {
        // завдання 1
        System.out.println("завдання 1:");

        System.out.println("цикл for:");
        for (int i = 500; i <= 650; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("цикл while:");
        int j = 500;
        while (j <= 650) {
            System.out.print(j + " ");
            j += 10;
        }
        System.out.println("\n");

        System.out.println("цикл do-while:");
        int k = 500;
        do {
            System.out.print(k + " ");
            k += 10;
        } while (k <= 650);
        System.out.println("\n");

        // завдання 2
        System.out.println("завдання 2:");
        int a = 2;
        while (a < 5000) {
            System.out.print(a + " ");
            a = 2 * a - 1;
        }
        System.out.println("\n");

        // завдання 3
        System.out.println("завдання 3:");
        int number = 10;
        for (int d = 1; d <= number; d++) {
            if (number % d == 0) {
                System.out.print(d + " ");
            }
        }
        System.out.println("\n");

        // завдання 4
        System.out.println("завдання 4:");

        System.out.println("цикл for:");
        int factorial = 1;
        for (int f = 1; f <= 10; f++) {
            factorial *= f;
        }
        System.out.println("факторіал 10: " + factorial);

        System.out.println("цикл while:");
        factorial = 1;
        int f = 1;
        while (f <= 10) {
            factorial *= f;
            f++;
        }
        System.out.println("факторіал 10: " + factorial);
        System.out.println();

        // завдання 5
        System.out.println("завдання 5:");

        int count = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                int h1 = h / 10;
                int h2 = h % 10;
                int m1 = m / 10;
                int m2 = m % 10;

                if (h1 == m2 && h2 == m1) {
                    System.out.printf("%02d:%02d\n", h, m);
                    count++;
                }
            }
        }
        System.out.println("кількість симетричних комбінацій: " + count);
    }
}
