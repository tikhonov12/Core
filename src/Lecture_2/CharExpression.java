package Lecture_2;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */
public class CharExpression {

    public static char charExpression(int a) {
        int p = '\\';
        return (char) (p + a);
    }

}
