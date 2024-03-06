package ch12.quiz07;

public class IntergerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        // 원래 ==는 주소를 비교하고 equals는 실제 값을 비교하는데
        // 예외적으로 -128~127사이의 숫자(Integer, Short, Byte)는 값 자체를 비교한다.
        // 100은 이 영역에 속하기 때문에 값 자체를 비교한 결과를 출력하고
        // 그렇지 않은 300은 주소를 비교한 결과 false를 출력한 것이다.
        // 300이라는 숫자값 자체를 비교하고자 한다면 equals를 사용하면 된다.
        System.out.println(obj1 == obj2);
        System.out.println(obj3.equals(obj4));
    }
}

