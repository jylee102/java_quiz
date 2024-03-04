package ch11;

public class Quiz06 {
    public static void main(String[] args) {
        String[] strArray = {"10", "2a"};
        int value = 0;

        for (int i = 0; i <= 2; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과했음"); // i가 2일 때 걸림
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음"); // i가 1일 때 걸림
            } finally {
                System.out.println(value); // 항상 실행
            }
        }
    }

    /*
    10 // 0번 인덱스
    숫자로 변환할 수 없음 // 1번 인덱스
    10 // 예외에 걸려 value값 재할당되지 않고 그대로 10, 항상 실행되는 finally에서 출력
    인덱스를 초과했음 // 2번 인덱스(1번 인덱스까지밖에 없음)
    10 // 예외에 걸려 value값 재할당되지 않고 그대로 10, 항상 실행되는 finally에서 출력
     */
}
