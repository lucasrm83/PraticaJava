package devDojo.datas.test;

import java.time.LocalDate;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.plusDays(2);
        System.out.println(now);
    }
}
