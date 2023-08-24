package exerciciofixacao.interfaces.entities;

import java.time.LocalDateTime;

public class Installment {
    private LocalDateTime dueDate;
    private Double amount;

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
