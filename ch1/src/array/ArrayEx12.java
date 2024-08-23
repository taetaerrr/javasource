package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx12 {
    public static void main(String[] args) {
        // 5명의 학생들의 점수를 입력 받아서 최고점수, 평균 출력
        int[] scores;

        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 >> ");
        int num = sc.nextInt();

        // 배열 생성
        scores = new int[num];
        System.out.println(Arrays.toString(scores));
        int max = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번 학생 점수를 입력하세요", i + 1);
            scores[i] = sc.nextInt();
        }
        max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        System.out.printf("%d명의 학생 중 최고점수는 %d이고, 평균은 %d입니다.\n", scores.length, max, sum / scores.length);
        sc.close();
        // 5라는 숫자는 변경될 수 있으므로 동적으로 생성
        // 입력 받은 숫자를 기반으로 동적 배열 생성
    }
}
