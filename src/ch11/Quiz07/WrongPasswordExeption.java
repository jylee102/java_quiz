package ch11.Quiz07;

public class WrongPasswordExeption extends Exception {
    public WrongPasswordExeption() {
    }

    public WrongPasswordExeption(String message) {
        super(message);
    }
}