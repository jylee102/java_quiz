package ch06.Quiz22;

public class Account {
    final static long MIN_BALANCE = 0;
    final static long MAX_BALANCE = 1000000;
    private long balance;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) this.balance = balance;
    }
}
