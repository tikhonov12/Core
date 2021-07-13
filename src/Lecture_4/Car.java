package Lecture_4;

/**
 * Создайте статический класс Car, чтобы объекты этого типа можно было использовать в try-with-resources.
 * <p>
 * Метод close() должен выводить на экран фразу "Машина закрывается...".
 * <p>
 * Try должен ловить все непроверяемые исключения и игнорировать их.
 * <p>
 * В методе main в блоке try вызови метод drive(). Метод drive должен выводить на экран сообщение "Машина поехала."
 */
public class Car
        implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Машина закрывается...");
    }

    public void drive() {
        System.out.println("Машина поехала.");

    }

    public static void main() {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
        }
    }
}