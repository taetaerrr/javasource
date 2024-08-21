package ch3;

import java.util.Scanner;

public class SwitchEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 피연산자 2개와 연산자 1개를 입력받기
        // 3, 5, *
        // 3 * 5 = 15 를 만들기
        // 입력받은 숫자와 연산자를 이용해서 연산 후 결과 출력
        System.out.println("연산자(+, -, *, /, %)를 입력 >>");
        String op = sc.nextLine();

        // 두 개의 숫자 입력받기
        System.out.println("첫번째 숫자를 입력하세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int num2 = sc.nextInt();

        switch (op) {
            case "+":
                System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 - num2);
                break;
            case "*":
                System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 * num2);
                break;
            case "/":
                System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 / num2);
                break;
            case "%":
                System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 % num2);
                break;
            default:
                break;
        }

        sc.close();
    }

}
