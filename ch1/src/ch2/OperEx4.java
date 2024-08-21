package ch2;

import java.util.Scanner;

public class OperEx4 {
    public static void main(String[] args) {
        // 사용자로부터 한달 월급을 입력받은 후 월급을 10년간 저축한 금액은 얼마인지 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("한달 월급을 만원 단위로 입력해 주세요");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        System.out.printf("10년간 저축한 금액은 %d억 %d만원입니다.\n", num * 120 / 10000, num * 120 % 10000);

        sc.close();
    }

}
