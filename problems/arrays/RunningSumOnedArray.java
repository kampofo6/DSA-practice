// Intuition: in place, using a for loop starting at index 1, 
// summate subsequent array values assigning them to nums[i]

public class RunningSumOnedArray {

    public int[] runningSum( int [] nums){


        for(int i = 1; i < nums.length; i++){

            nums[i] = nums[i - 1] + nums[i];

        }

        return nums;
    }

    
}
