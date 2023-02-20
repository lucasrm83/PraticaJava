package Trabalhador;

import java.util.Date;

public class HourContract {
    Date data;
    Double valuePerHour;
    Integer hours;

    public double totalValue(){
        return valuePerHour*hours;

    }

    public HourContract(Date data, Double valuePerHour, Integer hours) {
        this.data = data;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
