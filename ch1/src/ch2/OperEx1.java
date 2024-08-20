package ch2;

public class OperEx1 {
    public static void main(String[] args) {
        // 연산자(operator)
        // 1) 산술연산자 : +, -, *, /, %
        // 2) 비교연산자 : >, <, >=, <=, ==, !=
        // 3) 논리연산자 : &&, || !
        // 4) 대입연산자 : =

        // 연산자 우선순위
        // 산술 > 비교 > 논리 > 대입 순으로 수행됨

        // 두 개의 정수형 변수를 선언한 후 사칙연산 프로그램 작성
        int num1 = 10, num2 = 20;

        // 10 + 20 = 30
        System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
        System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
        System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
        // java에선 몫만 출력
        System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
        // System.out.printf("%d / %d = %f\n", num1, num2, (num1 / num2));
        // IllegalFormatConversionException: f != java.lang.Integer
        // % : 나머지 출력
        System.out.printf("%d %% %d = %d\n", num1, num2, (num1 % num2)); // %%해야 %로 출력 \와 같음

        System.out.println();

        // int타입을 float타입(int보다 큰타입)에 담았음
        float result = num1 + num2;
        System.out.printf("%d + %d = %f\n", num1, num2, result);
        result = num1 - num2;
        System.out.printf("%d - %d = %f\n", num1, num2, result);
        result = num1 * num2;
        System.out.printf("%d * %d = %f\n", num1, num2, result);
        result = num1 / num2;
        System.out.printf("%d / %d = %f\n", num1, num2, result);
        // num2를 float타입으로 강제형변환 > 정수/실수인데 무조건 둘중 큰 타입(실수)으로 나오기 때문에 실수로 결과값이 나옴 > 0.5
        result = num1 / (float) num2;
        System.out.printf("%d / %d = %f\n", num1, num2, result);

    }

}
