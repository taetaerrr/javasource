package ch2;

public class OperEx3 {
    public static void main(String[] args) {
        // 534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때 학생 한 명 당 몇개를
        // 나눠 가질 수 있고 최종적으로 몇 개가 남는지 출력하기
        // 조건 ) 변수 사용

        int p = 534;
        int s = 30;
        System.out.printf("학생 한 명 당 %d개의 연필을 가질 수 있다.\n", p / s);
        System.out.printf("다 나눠준 후 %d개의 연필이 남는다.\n", p % s);

        // 사다리꼴의 넓이 구하기
        // 윗변 : 5, 아랫변 : 10, 높이 : 7
        // 조건) 변수사용, 소수자리수까지 출력

        int u = 5, d = 10, h = 7;
        double result = (double) (u + d) / 2 * h; // (double)을 넣어 int를 double로 만듦
        System.out.printf("사다리꼴의 넓이는 %.1f이다.\n", result); // % 바로 뒤에 .1을 넣으면 소수점 한자리까지

        // 변수 num의 값보다 크면서 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구한 후 출력
        // 예를 들어 24라면 24보다 크면서 가장 가까운 10의 배수는 30 - 24 = 6 이므로 결과 6이 출력되도록 한다

        int num = 23;
        System.out.printf("%d\n", 10 - num % 10);

    }

}
