package ch04;

public class Quiz06 {
    public static void main(String[] args) {
        for (int m = 1; m <= 6; m++) {
            for (int n = 1; n <= 6; n++) {
                if (m + n == 6) {
                    System.out.println("(" + m + ", " + n + ")");
                }
            }
        }
    }
}
