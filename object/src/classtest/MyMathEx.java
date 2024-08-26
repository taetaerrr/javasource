package classtest;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        // 메소드 호출 후 결과 출력
        long result1 = myMath.add(10L, 5L);
        System.out.println("연산 결과 : " + result1);

        long result2 = myMath.subtract(10L, 5L);
        System.out.println("연산 결과 : " + result2);

        long result3 = myMath.multiply(10L, 5L);
        System.out.println("연산 결과 : " + result3);

        // 자동 형변환
        double result4 = myMath.divide(5L, 0L);
        int result5 = myMath.divide(5, 0);
        System.out.println("연산 결과 : " + result4);
        System.out.println("연산 결과 : " + result5);

        System.out.println("add(10L, 5L) = " + result1);

        MyMath2 math2 = new MyMath2(15, 5);
        // 인스턴스 메소드 사칙연산
        System.out.println("15 + 5 = " + math2.add());
        System.out.println("15 - 5 = " + math2.subtract());
        System.out.println("15 * 5 = " + math2.multiply());
        System.out.println("15 / 5 = " + math2.divide());

        // 클래스 메소드 사칙연산
        System.out.println("15 + 5 = " + MyMath2.add(15, 5));
        System.out.println("15 - 5 = " + MyMath2.subtract(15, 5));
        System.out.println("15 * 5 = " + MyMath2.multiply(15, 5));
        System.out.println("15 / 5 = " + MyMath2.divide(15, 5));
    }
}
