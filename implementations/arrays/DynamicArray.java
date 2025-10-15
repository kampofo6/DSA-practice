import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

    public static void main(String args[]){

        List<String> fruits = new ArrayList<>();

        fruits.add("Strawberry");
        fruits.add("Blueberry");
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println("First fruit: " + fruits.get(0));

        fruits.add("Mango");

        System.out.println("Last fruit: " + fruits.get(fruits.size() - 1));


    }
    
}
