package Lecture_7;

import java.util.function.UnaryOperator;

/**
 * Напишите метод с названием sqrt, который возвращает реализацию
 * функционального интерфейса UnaryOperator, который принимает целое число(тип int) и возвращает его квадрат.
 */
public class Sqrt {
    public UnaryOperator<Integer> sqrt() {
        UnaryOperator<Integer> square = x -> x * x;
        return square;
    }
}

