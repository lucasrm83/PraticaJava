package heranca;

public class BusinessAccount extends Account{
    private Double loanlimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanlimit) {
        super(number, holder, balance);
        this.loanlimit = loanlimit;
    }

    public Double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(Double loanlimit) {
        this.loanlimit = loanlimit;
    }




    public void loan(double amount){
        if (amount<= loanlimit){
            deposit(amount);
        }




    }
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -=2.0;

    }

    @Override
    public String toString() {
        return "BusinessAccount{" +
                "loanlimit=" + loanlimit +
                ", balance=" + balance +
                '}';
    }
}
