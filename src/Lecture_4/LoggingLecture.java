package Lecture_4;

import java.util.logging.*;

/**
 * Создайте в статичном публичном методе logging логгер с именем com.javamentor.logging.Test,
 * залогируйте им два сообщения: первое "Все хорошо" с уровнем INFO и второе "Произошла ошибка" с уровнем WARNING.
 */
public class LoggingLecture {
    public static void logging() {
        Logger logging = Logger.getLogger("com.javamentor.logging.Test");
        logging.log(Level.INFO, "Все хорошо");
        logging.log(Level.WARNING, "Произошла ошибка");
    }
}
