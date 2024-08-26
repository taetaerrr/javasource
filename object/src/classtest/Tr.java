package classtest;

public class Tr {
    private int baseLine; // 밑변(baseLine)
    private int height;

    public Tr(int baseLine, int height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    // 기능
    // 너비 리턴
    double getArea() {
        return baseLine * height / 2.0;
    }

    // 밑변 변화
    public void setBaseLine(int baseLine) {
        this.baseLine = baseLine;
    }

    // 높이 변화
    public void setHeight(int height) {
        this.height = height;
    }
}
