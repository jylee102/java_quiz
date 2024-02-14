package ch05;

public class Quiz08 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        int max = array[0];

        for (int value : array) {
            if (value > max) max = value;
        }
        System.out.println("최대값: " + max);
    }
}
