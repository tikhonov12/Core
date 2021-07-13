import java.util.Scanner;

public class RomanNumbers {
    public static void romanNumbers() {
        Scanner in = new Scanner(System.in);
        checkString(in.nextLine().trim());
    }

    // Проверяет на наличие неправильных символов
    static void checkString(String pogString) {
        try {
            char[] str = {'I', 'V', 'X'};
            char[] val = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
            int x = pogString.length() - 1;
            int y = pogString.length() - 1;
            int length = pogString.length() - 1;
            for (int i = 0; i <= length; i++) {
                for (int k = 0; k < 3; k++) {
                    if (pogString.charAt(i) == str[k]) {
                        y--;
                        break;
                    }
                }
                for (int j = 0; j < 10; j++) {
                    if (pogString.charAt(i) == val[j]) {
                        x--;
                        break;
                    }
                }
            }
            if (x != 0 && y != 0) {
                throw new Exception("Похоже что вы ввели некорректные значения");
            } else {
                iivString(pogString);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }

    }

    //Переводит из арабских в римские, тут же вывод
    static void inOutStr(int x, boolean b) {
        if (x == 0) {
            System.out.println(0);
            System.exit(0);
        }
        String[] str = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};
        int[] ine = {1, 4, 5, 9, 10, 40, 50, 90, 100};
        String result = "";
        int c;
        if (b) {
            while (x != 0) {
                for (int i = 8; i >= 0; i--) {
                    if (x >= ine[i]) {
                        c = x / ine[i];
                        while (c != 0) {
                            result += str[i];
                            x -= ine[i];
                            c--;
                        }
                    }
                }
            }
            System.out.println(result);
        } else {
            System.out.println(x);
        }
    }

    //Переводит строку из римских чисел в строку из арабских чисел
    static void iivString(String omegaString) {
        int x = 0;
        int y = 0;
        int index = 0;
        int p = omegaString.length();

        for (int i = 0; i < p; i++) {
            if (omegaString.charAt(i) == '+') index = i;
            if (omegaString.charAt(i) == '-') index = i;
            if (omegaString.charAt(i) == '/') index = i;
            if (omegaString.charAt(i) == '*') index = i;
        }
        for (int k = 0; k < index; k++) {
            if (omegaString.charAt(k) == 'I') {
                x++;
            }
            if (omegaString.charAt(k) == 'V' && x == 0) {
                x = 5;
            }
            if (omegaString.charAt(k) == 'V' && x == 1) {
                x = 4;
            }
            if (omegaString.charAt(k) == 'X' && x == 0) {
                x = 10;
            }
            if (omegaString.charAt(k) == 'X' && x == 1) {
                x = 9;
            }
        }
        for (int j = index; j < p; j++) {
            if (omegaString.charAt(j) == 'I') {
                y++;
            }
            if (omegaString.charAt(j) == 'V' && y == 0) {
                y = 5;
            }
            if (omegaString.charAt(j) == 'V' && y == 1) {
                y = 4;
            }
            if (omegaString.charAt(j) == 'X' && y == 0) {
                y = 10;
            }
            if (omegaString.charAt(j) == 'X' && y == 1) {
                y = 9;
            }
        }
        if (x == 0 && y == 0) {
            convertString(omegaString, false);
        } else {
            omegaString = String.valueOf(x) + omegaString.charAt(index) + String.valueOf(y);
            convertString(omegaString, true);
        }

    }

    // Принимает арабские и переводит строку в числа и операцию
    static void convertString(String omegaString, boolean b) {
        String s;
        int x = 0;
        int y = 0;
        int length = omegaString.length();
        try {

            if (omegaString.charAt(1) == '+' || omegaString.charAt(1) == '-' || omegaString.charAt(1) == '/' || omegaString.charAt(1) == '*') {
                s = String.valueOf(omegaString.charAt(0));
                x = Integer.parseInt(s);
            }
            if (omegaString.charAt(2) == '+' || omegaString.charAt(2) == '-' || omegaString.charAt(2) == '/' || omegaString.charAt(2) == '*') {
                s = String.valueOf(omegaString.charAt(0)) + omegaString.charAt(1);
                x = Integer.parseInt(s);
            }
            if (omegaString.charAt(length - 2) == '+' || omegaString.charAt(length - 2) == '-' || omegaString.charAt(length - 2) == '/' || omegaString.charAt(length - 2) == '*') {
                s = String.valueOf(omegaString.charAt(length - 1));
                y = Integer.parseInt(s);
            }
            if (omegaString.charAt(length - 3) == '+' || omegaString.charAt(length - 3) == '-' || omegaString.charAt(length - 3) == '/' || omegaString.charAt(length - 3) == '*') {
                s = String.valueOf(omegaString.charAt(length - 2)) + omegaString.charAt(length - 1);
                y = Integer.parseInt(s);
            }
            if (y < 0 || y > 10 || x > 11 || x < 0) {
                throw new Exception("Похоже вы ввели некорректные значения");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(0);
        }

        for (int j = 0; j < omegaString.length(); j++) {
            switch (omegaString.charAt(j)) {
                case '+':
                    inOutStr(addOp(x, y), b);
                    break;
                case '-':
                    inOutStr(subOp(x, y), b);
                    break;
                case '/':
                    inOutStr(divOp(x, y), b);
                    break;
                case '*':
                    inOutStr(mulOp(x, y), b);
                    break;
            }
        }
    }

    static int divOp(int x, int y) {
        return x / y;
    }

    static int mulOp(int x, int y) {
        return x * y;
    }

    static int addOp(int x, int y) {
        return x + y;
    }

    static int subOp(int x, int y) {
        return x - y;
    }
}