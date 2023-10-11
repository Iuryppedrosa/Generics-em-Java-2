package problema2.application;

import problema2.Service.CalculationService;
import problema2.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        String path = "/Users/iurypedrosa/Desktop/Mesa/Sistemas de Informação./CURSOS/Back End/Java-Nelio-Udemy/Secao19/Secao19/src/problema2/Elementos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null)    {
                String fields [] = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most Expensive: ");
            System.out.println(x);
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
