package Lecture_6;

/**
 * В классе Box из прошлой задачи нужно добавить статический метод getBox(),
 * который возвращает пустой параметризованный объект типа Box,
 */
public class Box_<T> {
    private T object;

    Box_() {
    }

    Box_(T object) {
        this.object = object;
    }

    public static <T> Box_<T> getBox() {
        return new Box_<>();
    }
}
