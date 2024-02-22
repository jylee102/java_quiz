package ch07.Quiz07;

public class Parent {
    public String nation;

    // Child 클래스(자식 클래스)에서 호출됨(먼저 실행)
    public Parent() {
        this("대한민국"); // Parent("홍길동") 호출
        System.out.println("Parent() call");
    }

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}

