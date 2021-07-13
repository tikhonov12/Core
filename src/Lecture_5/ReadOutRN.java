package Lecture_5;

import java.io.*;
import java.util.*;

public class ReadOutRN {
    /**
     * Напишите программу, читающую текст из System.in и выводящую в System.out сумму
     * всех встреченных в тексте вещественных чисел с точностью до шестого знака после запятой.
     * Числом считается последовательность символов, отделенная от окружающего текста пробелами или
     * переводами строк и успешно разбираемая методом Double.parseDouble.
     * На этот раз вам надо написать программу полностью, т.е. объявить
     * публичный класс с именем Main  и точку входа в программу — метод  main.
     * И добавить все необходимые импорты
     **/
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double result = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        System.out.printf("%.6f", result);
    }
}
