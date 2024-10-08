package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 1~45 임의의 숫자를 6개 추출 후 Set에 담기

        Set<Integer> set = new HashSet<>();
        while (set.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }
        System.out.println(set);

        // 정렬이 구현되어 있지 않음
        // set.sort() 는 없음
        // Collections.sort() X // list 밖에 못씀 Set은 x

        // Set ==> List 변환
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);

    }
}
