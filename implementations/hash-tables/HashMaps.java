import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

       HashMap<Integer, Integer> myMap = new HashMap<>();

       myMap.put(3, 6);
       myMap.put(4,8);
       myMap.put(5, 10);


      System.out.println("Verifying Key: " + myMap.containsKey(3)); 

      System.out.println("Value at key 4: " + myMap.get(4));

      myMap.remove(3);

      System.out.println("Size of our Hashmap: " + myMap.size());

      for(int key: myMap.keySet()){
        System.out.println("Key: "+ key);
        
      }

      for(int val: myMap.values()){
        System.out.println("Value: " + val);
      }
        

    }

}
