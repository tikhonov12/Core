package Lecture_2;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c ?
 * Допустимая погрешность – 0.0001 (1E-4)
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */
public class DoubleExpression {

    public static boolean doubleExpression(double a, double b, double c) {
        double epsilon = 0.0001;
        return Math.abs(c - (a + b)) < epsilon;
    }

}
