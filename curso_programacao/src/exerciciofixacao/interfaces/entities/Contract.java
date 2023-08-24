package exerciciofixacao.interfaces.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDateTime date;
    private Double totalValue;
    private List<Installment> installments;

}
