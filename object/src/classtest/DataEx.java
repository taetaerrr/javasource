package classtest;

public class DataEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        // change(d.x); int x 값 복사
        change(d); // d앞이 대문자로 시작하는 참조타입이기에 주소가 그대로 복사됨(Data d)
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    // static void change(int x){

    static void change(Data d) {
        d.x = 10000;
        System.out.println("change() : x = " + d.x);
    }

}
