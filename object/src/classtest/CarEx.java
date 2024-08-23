package classtest;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        // 앞에 저장해두었던 Car에 있던 string, int,for,backward를 car에 불러서 저장
        // => 여기서 쓸 수 있음
        Car car = new Car();

        // car 멤버변수, 메소드 접근 가능해짐
        System.out.println("제조사 : " + car.company);
        System.out.println("모델 : " + car.model);
        System.out.println("색상 : " + car.color);
        System.out.println("최대속력 : " + car.maxSpeed);

        // 속성 변경 가능
        car.company = "현대";
        car.color = "white";
        car.maxSpeed = 200;
        car.model = "소나타";

        System.out.println("제조사 : " + car.company);
        System.out.println("모델 : " + car.model);
        System.out.println("색상 : " + car.color);
        System.out.println("최대속력 : " + car.maxSpeed);

        car.forward();
        car.backward();
    }

}
