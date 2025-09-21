package org.lucas;
import java.util.Scanner;
/**
 * Головний клас програми для знаходження чисел Люка,
 * які закінчуються на задану цифру.
 *
 * @author Oleksandra
 * @version 1.0
 */
public class Main {
    /**
     * Обчислює n-те число Люка.
     * L0 = 2, L1 = 1, L(n) = L(n-1) + L(n-2).
     *
     * @param n номер числа
     * @return значення n-го числа Люка
     */
    public static long lucas(int n) {
        if (n == 0) return 2;
        if (n == 1) return 1;
        long a = 2, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    /**
     * Точка входу в програму.
     * Зчитує N та цифру, виводить числа Люка та ті,
     * що закінчуються на задану цифру.
     *
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть N (кількість чисел Люка): ");
        int N = sc.nextInt();

        System.out.print("Введіть цифру для перевірки (0-9): ");
        int digit = sc.nextInt();

        LucasNumber[] numbers = new LucasNumber[N];
        //створюємо числа Люка
        for (int i = 0; i < N; i++) {
            numbers[i] = new LucasNumber(i, lucas(i));
        }
        System.out.println("\nПерші " + N + " чисел Люка:");
        for (LucasNumber num : numbers) {
            System.out.print(num.getValue() + " ");
        }
        System.out.println("\n\nЧисла Люка, що закінчуються на " + digit + ":");
        boolean found = false;
        for (LucasNumber num : numbers) {
            if (num.endsWithDigit(digit)) {
                System.out.println("L" + num.getIndex() + " = " + num.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Таких чисел немає серед перших " + N + ".");
        }
    }
}
