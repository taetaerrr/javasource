package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 타입 변수명 = 초기화값;
        // F or f 붙여야 가능(필수)
        // 기본적으로 실수는 double로 우선 인식하기에 float 쓸 경우 float를 인지 시켜줘야한다.
        float score = 90.14F;

        // D or D 가능(얘는 생략 가능함 > 하지만 그냥 붙이기)
        double score2 = 98.5D;
        score2 = 90d;

        // 90.0 정수형태를 넣어도 실수 형태로 바뀌어서 나옴 n.n
        System.out.println("score = " + score);
        System.out.println("score2 = " + score2);

        int value1 = 92;
        // 큰타입 = 작은타입(D) - 가능
        // double(8byte) > int(4byte) 가능
        double score3 = value1;
        System.out.println("score3 = " + score3);

        // 작은타입 = 큰타입(불가능) > 처리를 할 수는 있으나 값의 손실이 일어날 수 있음
        // int value2 = score2;

    }

}
