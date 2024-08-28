package poly;

public class ChildEx {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // 조상클래스타입 참조변수 = 자손클래스 인스턴스
        // 상속관계일 때
        // 부모타입 = 자식타입
        Parent parent2 = new Child();

        // child, parent2 변수가 접근할 수 있는 범위가 다름
        System.out.println(child.age + " " + child.name);
        child.play();
        child.print();

        // parent2가 접근할 수 있는 메소드, 변수
        System.out.println(parent2.age);
        parent2.print();
    }
}
