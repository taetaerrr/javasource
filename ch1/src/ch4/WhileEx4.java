package ch4;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {

        boolean run = true;
        int balance = 0; // 잔액

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("=========================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("=========================================");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 잔액 = 잔액 + 입금액
                    System.out.println("입금할 금액을 입력하세요");
                    int m1 = sc.nextInt();
                    balance = balance + m1;
                    System.out.printf("잔액 : %d원\n", balance);
                    
                    //다른 방법
                    // System.out.println("입금할 금액을 입력하세요");
                    // balance = balance + sc.nextInt();

                    break;
                case 2:
                    // 잔액 = 잔액 - 출금액
                    System.out.println("출금할 금액을 입력하세요");
                    int m2 = sc.nextInt();
                    balance = balance - m2;
                    System.out.printf("잔액 : %d원\n", balance);

                    break;
                case 3:
                    // 잔액 출력
                    System.out.printf("현재 잔액은 %d원 입니다.\n", balance);

                    break;
                case 4:
                    run = false;
                    break;

            }

        }

        sc.close();
    }

}
