// 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

// Intuition:

// 1. Build the initial window of size k by summing the first k elements.

// 2. Check if this window's average is >= threshold.

// 3. Slide the window across the array:
    // Add the new element coming in.
    // Subtract the element going out.
    // After each slide, check again if the current window sum meets the condition.
    // Count how many windows satisfy the requirement.

// The solution is O(n) as we are adding and removing elements once

public class NumSubarraysAvgGEThreshold {

    public int numOfSubarrays(int[] arr, int k, int threshold){

        double currAvg = 0, val = 0;

        int count = 0;

        for(int i = 0; i < k; i++){

            val += arr[i];
        }

        currAvg = val / k;

        if(currAvg >= threshold ){

            count++;
        }

        for(int i = k; i < arr.length; i++){

            val += arr[i] - arr[i - k]; 
            
            currAvg = val / k;

            if(currAvg >= threshold){

                count++;
            }
        }

        return count;


    }
    
}
