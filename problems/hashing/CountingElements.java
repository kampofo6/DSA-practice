/*
1426. Counting Elements
Intuition:
Use a HashSet for O(1) lookups: populate it with all elements, 
then iterate through the original array checking if each element + 1 exists in the set.
*/

package problems.hashing;
import java.util.HashSet;


public class CountingElements {

    public int countElement(int[] arr ){

         HashSet<Integer> set = new HashSet<>();
        int count = 0;
        
        for(int a : arr){
            
            set.add(a);
        }
        
        for(int i = 0; i < arr.length; i++){
            
            if(set.contains(arr[i] + 1)){
                count++;
            }
        }
        
        return count;
        


    }
    
}
