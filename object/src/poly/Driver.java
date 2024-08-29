package poly;

public class Driver {
    void drive(Vehicle v) {

        v.run(); // 원래는 부모의 void를 가리키지만
                 // 버스와 택시가 오버라이딩을 했기에 런을 부르면 택시와 버스의 보이드 런이 나옴
                 // 다른 자식 여럿을 처리하고 싶으면 부모를 부르고 자식에게 오버라이딩
    }

}

// Vehicle v = new Bus();
// v 가 접근 할 수 있는 범위 제한

// Bus bus = new Bus();
// 상속 시 메소드 오버라이딩을 하면 부모 메소드는 가려지고 자식 메소드만 실행
