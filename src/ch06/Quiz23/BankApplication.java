package ch06.Quiz23;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String accountNum;
        boolean run = true;

        while (run) {
            Account.displayMenu();
            int menuNum = scanner.nextInt();
            Account.displaySelectedMenu(menuNum);

            switch (menuNum) {
                case 1 -> {
                    System.out.print("계좌번호: ");
                    accountNum = scanner.next();
                    System.out.print("계좌주: ");
                    String owner = scanner.next();
                    System.out.print("초기입금액: ");
                    int balance = scanner.nextInt();

                    Account.createAccount(accountNum, owner, balance);
                }

                case 2 -> Account.getAccountsList();

                case 3 -> {
                    System.out.print("계좌번호: ");
                    accountNum = scanner.next();
                    System.out.print("예금액: ");
                    Account.deposit(accountNum, scanner.nextInt());
                }

                case 4 -> {
                    System.out.print("계좌번호: ");
                    accountNum = scanner.next();
                    System.out.print("출금액: ");
                    Account.withdraw(accountNum, scanner.nextInt());
                }

                case 5 -> run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
