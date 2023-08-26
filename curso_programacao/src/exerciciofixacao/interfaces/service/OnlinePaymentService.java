package exerciciofixacao.interfaces.service;

public interface OnlinePaymentService {
    Double paymentFee(Double amount);
    Double interest(Double amount, Integer months);

}
