
/*
 * For this problem i implemented the sliding window approach. 
 * 
 * Intuition: intitialize Max window variable, left/right pointer & zero counter.
 * In a for loop grow the window(with RP), if we encounter a 0 count it, 
 * while our condition is broken check the value at LP, if its a 0 remove it from the window & shrink window
 * otherwise just shrink window, use Math.max method to compare maxNum with the size of our current window
 * return maxNum
 */

public class MaxConsecutiveOnesIII {

   public int longestOnes(int[] nums, int k){

        int maxNum = 0;
        int zeroCount = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] == 0){
                zeroCount++;
            }

            while(zeroCount > k){

                if(nums[left] == 0){
                    --zeroCount;
                    left++;
                }
                else{
                    left++;
                }
            }

            maxNum = Math.max(maxNum, right - left + 1);


        }

        return maxNum;
   }

}
