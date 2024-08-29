package modifier;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekEx {
    public static void main(String[] args) {
        Week today = null;

        // 날짜와관련된 클래스 : LocalDate
        LocalDate now = LocalDate.now();
        System.out.println(now);

        System.out.println(now.getDayOfWeek());
        DayOfWeek week = now.getDayOfWeek();
        switch (week.getValue()) {
            case 1:
                today = Week.MONDAY;
                break;
            case 2:
                today = Week.TUESDAY;
                break;
            case 3:
                today = Week.WENDSDAY;
                break;
            case 4:
                today = Week.THURSDAY;
                break;
            case 5:
                today = Week.FRIDAY;
                break;
            case 6:
                today = Week.SATURDAY;
                break;
            default:
                today = Week.SUNDAY;
                break;
        }

        System.out.println("오늘 요일 : " + today);
        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축루를 합니다.");
        } else {
            System.out.println("공부를 합니다.");
        }

    }
}
