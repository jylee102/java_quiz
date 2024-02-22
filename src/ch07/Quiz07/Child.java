package ch07.Quiz07;

public class Child extends Parent {
    public String name;

    // main에서 Child()가 호출됨.
    public Child() {
        // super코드 없음-> 자동적으로 Parent() 호출
        this("홍길동"); // Child(String name) 호출
        System.out.println("Child() call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }
}

