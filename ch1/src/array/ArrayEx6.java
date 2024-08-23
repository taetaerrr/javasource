package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] scores = { 79, 88, 91, 33, 100, 55, 95 };

        // 배열 요소 중에서 가장 큰 값과 가장 작은 값 구하기

        int max = scores[0], min = scores[0];

        // for (int i = 1; i < scores.length; i++) {
        // if (scores[i] > max) {
        // max = scores[i];
        // }
        // if (scores[i] < min) {
        // min = scores[i];
        // }
        // }

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최솟값 : " + min);

        // int max = scores[1];

        // if (max < scores[2]) {
        // max = scores[2];
        // }

        // if (max < scores[3]) {
        // max = scores[3];
        // }
        // if (max < scores[4]) {
        // max = scores[4];
        // }
        // if (max < scores[5]) {
        // max = scores[5];
        // }
        // if (max < scores[6]) {
        // max = scores[6];
        // }
        // if (max < scores[0]) {
        // max = scores[0];
        // }
        // System.out.printf("가장 큰 값은 : %d\n", max);

        // int min = scores[1];

        // if (min > scores[2]) {
        // min = scores[2];
        // }

        // if (min > scores[3]) {
        // min = scores[3];
        // }
        // if (min > scores[4]) {
        // min = scores[4];
        // }
        // if (min > scores[5]) {
        // min = scores[5];
        // }
        // if (min > scores[6]) {
        // min = scores[6];
        // }
        // if (min > scores[0]) {
        // min = scores[0];
        // }
        // System.out.printf("가장 작은 값은 : %d\n", min);
    }
}
