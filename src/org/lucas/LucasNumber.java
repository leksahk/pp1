package org.lucas;
/**
 * Клас для роботи з числами Люка.
 * Містить номер числа та його значення,
 * а також метод для перевірки закінчення на задану цифру.
 *
 * @author Oleksandra Savchuk
 * @version 1.0
 */
public class LucasNumber {
    private int index;     // номер числа
    private long value;    // значення числа Люка
    /**
     * Конструктор для створення числа Люка.
     *
     * @param index номер числа в послідовності
     * @param value значення числа Люка
     */
    public LucasNumber(int index, long value) {
        this.index = index;
        this.value = value;
    }
    /**
     * @return номер числа Люка
     */
    public int getIndex() {
        return index;
    }
    /**
     * @return значення числа Люка
     */
    public long getValue() {
        return value;
    }
    /**
     * Перевіряє, чи закінчується число на задану цифру.
     *
     * @param digit цифра (0–9)
     * @return true, якщо число закінчується на цю цифру
     */
    public boolean endsWithDigit(int digit) {
        return value % 10 == digit;
    }
}