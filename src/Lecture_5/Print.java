package Lecture_5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Print {
    /**
     * Напишите метод void print(InputStream inputStream, OutputStream outputStream)
     * который принимает InputStream и OutputStream,
     * считывает все байты из inputStream и записывает в OutputStream только четные.
     * Пример ввода: 3, 10, 4, 5, 7
     * Пример вывода: 10, 4
     **/
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int p = 0;
        try {
            while ((p = inputStream.read()) != -1) {
                if (p % 2 == 0) {
                    outputStream.write(p);
                }
            }
        } finally {
            outputStream.flush();
        }
    }
}
