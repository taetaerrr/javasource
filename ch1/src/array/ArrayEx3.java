package array;

public class ArrayEx3 {
    public static void main(String[] args) {
        // char 배열 선언, 생성
        // char 배열명[] = {'a', 'b', 'c', 'd'}
        // char[] 배열명
        // 대괄호 위치는 둘 다 가능

        char chArr[] = { 'a', 'b', 'c', 'd' };

        // float 배열 선언, 생성
        float[] flArr = { 12.5f, 13.6f, 14.5f, 13.7f };

        // String 배열 선언, 생성
        String[] strArr = { "A", "B", "C", "D" };
        // ArrayIndexOutOfBoundsException
        System.out.println(strArr[3]);

    }

}
