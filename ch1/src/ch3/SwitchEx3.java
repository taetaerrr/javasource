package ch3;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 가위(1) 바위(2) 보(3) 게임

        // 컴퓨터가 내는 부분 : random 1~3 사이의 숫자 생성
        int computer = (int) (Math.random() * 3) + 1;

        // 사용자가 내는 부분 : 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("가위(1) 바위(2) 보(3)!");
        String input = sc.nextLine();
        int player = Integer.parseInt(input);

        switch (player - computer) {
            case 1:
            case -2:
                System.out.println("이겼다!");
                break;
            case 0:
                System.out.println("비겼다");
                break;
            default:
                System.out.println("졌다");
                break;
        }

    }

}
