package ch06;

public class Quiz20 {
    static boolean isNumber(String str) {
        boolean result = true;
        if (str == null || str.isEmpty()) result = false;
        else {
            for (char c : str.toCharArray()) {
                if (!Character.isDigit(c)) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
