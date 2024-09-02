package api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Interator {
    public static void main(String[] args) {
        // Iterator
        List<String> list = new ArrayList<>();

        // add() : 순서대로 추가
        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("사과");
        list.add("복숭아");
        list.add("포도");
        list.add("배");

        // list 요소 접근
        // 방법1
        for (int i = 0; i < list.size(); i++) {
            String data = list.get(i);
            // 출력 or 그 외의 작업
        }

        // 방법2 : 향상된 for
        for (String string : list) {

        }

        // 방법3 : Iterator
        Iterator<String> iter = list.iterator();
        while (condition) {

        }
        String data = iter.next();

        // Iterator
        Iterator iter = list.iterator();

        Set<String> set = new HashMap();
        set.add("사과");
        set.add("배");
        set.add("수박");
        set.add("사과");
        set.add("복숭아");
        set.add("포도");
        set.add("배");
    }
}
