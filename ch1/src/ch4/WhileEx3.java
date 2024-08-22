package ch4;

public class WhileEx3 {
    public static void main(String[] args) {

        while (true) {
            // 주사위 2개를 굴려 두개의 합이 5와 같으면 반복문 종료
            // random 1~6
            int x = (int) (Math.random() * 6) + 1;
            int y = (int) (Math.random() * 6) + 1;
            System.out.printf("(%d, %d)", x, y);

            if (x + y == 5) {
                break;
            }

        }

    }

}
