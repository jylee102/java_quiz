package ch06.Quiz23;

public class Account {
    String accountNum;
    String owner;
    int balance;

    static Account[] accounts = new Account[100];
    static String menuStr = "1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ";

    Account(String accountNum, String owner, int balance) {
        this.accountNum = accountNum;
        this.owner = owner;
        this.balance = balance;
    }

    static void displayMenu() {
        System.out.println("-------------------------------------------------");
        System.out.println(menuStr);
        System.out.println("-------------------------------------------------");
        System.out.print("선택> ");
    }

    static void displaySelectedMenu(int menuNum) {
        if (menuNum == 5) return;

        int startIndex = menuStr.indexOf(menuNum + ".");
        System.out.println("----------------------");
        System.out.println(menuStr.substring(startIndex, menuStr.indexOf(" ", startIndex)));
        System.out.println("----------------------");
    }

    static void createAccount(String accountNum, String owner, int balance) {
        Account account = new Account(accountNum, owner, balance);

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                break;
            }
        }

        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    static void getAccountsList() {
        for (Account account : accounts) {
            if (account != null) {
                System.out.println(account.accountNum + "\t" + account.owner + "\t" + account.balance);
            } else break;
        }
    }

    static void deposit(String accountNum, int amount) {
        for (Account account : accounts) {
            if (account != null) {
                if (accountNum.equals(account.accountNum)) account.balance += amount;
            } else break;
        }
    }

    static void withdraw(String accountNum, int amount) {
        for (Account account : accounts) {
            if (account != null) {
                if (accountNum.equals(account.accountNum)) {
                    account.balance -= amount;
                    System.out.println("결과: 출금이 성공되었습니다.");
                }
            } else break;
        }
    }
}
