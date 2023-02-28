package polimorfismo;

public class OutsourcedEmployee extends Employee{
    private Double adicionalCharge;


    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double adicionalCharge) {
        super(name, hours, valuePerHour);
        this.adicionalCharge = adicionalCharge;
    }

    public OutsourcedEmployee() {
    }

    public Double getAdicionalCharge() {
        return adicionalCharge;
    }

    public void setAdicionalCharge(Double adicionalCharge) {
        this.adicionalCharge = adicionalCharge;
    }
    @Override
    public double payment(){
        return super.payment()+ adicionalCharge*1.1;
    }
}
