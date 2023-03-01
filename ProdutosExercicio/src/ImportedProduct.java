import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportedProduct extends Product{
    private Double customFee;

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    @Override
    public String priceTag(){
        return getName()+" $ "+totalPrice()+(String.format("(Custom fee: $ %.2f", customFee));
    }

    public Double totalPrice(){
        double sum = getPrice()+customFee;
        return sum;
    }





    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
}
