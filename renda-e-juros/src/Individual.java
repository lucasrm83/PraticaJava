public class Individual extends Person{
    private Double healthExpenditures;


    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double juros() {
        if (getAnualIncome()<20000){
            return getAnualIncome()*0.15+healthExpenditures*0.50;
        }
        else {
            return getAnualIncome()*25+healthExpenditures*0.50;
        }
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
