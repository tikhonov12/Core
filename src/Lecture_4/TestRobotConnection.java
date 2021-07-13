package Lecture_4;

public class TestRobotConnection {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean b = false;
        for (int i = 0; !b && i < 3; i++) {
            try (RobotConnection rq = robotConnectionManager.getConnection()) {
                rq.moveRobotTo(toX, toY);
                b = true;
            } catch (RobotConnectionException ex) {
                if (!b && i == 2) {
                    throw ex;
                }
            }
        }
    }
}