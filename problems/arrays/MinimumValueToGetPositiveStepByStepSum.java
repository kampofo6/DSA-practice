/* 
1413. Minimum Value to Get Positive Step by Step Sum

initialize sum & lowestNum, summate nums[i] (prefix sum), 
use Math.min to compare sum & lowestNum, if lowestNum > 0, return 1, else return 1 - lowestNum.

*/

public class MinimumValueToGetPositiveStepByStepSum {
    

    public int minStartvalue( int[] nums){

        int sum = 0;
        int lowestNum = 0;
        int startVal = 0;

        for(int i = 0; i < nums.length; i++){

            sum += nums[i];

            lowestNum = Math.min(lowestNum, sum);

            if(lowestNum > 0){
                return 1;
            }

            else{

                startVal = 1 - lowestNum;
            }
        }

        return startVal;




    }

}