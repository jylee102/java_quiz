package ch06.QuizPlus;

import java.util.Scanner;

public class CustomerApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer[] customers = new Customer[50];

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1.고객등록 | 2.고객목록 | 3.포인트사용 | 4.포인트적립 | 5.종료");
            System.out.println("------------------------------------------------------------");

            System.out.print("선택> ");

            int selectNo = scanner.nextInt(); // 입력받음

            switch (selectNo) {
                case 1:
                    registerCustomer();
                    break;
                case 2:
                    showCustomerList();
                    break;
                case 3:
                    spendPoint();
                    break;
                case 4:
                    addPoint();
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    // 고객 등록
    private static void registerCustomer() {
        System.out.println("-----------");
        System.out.println("고객등록");
        System.out.println("-----------");

        System.out.print("고객명: ");
        String name = scanner.next();

        System.out.print("핸드폰번호: ");
        String phone = scanner.next();

        System.out.print("집주소: ");
        String address = scanner.next();

        Customer newCustomer = new Customer(name, phone, address);

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = newCustomer;
                System.out.println(name + "님이 등록되었습니다.");
                break;
            }
        }
    }

    // 고객 리스트
    private static void showCustomerList() {
        System.out.println("-----------");
        System.out.println("고객목록");
        System.out.println("-----------");

        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];

            if (customer != null) {
                System.out.println(customer.getName() + " " + customer.getPhone() + " " + customer.getPoint() + "P");
            } else break;
        }
    }

    // 포인트 사용
    private static void spendPoint() {
        System.out.println("-----------");
        System.out.println("포인트사용");
        System.out.println("-----------");

        System.out.print("핸드폰번호: ");
        Customer customer = findCustomer(scanner.next());

        if (customer == null) {
            System.out.println("결과: 등록되지 않은 번호입니다.");
            return;
        }

        int currentPoint = customer.getPoint();

        if (currentPoint < 500) {
            System.out.println("결과: 보유하신 포인트가 부족합니다.");
            System.out.println("포인트는 500P부터 사용가능합니다.(현재 " + currentPoint + "P 보유)");
            return;
        }

        System.out.print("사용할 포인트: ");
        int point = scanner.nextInt();

        if (point > currentPoint) {
            System.out.print("결과: 보유하신 포인트가 부족합니다.");
            System.out.println("(현재 " + currentPoint + "P 보유)");
            return;
        }

        customer.setPoint(currentPoint - point);
        System.out.println(point + "P를 사용했습니다. " + customer.getPoint() + "P가 남았습니다.");
    }

    // 포인트 적립
    private static void addPoint() {
        System.out.println("-----------");
        System.out.println("포인트적립");
        System.out.println("-----------");

        System.out.print("핸드폰번호: ");
        Customer customer = findCustomer(scanner.next());

        if (customer == null) {
            System.out.println("결과: 등록되지 않은 번호입니다.");
            return;
        }

        System.out.print("적립할 포인트: ");
        int point = scanner.nextInt();

        int currentPoint = customer.getPoint();

        if (point >= 2000) point += (int) (point * 0.1);

        customer.setPoint(currentPoint + point);
        System.out.println(point + "P가 적립되었습니다. 보유하신 포인트는 " + customer.getPoint() + "P 입니다.");
    }

    // 고객객체 찾기
    private static Customer findCustomer(String phone) {
        Customer customer = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                String dbAno = customers[i].getPhone();

                if (dbAno.equals(phone)) {
                    customer = customers[i];
                    break;
                }
            }
        }

        return customer;
    }
}
