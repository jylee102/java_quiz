package ch04;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        boolean run = true;

        while (run) {
            System.out.println("----------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------");
            System.out.print("선택> ");

            // 사용자로부터 입력을 받는다.
            int menuNum = scanner.nextInt();

            switch (menuNum) {
                case 1 -> {
                    System.out.print("예금액 > ");
                    balance += scanner.nextInt(); // 통장 잔고에 기존에 예금했던 돈을 유지하기 위해 누적 합산
                }

                case 2 -> {
                    System.out.print("출금액 > ");
                    balance -= scanner.nextInt();
                }

                case 3 -> System.out.println("잔고 > " + balance);

                case 4 -> run = false;
            }
        }
        System.out.println("\n프로그램 종료");
    }
}
