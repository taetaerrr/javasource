package extendstest;

public class CarEx {
    public static void main(String[] args) {
        // Car 인스턴스를 생성
        // Car car = new Car(); 직접적인 인스턴스 생성은 불가

        // 다향성을 이용한 인스턴스 생성만 가능
        Car car = new SportsCar();
        car.drive();
        car.stop();

    }
}
