package ch3;

public class SwitchEx1 {
    public static void main(String[] args) {
        // switch : if~ else if ~ else 대체

        // switch (args) {
        // case value:

        // break;

        // default:
        // break;
        // }

        int random = (int) (Math.random() * 6) + 1;
        // break가 없으면 전부 연속적으로 출력되기 때문에 break가 중요함
        switch (random) {
            case 1: // random == 1
                System.out.println("주사위 1이 나옴");
                break;
            case 2: // random == 2
                System.out.println("주사위 2가 나옴");
                break;
            case 3: // random == 3
                System.out.println("주사위 3이 나옴");
                break;
            case 4: // random == 4
                System.out.println("주사위 4가 나옴");
                break;
            case 5: // random == 5
                System.out.println("주사위 5가 나옴");
                break;
            default: // random == 6
                System.out.println("주사위 6이 나옴");
                break;
        }
    }

}
