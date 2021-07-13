package Lecture_6;

import java.util.HashSet;
import java.util.Set;

/**
 * Массивы в Java имеют фиксированную длину. Попробуем обойти это ограничение.
 * Создайте класс DynamicArray, который хранит в себе массив, и имеет методы для добавления void add(T el),
 * void remove(int index) удаления и извлечения T get(int index) из него элементов, при переполнении текущего массива,
 * должен создаваться новый, большего размера.
 * Для возможности работы с различными классами DynamicArray должен быть дженериком.
 * Для решения задачи можно воспользоваться методами из класса java.util.Arrays.
 * Импорт этого класса уже объявлен в тестирующей системе. Добавлять его явно не нужно
 **/
public class SymmetricDifference {
    public static Set symmetricDifference(Set set1, Set set2) {
        HashSet set3 = new HashSet(set1);
        HashSet set4 = new HashSet(set2);
        set3.removeAll(set4);
        set4.removeAll(set1);
        set3.addAll(set4);
        return set3;
    }
}
