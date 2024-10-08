package inter;

public interface RemoteControl {
    // public static final 이 있는상태
    // static이 붙은거 접근하려면 인터.클래스
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리");
        } else {
            System.out.println("무음해제");
        }
    }

    static void changeBattery() {
        System.out.println("건전지 교체");
    }
}
