package extendstest;

public class Child extends Parent {

    String name;

    // 오버라이딩 했기때문에 안보임
    void play() {
        System.out.println("놀자!!!!");
    }

    @Override
    void print() {
        super.print();
        System.out.println("자식 메소드");
    }
}
