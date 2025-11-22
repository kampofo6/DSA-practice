import java.util.HashSet;

public class HashSets {
    
    HashSet <Integer> mySet = new HashSet<>();


    public HashSets(){

        for(int i = 0; i < 5; i++){

        mySet.add(i);
    }


    }

    public void printSet() {

        System.out.println(mySet);
        
    }

    public static void main(String args[]){

        HashSets hs = new HashSets();

        hs.printSet();
}

}



