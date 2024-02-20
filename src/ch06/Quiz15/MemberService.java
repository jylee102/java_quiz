package ch06.Quiz15;

public class MemberService {
    boolean login(String id, String pw) {
        return id.equals("hong") && pw.equals("12345");
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다");
    }
}
