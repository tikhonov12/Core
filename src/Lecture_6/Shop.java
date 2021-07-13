package Lecture_6;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.*;

public class Shop {
    /**
     * Магазину нужно сохранять информацию о продажах для каждого сотрудника.
     * Напишите метод Map getSalesMap(Reader reader) который принимает Reader содержащий строки вида:
     * Алексей 3000
     * Дмитрий 9000
     * Антон 3000
     * Алексей 7000
     * Антон 8000
     * Метод должен получить все строки из Readera и заполнить и вернуть карту где ключом будет имя сотрудника,
     * а значением сумма всех его продаж.
     */
    @NotNull
    public static Map<String, Long> getSalesMap() {
        Map<String, Long> salesAmount = new TreeMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                long lng = Long.parseLong(s.substring(s.indexOf(" ") + 1));
                if (salesAmount.get(s.substring(0, s.indexOf(" "))) != null) {
                    salesAmount.merge(s.substring(0, s.indexOf(" ")), lng, Long::sum);
                } else {
                    salesAmount.put(s.substring(0, s.indexOf(" ")), lng);
                }
            }
        }
        return salesAmount;
    }

    public static void main(String[] args) throws FileNotFoundException {

        for (Map.Entry<String, Long> s : getSalesMap().entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue() + "#");
        }
    }

}
