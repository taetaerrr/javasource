package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = null;

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();

        // 자동 형변환
        car = fe; // Car car = new FireEngine();

        fe2 = (FireEngine) car;
        fe2.water();

        // car2에 fe가 아닌 부모인 Car가 담겼기 때문
        // 부모의 형질로 설정된 car2를 자식의 형질로 바꿀 수 없음
        Car car2 = new Car();
        // ClassCastException (실행시(런타임) 오류 발생) : instanceof 연산자로 해결
        if (car2 instanceof FireEngine) {
            fe = (FireEngine) car2;
            fe.drive();
        }

        if (car2 instanceof Car) {

        }
    }

}
