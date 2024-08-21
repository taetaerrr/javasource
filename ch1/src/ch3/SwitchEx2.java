package ch3;

public class SwitchEx2 {
    public static void main(String[] args) {
        char grade = 'B'

        switch (grade) {
            case 'A' :
            case 'a' :
                System.out.println("우수회원");
                break;
            case 'B'
            case 'b'
                System.out.println("일반회원");
                break;
            default:
                System.out.println("손님");
                break;
        }

        // if ~ else if ~ else
        // 범위를 체크 할때는 if문이 편하고 단일 값을 체크하는 것은 switch가 편하다 하지만 둘 다 가능
        if (grade == 'A' || grade == 'a') {
            System.out.println("우수회원");            
        } else if (grade == 'B'|| grade == 'b') {
            System.out.println("일반회원");
        } else 
            System.out.println("손님");
    }

}
