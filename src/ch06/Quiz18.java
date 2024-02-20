package ch06;

public class Quiz18 {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;
//    static int cv2 = iv; // 정적 필드는 인스턴스 필드를 참조할 수 없다.


    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv); // 인스턴스 멤버(필드)들은 static 메소드내에서 객체를 생성하고 사용해야 한다.
    }


    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }


    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1();   // 인스턴스 멤버(메소드)들은 static 메소드내에서 객체를 생성하고 사용해야 한다.
    }


    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }

}
