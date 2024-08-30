package api;

import java.net.Socket;

public class StringEx2 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));

    }

    String src = "12345AB12AB345AB";

    static int count(String src, String target) {
        // src에서 target의 문자열이 몇번 나오는지 카운트 한 후 리턴
        int count = 0;
        // 찾을 위치
        int pos = 0;

        // pos = src.indexOf(target, pos); // 5
        // if (pos != -1) count += 1;

        // // 7
        // pos += target.length();
        // pos = src.indexOf(target, pos);
        // if (pos != -1) count += 1;

        // pos += target.length();
        // pos = src.indexOf(target, pos);
        // if (pos != -1) count += 1;

        while ((pos = src.indexOf(target, pos)) != -1) {
            count += 1;
            pos += target.length();
        }

        // for (int i = 0; i < src.length(); i++) {
        // if (src.indexOf("AB", i) != -1) {
        // count++;
        // i++;
        // }
        // }

        return count;
    }
}
