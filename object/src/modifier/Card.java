package modifier;

import java.nio.file.WatchEvent.Kind;

public class Card {
    final int NUMBER;
    final String KIND;

    static int width = 100;
    static int height = 150;

    // final이 붙었기 때문에 선언할때 또는 생성자에서 초기화를 해줘야함
    Card(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card() {
        this("HEART", 2);
    }

    @Override
    public String toString() {
        return KIND + " " + NUMBER;
    }
}
