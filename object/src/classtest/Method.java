package classtest;

public class Method {
    // method 작성

    // 리턴타입 메소드명(){}
    // 정수형(byte,short,int,long), 실수형(float,double), 논리형(boolean), 문자형(char,String),
    // 배열(타입[]), void

    // void가 아닌이상 중괄호 안에 return을 넣어야 한다는 의미가 있음
    // return 다음엔 타입에 맞는 단어가 와야함
    int method1() {
        return 0;
    }

    double method2() {
        return 12.4;
    }

    char method3() {
        return 'a';
    }

    String method4() {
        return "abc";
    }

    int[] method5() {
        return new int[2];
    }

    void method6() {
        return; // 없어도됨
    }
}
