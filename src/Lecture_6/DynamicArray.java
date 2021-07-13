package Lecture_6;

import java.util.*;

/**
 * Массивы в Java имеют фиксированную длину. Попробуем обойти это ограничение.
 * Создайте класс DynamicArray, который хранит в себе массив, и имеет методы для добавления void add(T el),
 * void remove(int index) удаления и извлечения T get(int index) из него элементов,
 * при переполнении текущего массива, должен создаваться новый, большего размера.
 * Для возможности работы с различными классами DynamicArray должен быть дженериком.
 * Для решения задачи можно воспользоваться методами из класса java.util.Arrays.
 * Импорт этого класса уже объявлен в тестирующей системе. Добавлять его явно не нужно
 **/
public class DynamicArray<T> {
    Object[] arr=new Object[10];
    int modCount = -1;

    public void add(T el) {
        if (arr.length - 1 == modCount) {
            grow();
        }
        modCount++;
        arr[modCount] = el;
    }

    private void grow() {
        arr = Arrays.copyOf(arr, arr.length + 8);
    }

    public void remove(int index) {
        if (modCount <= 0) {
            modCount = 0;
        }
        modCount--;
        System.arraycopy(arr, index+1, arr, index,arr.length-index-1 );
        arr = Arrays.copyOf(arr, arr.length - 1);
    }

    public T get(int index) {
        return(T) arr[index];
    }

    public int length() {
        return arr.length;
    }
}