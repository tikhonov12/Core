package Lecture_5;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/**
 * Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal.
 * Массив байт устроен следующим образом. Сначала идет число типа int,
 * записанное при помощи ObjectOutputStream.writeInt(size).
 * Далее подряд записано указанное количество объектов типа Animal,
 * сериализованных при помощи ObjectOutputStream.writeObject(animal).
 * <p>
 * Если вдруг массив байт не является корректным представлением массива экземпляров Animal,
 * то метод должен бросить исключение java.lang.IllegalArgumentException.
 * Причины некорректности могут быть разные. Попробуйте подать на вход методу разные некорректные данные и посмотрите,
 * какие исключения будут возникать.
 * Вот их-то и нужно превратить в IllegalArgumentException и выбросить
 **/

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animalArr = null;
        Object obj = null;
        int i = 0;
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            animalArr = new Animal[ois.readInt()];
            for (i = 0; i < animalArr.length; i++) {
                if ((obj = ois.readObject()) instanceof Animal) {
                    animalArr[i] = (Animal) obj;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return animalArr;
    }
}