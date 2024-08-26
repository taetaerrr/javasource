package classtest;

// 클래스 내에 선언순서 상관없음
// 속성, 생성자, 메소드 순으로 주로 함
public class Circle {
    // 속성
    // 반지름(radius) : 3.5
    private double radius;

    // 기능
    // 원의 넓이 : 반지름 * 반지름 * 3.14

    public Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * 3.14;
    }

}
