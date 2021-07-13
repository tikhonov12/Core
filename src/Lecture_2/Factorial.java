package Lecture_2;

import java.math.BigInteger;

/**
 * Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
 * <p>
 * Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N.
 * <p>
 * Поскольку это очень быстро растущая функция, то даже для небольших N
 * вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
 * <p>
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку
 * ввода-вывода добавит проверяющая система.
 */
public class Factorial {

    public static BigInteger factorial(int value) {
        if (value == 1 || value == 0) {
            return new BigInteger("1");
        } else {
            return new BigInteger(String.valueOf(new BigInteger(String.valueOf(value)).multiply(factorial(value - 1))));
        }
    }
}
