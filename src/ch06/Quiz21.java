package ch06;

public class Quiz21 {

    static int max(int... arr) {
        int max = -999999;
        if (arr != null && arr.length != 0) {
            max = arr[0];

            for (int num : arr) {
                if (num > max) max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));

        // 크기가 0인 배열
        System.out.println("최대값:" + max(new int[]{}));
    }
}
