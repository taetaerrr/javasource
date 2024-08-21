package ch3;

import java.util.Scanner;

public class IfEx4 {
    public static void main(String[] args) {
        // 숫자를 하나 입력받은 후 입력 받은 숫자가 짝수, 홀수 출력

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 하나 입력하세요 >> ");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        int x = num % 2;
        if (x == 1) {
            System.out.println("홀수");
        } else
            System.out.println("짝수");

        sc.close();
    }

}
