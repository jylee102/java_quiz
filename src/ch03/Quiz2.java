package ch03;

public class Quiz2 {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score > 90)) ? "가" : "나";
        System.out.println(result);

        // 조건식은 score이 90보다 작거나 같으면 true를 반환하게 되어있다.
        // 85는 90보다 작으므로 ':'의 앞에 있는 값이 result에 들어간다.
        // 따라서 result = "가"
    }
}
