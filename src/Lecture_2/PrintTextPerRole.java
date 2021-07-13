package Lecture_2;

/**
 * Вам дан список ролей и сценарий пьесы в виде массива строчек. Каждая строчка сценария пьесы дана в следующем виде:
 * <p>
 * Роль: текст
 * <p>
 * Текст может содержать любые символы.
 * <p>
 * Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример).
 * Каждая группа распечатывается в следующем виде:
 * <p>
 * Роль:
 * i) текст
 * j) текст2
 * ...
 * ==перевод строки==
 * <p>
 * i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии с порядком ролей.
 * Переводы строк между группами обязательны, переводы строк в конце текста не учитываются.
 * <p>
 * Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно,
 * неправильная сборка результирующей строчки может выйти за ограничение по времени.
 * <p>
 * Обратите внимание еще на несколько нюансов:
 * имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
 * название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
 * роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
 * в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
 * будьте внимательны, не добавляйте лишних пробелов в конце строк.
 */
public class PrintTextPerRole {

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sb = new StringBuilder();
        for (String role : roles) {
            sb.append(role + ":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    sb.append((i + 1) + ")" + new StringBuilder(textLines[i]).substring(role.length() + 1) + "\n");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}