package Lecture_2;

/**
 * Напишите метод evenArray который принимает целое число типа int и возвращает
 * массив заполненный четными числами от 1 до этого числа.
 */
public class EvenArray {

    public int[] evenArray(int number) {
        int[] ints = new int[number / 2];
        number = 0;
        for (int i = 0; i <= ints.length - 1; i++) {
            number += 2;
            ints[i] = number;
        }
        return ints;
    }
}
