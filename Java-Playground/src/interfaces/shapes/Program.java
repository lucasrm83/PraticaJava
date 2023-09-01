package interfaces.shapes;

import interfaces.shapes.enums.Color;

public class Program {
    public static void main(String[] args) {
        AbstractShape s1 = new Circle(Color.RED,5.0);
        AbstractShape s2 = new Rectangle(Color.BLUE,6.0,8.0);

        System.out.println("Circle color: "+s1.getColor());
        System.out.println("Circle area: "+String.format("%.3f",s1.area()));
        System.out.println("Rectangle color: "+s2.getColor());
        System.out.println("Rectangle area: "+String.format("%.3f",s2.area()));
    }
}
