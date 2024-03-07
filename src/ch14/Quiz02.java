package ch14;

public class Quiz02 {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("글 작성 중");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread1.start(); // 실행 대기 상태

        // 병렬적 처리로, 시작은 동시에 해서 "글 작성 중"의 첫 출력은 "음악 듣는 중" 출력 중에 끼어들 수 있다.
        // 이후 2초 기다리는 동안 "음악 듣는 중" 모두 출력, 반복문을 마저 돌면서 2초마다 "글 작성 중" 출력
        for (int i = 0; i < 5; i++) {
            System.out.println("음악 듣는중");
        }
    }
}
