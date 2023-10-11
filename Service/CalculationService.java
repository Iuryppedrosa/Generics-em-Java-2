package problema2.Service;

import problema2.entities.Product;

import java.util.Comparator;
import java.util.List;

public class CalculationService {
    public static <T extends Comparable<T>> T max(List<T> list){ //sendo static nao precisa instanciar essa classe
        if(list.isEmpty()){
            throw new IllegalStateException("List cant be empty");
        }
        T max = list.get(0);

        for(T item : list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}
