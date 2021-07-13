package Lecture_4;

/**
 * Вспомним нашего старого знакомого робота. Теперь мы будем давать роботу команды удаленно,
 * подключаясь к нему по беспроводному каналу связи.
 * Подключение к роботу представляется в программе интерфейсом RobotConnection:
 **/
public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);

    @Override
    void close();
}
