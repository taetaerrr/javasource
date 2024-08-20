package ch1;

import java.util.*;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 대문자로 시작을 한다면 class or interface 라고 생각하면 됨
        // Scanner는 어디에 선언된 클래스인가 알려줘야 함
        // System.in(키보드) 로부터 입력받기 위해 필요한 객체
        // system.out(화면)
        // 키보드에서 입력받는 프로그램 작성
        Scanner sc = new Scanner(System.in);

        // 화면에 출력하라
        System.out.print("두자리 정수를 입력해 주세요 >> ");

        // 오른쪽 코드부터 해석
        // 사용자가 입력한것을 라인단위로 담아옴 > input에 값을 담기
        // 25엔터 ==> "25"
        String input = sc.nextLine();
        // input값을 변경 "25" ==> 25 로 변경 > num 변수에 값을 담기
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d\n", num);

        sc.close();

    }

}
