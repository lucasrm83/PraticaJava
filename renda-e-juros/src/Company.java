public class Company extends Person{
    private Integer employee;

    public Company(String name, Double anualIncome, Integer employee) {
        super(name, anualIncome);
        this.employee = employee;
    }

    @Override
    public double juros() {
        if (employee>10){
            return getAnualIncome()*0.14;
        }
        else {
            return getAnualIncome()*0.16;
        }
    }

    public Integer getEmployee() {
        return employee;
    }

    public void setEmployee(Integer employee) {
        this.employee = employee;
    }
}
