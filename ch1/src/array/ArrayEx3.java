package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        // [] : 인덱스

        // char 배열 선언, 생성
        // char 배열명[] = {'a', 'b', 'c', 'd'}
        // char[] 배열명
        // 대괄호 위치는 둘 다 가능

        char chArr[] = { 'a', 'b', 'c', 'd' };

        System.out.println(Arrays.toString(chArr)); // [a, b, c, d]

        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + "\t"); // a b c d D
        }
        System.out.println();
        // 항상된 for 문
        // chArr이라는 배열을 c에 담았기 때문에 c만 출력해도 모든 배열이 나옴
        for (char c : chArr) {
            System.out.print(c + "\t");
        }

        System.out.println();
        // float 배열 선언, 생성
        float[] flArr = { 12.5f, 13.6f, 14.5f, 13.7f };

        for (float f : flArr) {
            System.out.print(f + "\t");
        }

        // String 배열 선언, 생성
        String[] strArr = { "A", "B", "C", "D" };
        // ArrayIndexOutOfBoundsException
        // System.out.println(strArr[4]);

    }

}
