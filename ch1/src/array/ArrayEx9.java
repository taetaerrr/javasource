package array;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Yi" };

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "\t");
            System.out.println();

            // 문자열 하나를 가져와서 캐릭터 배열로 바꿈 [k, i, m](쪼개기)
            char[] chArr = names[i].toCharArray();

            // System.out.println(Arrays.toString(chArr));

            for (int j = 0; j < chArr.length; j++) {
                int pos = (int) (Math.random() * chArr.length);

                char temp = chArr[j];
                chArr[j] = chArr[pos];
                chArr[pos] = temp;
            }
            // System.out.println(Arrays.toString(chArr)); // [m, i, K]
            System.out.println(new String(chArr)); // mik
        }
    }
}
