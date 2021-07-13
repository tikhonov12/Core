package Lecture_5;

import java.io.IOException;
import java.io.InputStream;

public class SumOfStream {
    /**
     * Напишите метод int sumOfStream(InputStream inputStream), который принимает
     * InputStream и возвращает сумму всех его элементов.
     * Пример ввода: 1, 2, 4, 10
     * Пример вывода: 17
     **/
    public int sumOfStream(InputStream inputStream) {
        int result = 0;
        int result1 = 0;

        try {
            while ((result = inputStream.read()) != -1) {
                result1 += (byte) result;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result1;
    }
}
