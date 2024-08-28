package extendstest;

public class ChildEx {
    public static void main(String[] args) {

        // 부모 클래스는 자신에게 선언된 멤버와 메소드만 접근 가능
        Parent parent = new Parent();

        // play를 접속할 수 있음
        Child child = new Child();

        // 선언된 위치를 잘 봐야함

        child.print(); // 부모 메소드 호출 가능
        child.play(); // 자식 메소드 호출

    }

}
