//1493. Longest Subarray of 1's After Deleting One Element

public class LongestSubarrayOnesAftDeletingElement {

    public int longestSubarray(int[] nums){

        int count = 0, left = 0, maxLen = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] == 0){

                count++;

            }

            while(count > 1){
                
                if(nums[left] == 0){
                    count--;
                    left++;
                }
                else{

                    left++;
                }

            }

            maxLen = Math.min(maxLen, right - left + 1);
        }

        return maxLen - 1;
    }
    
}
