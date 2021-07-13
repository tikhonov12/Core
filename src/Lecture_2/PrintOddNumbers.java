package Lecture_2;

/**
 * Напишите метод printOddNumbers, который принимает массив и выводит
 * в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.
 */
public class PrintOddNumbers {
    public static void printOddNumbers(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sb.append(arr[i] + ",");
            }
            if (i == arr.length - 1 && sb.length() > 0) {
                System.out.println(sb.deleteCharAt(sb.length() - 1));
            }
        }
    }
}
