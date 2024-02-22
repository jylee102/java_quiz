package ch07.Quiz07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        /*
        public Child() {
        // super코드 없음-> 자동적으로 Parent() 호출
        // Parent() call 출력 이전에 this("대한민국"), 즉 Parent("대한민국") 호출
        this("홍길동"); // Child("홍길동") 호출
        System.out.println("Child() call");
        }

        =>
        Parent(String nation) -> Parent() -> Child(String name) -> Child()
         */
    }
}

