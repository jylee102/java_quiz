package ch04;

import java.util.Scanner;

public class Quiz09 {
    public static void main(String[] args) {
        //1과 100사이의 임의 값을 얻어서 answer에 저장한다.
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;  //사용자 입력을 저장할 공간
        int count = 0;  //시도 횟수를 세기위한 변수


        //화면 입력을 받기 위해 Scanner 클래스 사용
        Scanner s = new Scanner(System.in);


        do {
            count++;
            System.out.println("1과 100사이의 값을 입력하세요");

            input = s.nextInt(); //입력받은 값을 변수에 저장한다.

            if (input == answer) {
                System.out.println(input + " < 정답입니다!");
                break;
            } else {
                System.out.println(input + "는 정답이 아닙니다");
            }

        } while (true);

        System.out.println("\n" + count + "번만에 정답을 맞혔습니다.");
    }
}
