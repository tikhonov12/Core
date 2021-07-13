package Lecture_4;

public class TestRobotConnection1 {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection rq = null;
        boolean b = false;
        for (int i = 0; !b && i < 3; i++) {
            try {
                rq = robotConnectionManager.getConnection();
                rq.moveRobotTo(toX, toY);
                b = true;
            } catch (RobotConnectionException ex) {
                if (!b && i == 2) {
                    throw new RobotConnectionException("3 atemps");
                }
            } finally {
                try {
                    rq.close();
                } catch (Exception ex) {
                }
            }

        }
    }
}
