package array;

import java.util.Scanner;

public class ArrayEx10 {
    public static void main(String[] args) {
        // 원래의 단어 맞추기
        String[] words = { "television", "computer", "mouse", "phone" };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            // 문제 출제
            char[] question = words[i].toCharArray();

            for (int j = 0; j < question.length; j++) {
                int pos = (int) (Math.random() * question.length);

                char temp = question[j];
                question[j] = question[pos];
                question[pos] = temp;
            }
            System.out.printf("Q%d) %s의 원래 단어는 무엇일까요?\n", i + 1, new String(question));
            String input = sc.nextLine();
            // String 쓸 때는 == 쓰면 안나옴 equals()써야 나옴
            if (input.equals(words[i])) {
                System.out.println("정답입니다.");
            } else {
                System.out.println("오답입니다.");
            }

        }

    }
}
