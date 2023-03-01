package metodoAbstarto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.print("Rectangle or circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Color (BLACK, RED, BLUE): ");
            Color color = Color.valueOf(sc.next());
            if(ch =='r'){
                System.out.print("Widht: ");
                double widht = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Shape sr = new Rectangle(color,widht,height);
                list.add(sr);

            }
            if (ch == 'c'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Shape sci = new Circle(color,radius);
                list.add(sci);
            }


            
        }
        System.out.println("SHAPE AREAS: ");
        for (Shape s:list) {
            System.out.println(String.format("%.2f",s.area()));


        }

    }
}
