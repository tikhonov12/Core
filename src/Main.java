import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        while ((LocalDateTime.now().getNano()) < (LocalDateTime.now().getNano())) {
            System.out.println("!!!");
        }
    }
}
