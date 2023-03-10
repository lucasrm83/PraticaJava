public class OrderItem {
    private Integer quantity;
    private Double price;

    public OrderItem() {

    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }


    private Product product;


    public Double subTotal(){
        double sum;
        return sum =quantity*price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getProduct().getName()+", $");
        sb.append(String.format("%.2f", price));
        sb.append(", Quantity: "+quantity);
        sb.append(", Subtotal: $"+String.format("%.2f",subTotal()));
        return sb.toString();

    }

}
