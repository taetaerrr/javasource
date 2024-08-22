package ch4;

import java.util.Scanner;

public class ForEx7 {
    public static void main(String[] args) {
        // 5! 출력
        // 5 * 4 * 3 * 2 * 1
        int sum = 1;
        // for (int i = 5; i > 0; i--) {
        // //sum = sum * i;
        // sum *= i;
        // }
        // System.out.printf("5! = %d", sum);

        // 특정 숫자의 factorial 구하기
        Scanner sc = new Scanner(System.in);

        System.out.println("팩토리얼 구할 숫자 입력 >> ");
        int num = sc.nextInt();

        for (int i = num; i > 0; i--) {
            sum = sum *= i;
        }
        System.out.printf("%d팩토리얼 : %d\n", num, sum);

    }

}
