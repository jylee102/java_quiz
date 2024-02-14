package ch05;

public class Quiz05 {
    public static void main(String[] args) {
        /*
        ➊ 정수 타입 배열 항목의 기본 초기값은 0이다.
        ➋ 실수 타입 배열 항목의 기본 초기값은 0.0f 또는 0.0이다.
        ➌ boolean 타입 배열 항목의 기본 초기값은 true이다.
        ➍ 참조 타입 배열 항목의 기본 초기값은 null이다.

        3번. boolean 타입 배열 항목의 기본 초기값은 false이다.
         */

        boolean[] arr = new boolean[2];
        for (boolean bool : arr) {
            System.out.println(bool);
        }
    }
}
