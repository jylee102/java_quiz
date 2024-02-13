package ch04;

public class Quiz01 {
    public static void main(String[] args) {
        int x = 11;
        char ch = 'a';
        int year = 2024;
        boolean powerOn = false;
        String str = "";

        if (10 < x && x < 20) {
            System.out.println("1-1");
        }

        if (ch != ' ') {
            System.out.println("1-2");
        }

        if (ch == 'x' || ch == 'X') {
            System.out.println("1-3");
        }

        if ('0' <= ch && ch <= '9') {
            System.out.println("1-4");
        }

        if (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')) {
            System.out.println("1-5");
        }

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("1-6");
        }

        if (powerOn == false) {
            System.out.println("1-7");
        }

        if (str.equals("yes")) {
            System.out.println("1-8");
        }
    }
}
