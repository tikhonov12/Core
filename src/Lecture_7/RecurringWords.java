package Lecture_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов,
 * и в конце выводящую 10 наиболее часто встречающихся слов.
 * <p>
 * Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр. Например,
 * в строке "Мама мыла раму 33 раза!" ровно пять слов:
 * "Мама", "мыла", "раму", "33" и "раза".
 * <p>
 * Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово.
 * Выводите слова в нижнем регистре.
 * <p>
 * Если в тексте меньше 10 уникальных слов, то выводите сколько есть.
 * <p>
 * Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте,
 * то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.
 * <p>
 * Задача имеет красивое решение через стримы без циклов и условных операторов. Попробуйте придумать его.
 */
public class RecurringWords {
    public static void main(String[] args) throws IOException {
        (new BufferedReader(new InputStreamReader(System.in, "UTF-8")))
                .lines()
                .flatMap(s -> Stream.of(s.split("[\\p{Punct}\\s]+")))
                .map(String::toLowerCase)
                .filter(s -> s.length() > 0)
                .collect(Collectors.toMap(p -> p, p -> 1, Integer::sum))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}


