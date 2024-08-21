package ch3;

import java.util.Scanner;

public class IfEx5 {
    public static void main(String[] args) {
        // 근무 1시간에 따른 임금 계산
        // 근무시간 입력 받기
        // 8시간까지 시간당 기본임금(10000) 제공
        // 8시간 초과 근무시간은 시간당 기본임금의 1.5배 제공

        int pay = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("근무 시간을 입력하세요 >> ");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        int x = (int) ((8 * 10000) + ((num % 8) * 1.5 * 10000));
        if (num <= 8) {

            System.out.printf("임금은 %d만원입니다.\n", num * 10000);
        } else if (num > 8) {
            pay = (int) (10000 * (num - 8) * 1.5) + 80000;
            System.out.printf("임금은 %d만원입니다.\n", x);

        }

        sc.close();
    }

}
