package interfaces.parking;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Parking {
    private String model;
    private LocalDateTime pickup;
    private LocalDateTime carReturn;
    private Double priceHour;
    private Double priceDay;

    public Parking(String model, LocalDateTime pickup, LocalDateTime carReturn, Double priceHour, Double priceDay) {
        this.model = model;
        this.pickup = pickup;
        this.carReturn = carReturn;
        this.priceHour = priceHour;
        this.priceDay = priceDay;
    }

    public Double price(){
        Long result = pickup.until(carReturn, ChronoUnit.MINUTES);
        Double val = Double.valueOf(result);
        result = (result/60);
        if(val/60>result){
            result++;
        }



        if (result>12){
            return (priceHour*result);
        }
        else {
            return (priceHour*result);
        }
    }
    public Double tax(){
        if (price()<100){
            return price()*0.2;
        }
        else {
            return price()*0.15;
        }
    }
    public Double totalPrice(){
        return price()+tax();
    }

    @Override
    public String toString() {
        return "INVOICE: \n" +
                "Basic Payment: " + price() + "\n" +
                "Tax: " + tax() + "\n"+
                "Total Payment:" + totalPrice();
    }
}
