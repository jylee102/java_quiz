package ch07.Quiz11;

public class Activity {
    public void onCreate() {
        System.out.println("기본적인 실행 내용");
    }

    public static void main(String[] args) {
        MainActivity ma = new MainActivity();
        ma.onCreate();
    }
}

