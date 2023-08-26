package exerciciofixacao.interfaces.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDateTime date;
    private Double totalValue;
    private List<Installment> installments = new ArrayList<>();


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
