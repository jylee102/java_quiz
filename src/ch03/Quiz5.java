package ch03;

public class Quiz5 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;

        // 정수 * 정수 / 실수 = 실수
        double area1 = (lengthTop + lengthBottom) * height / 2.0;
        System.out.println(area1);

        // 정수 * 정수 * 실수 = 실수
        // 실수 / 정수 = 실수
        double area2 = (lengthTop + lengthBottom) * height * 1.0 / 2;
        System.out.println(area2);

        // (강제타입변환 된)실수 * 정수 / 정수 = 실수
        double area3 = (double) (lengthTop + lengthBottom) * height / 2;
        System.out.println(area3);

        // 정수 * 정수 / 정수 = 정수
        double area4 = (double) ((lengthTop + lengthBottom) * height / 2);
        System.out.println(area4);

        // 1, 2, 3
    }
}
