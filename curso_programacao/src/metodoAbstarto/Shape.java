package metodoAbstarto;

public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }
    public abstract double area();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
