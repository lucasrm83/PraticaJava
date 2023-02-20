package Trabalhador;

import java.util.Date;

public class HourContract {
    Date data;
    Double valuePerHour;
    Integer hours;

    public double totalValue(){
        return valuePerHour*hours;

    }
}
