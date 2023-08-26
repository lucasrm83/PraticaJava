package exerciciofixacao.interfaces.service;

import exerciciofixacao.interfaces.entities.Contract;
import exerciciofixacao.interfaces.entities.Installment;

public class ContractService {


    public void processContract(Contract contract, Integer months){
        OnlinePaymentService onlinePaymentService = new PaypalService();
        double amount = contract.getTotalValue()/months;
        for (int i=1; i<= months;i++){
            double baseInstallment = amount;
            baseInstallment +=onlinePaymentService.interest(amount,i);
            baseInstallment+=onlinePaymentService.paymentFee(baseInstallment);
            Installment installment = new Installment(contract.getDate().plusMonths(i),baseInstallment);
            contract.getInstallments().add(installment);
        }
    }
}
