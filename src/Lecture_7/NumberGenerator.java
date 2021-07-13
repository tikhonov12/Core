package Lecture_7;


import java.util.function.Consumer;

/**
 * Создайте функциональный интерфейс NumberGenerator, параметризованный таким образом,
 * что принимает только наследников класса Number, имеющий метод boolean cond(T arg).
 * Создайте в методе public static NumberGenerator<? super Number> getGenerator() с помощью лямбда
 * выражения реализацию NumberGenerator,
 * которая возвращает true, если число в int эквиваленте больше 0.
 */
@FunctionalInterface
public interface NumberGenerator<T extends Number> {

    boolean cond(T arg);

    public static NumberGenerator<? super Number> getGenerator() {
        NumberGenerator<? super Number> numberGenerator;
        numberGenerator = num -> num.intValue() > 0;
        return numberGenerator;
    }
}



