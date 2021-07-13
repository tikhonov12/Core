package Lecture_7;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Дан предикат condition и две функции ifTrue и ifFalse. Напишите метод ternaryOperator,
 * который из них построит новую функцию, возвращающую значение функции ifTrue,
 * если предикат выполнен, и значение ifFalse иначе.
 */
public class TernaryOperator {
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return (s) -> condition.test(s) ? ifTrue.apply(s) : ifFalse.apply(s);
    }

    public static void main(String[] args) {
        Predicate<Object> condition = obj1 -> Objects.isNull(obj1);
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = charSequence -> charSequence.length();
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
        System.out.println(safeStringLength.apply("Hello"));
        System.out.println(safeStringLength.apply(null));
    }
}
