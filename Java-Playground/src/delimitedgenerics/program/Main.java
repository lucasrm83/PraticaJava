package delimitedgenerics.program;

import delimitedgenerics.entities.Product;
import delimitedgenerics.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        String path = "C:\\Temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line!= null){
                String[] data = line.split(",");
                list.add(new Product(data[0],Double.parseDouble(data[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(x);

        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

}
