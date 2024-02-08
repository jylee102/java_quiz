package ch03;

import java.util.Scanner;

public class Quiz9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        double num = scanner.nextDouble();

        String result = (num == 0) ? "0" : ((num > 0) ? "양수" : "음수");

        System.out.println(num + "은 " + result + "입니다.");
    }
}
