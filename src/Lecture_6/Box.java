package Lecture_6;

/**
 * Создайте дженерик класс Box, который может хранить в себе один объект класса,
 * которым он параметризирован в поле с названием object.
 */
public class Box<T> {
    private T object;

    public Box(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }

}
