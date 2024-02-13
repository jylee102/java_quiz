package ch04;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputMenu = 0;
        int remain = 0;

        Label:
        while (true) {
            System.out.println("----------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------");

            System.out.print("선택> ");
            inputMenu = scanner.nextInt();

            switch (inputMenu) {
                case 1 -> {
                    System.out.print("예금액 > ");
                    int in = scanner.nextInt();

                    remain += in;
                }

                case 2 -> {
                    System.out.print("출금액 > ");
                    int out = scanner.nextInt();

                    remain -= out;
                }

                case 3 -> System.out.println("잔고 > " + remain);

                default -> {
                    System.out.println("\n프로그램 종료");
                    break Label;
                }
            }
        }
    }
}
