package ch07.Quiz06;

public class Child extends Parent {
    public int studentNo;

    public Child(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }
}

// 자식객체가 생성될 때 부모객체가 먼저 생성되는데, 부모클래스의 매개변수가 있는 생성자는 컴파일 과정에서 자동으로 호출할 수 없다.
// 따라서 super(매개변수) 코드를 추가하여 부모생성자를 먼저 호출해주어야 한다.

