package Lecture_6;

import java.util.Objects;
/**
 * Реализуйте generic-класс Pair, похожий на Optional,
 * но содержащий пару элементов разных типов и не запрещающий элементам принимать значение null.
 * Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of().
 * Конструктор должен быть закрытым (private).
 */
public class Pair<T, N> {
    private T tValue;
    private N nValue;

    private Pair(T tValue, N nValue) {
        this.tValue = tValue;
        this.nValue = nValue;
    }

    public static <T, N> Pair<T, N> of(T tValue, N nValue) {
        return new Pair<>(tValue, nValue);
    }

    public T getFirst() {
        return tValue;
    }

    public N getSecond() {
        return nValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(tValue, pair.tValue) && Objects.equals(nValue, pair.nValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tValue, nValue);
    }
}
