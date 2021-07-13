package Lecture_5;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ReadAsString {
    /**
     * Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
     * Пример:InputStream последовательно возвращает четыре байта: 48 49 50 51.
     * Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку: "0123".
     **/
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder sb = new StringBuilder();
        int p = 0;
        InputStreamReader isr = new InputStreamReader(inputStream, charset);
        while ((p = isr.read()) != -1) {
            sb.append((char) p);
        }
        return sb.toString();
    }
}
