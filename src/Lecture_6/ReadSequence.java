package Lecture_6;

import java.io.IOException;
import java.util.*;

/**
 * Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами,
 * затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность
 * в обратном порядке в System.out.
 * Все числа влезают в int.
 * Позиции чисел в последовательности нумеруются с нуля.
 * Все import объявлены за вас.
 */

public class ReadSequence {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        while (scanner.hasNextInt()) {
            if (n % 2 != 0) {
                arrayDeque.addFirst(scanner.nextInt());
            } else scanner.next();
            n++;
        }
        while (arrayDeque.peekFirst() != null) {
            sb.append(arrayDeque.pollFirst()).append(" ");
        }
        System.out.println(sb);
    }
}
