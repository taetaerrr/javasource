public class TimeEx {
    public static void main(String[] args) {
        Time time = new Time();

        // 시 설정
        // 직접적인 시간 설정은 막음
        // time.hour = 100;

        // 무조건 메소드를 통해서 속성 변경 원하지 않는 값을 방지하기 위함 : 원하는 조건 설정 가능
        time.setHour(100);
    }

}
