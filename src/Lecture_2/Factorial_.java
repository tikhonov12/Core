package Lecture_2;

import java.math.BigInteger;

/**
 * Реализуйте предыдущую задачу с использованием рекурсии.
 */
public class Factorial_ {
    public static BigInteger factorial(int value) {
        if (value == 1 || value == 0) {
            return new BigInteger("1");
        } else {
            return new BigInteger(String.valueOf(new BigInteger(String.valueOf(value)).multiply(factorial(value - 1))));//Твой код здесь
        }
    }
}
