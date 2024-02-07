package ch02;

public class Quiz5 {
    public static void main(String[] args) {
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String strValue = "A";

        // 강제타입변환 생략 가능
        double var1 = (double) intValue;

        byte var2 = (byte) intValue;
        int var3 = (int) doubleValue;

        // String은 객체이고 참조타입
        // char는 기본 타입이므로 형 변환이 되지 않는다.
//        char var4 = (char) strValue;

    }
}
