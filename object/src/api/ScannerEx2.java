package api;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // System.in : 키보드
        Scanner sc = new Scanner(System.in);

        String[] argArr = null;
        while (true) {
            String prompt = ">>";
            System.out.print(prompt);

            // hello
            // hello 123
            String input = sc.nextLine();

            // 양쪽 공백 제거
            input = input.trim();

            // 문자열 분리 : 공백을 기준
            // "공백+" : 공백이 최소1 ~ 무한
            argArr = input.split(" +");
            String cmd = argArr[0].toLowerCase();
            // System.out.println(Arrays.toString(argArr));

            if (cmd.equals("q")) {
                System.exit(0);

            } else {
                // q 가 아니면 배열 출력
                for (String s : argArr) {
                    System.out.println(s);
                }
            }
            // 소문자로 변경

            // q or Q 이면 while 종료

        }
    }
}
