package ch07.Quiz08;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire; // 자동타입변환

        snowTire.run(); // 오버라이드된 run()메소드 -> 자식클래스의 run()메소드 호출
        tire.run(); // 오버라이드된 run()메소드 -> 자식클래스의 run()메소드 호출
    }
}

