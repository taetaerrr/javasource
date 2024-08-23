package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx13 {
    public static void main(String[] args) {

        int scores;
        Scanner sc = new Scanner(System.in);

        // 배열 생성

        int max = 0, sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("학생 수 입력 >> ", (i + 1));
            scores[i] = sc.nextInt();
            if (scores[i] > max) {
                max = scores[i];

            }
            sum += scores[i];
        }

    }

}
