package ch02;

public class Quiz3 {
    public static void main(String[] args) {
        System.out.println("1" + "2"); // 문자열 연산

        // char형 + char형 = int형으로 자동 타입변환이 일어난다.
        System.out.println('A' + 'B'); // char타입 연산

        // char형 + int형 = int형으로 자동 타입변환이 일어난다.
        System.out.println('1' + 2);

        // char형 + char형 = int형으로 자동 타입변환이 일어난다.
        System.out.println('1' + '2');

        // String형 + 다른 타입 = 항상 문자열
        System.out.println('J' + "ava");

        System.out.println("'1': " + (int)'1');
        System.out.println("'2': " + (int)'2');
    }
}
