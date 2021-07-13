package Lecture_3;

/**
 * Напишите статический класс AsciiCharSequence, реализующий компактное хранение
 * последовательности ASCII-символов (их коды влезают в один байт) в массиве байт.
 * По сравнению с классом String из Java 8, хранящим каждый символ как char,
 * AsciiCharSequence будет занимать в два раза меньше памяти
 * Класс AsciiCharSequence должен:
 * реализовывать интерфейс java.lang.CharSequence;
 * иметь конструктор, принимающий массив байт;
 * определять методы length(), charAt(), subSequence() и toString()
 * Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса
 * java.lang.CharSequence (JavaDoc или исходники).
 * В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры,
 * поэтому их проверкой и обработкой ошибок заниматься не нужно.
 * Тем более мы еще не проходили исключения.
 */
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private final byte[] byteArr;

    public AsciiCharSequence(byte[] byteArr) {
        this.byteArr = byteArr;
    }

    @Override
    public int length() {
        return byteArr.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteArr[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(byteArr, start, end));
    }

    @Override
    public String toString() {    //Переопределение toString()
        return new String(byteArr, java.nio.charset.StandardCharsets.ISO_8859_1);
    }
}


