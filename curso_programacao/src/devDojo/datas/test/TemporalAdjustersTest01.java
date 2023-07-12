package devDojo.datas.test;

import java.time.LocalDate;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfMonth());
    }
}
