package ru.sberbank.jd.lesson02;

/**
 * Класс вычисления наибольшего общего делителя двух целых числел
 * @autor vvsirenko
 * @version 1.0
 */
public class NodImpl implements Nod {

    /** Поле первое число */
    int first;
    /** Поле второе число */
    int second;

    /**
        * Конструктор - создание нового объекта
     */
    public NodImpl() {}

    /**
     * Функция получения значения НОД {@link NodImpl#calculate}
     * @return возвращает НОД
     */
    @Override
    public int calculate(int first, int second) {

        while (first > 0 && second > 0) {
            if (first >= second) {
                first = first % second;
            } else {
                second = second % first;
            }
        }
        return Math.max(first, second);
    }
}
