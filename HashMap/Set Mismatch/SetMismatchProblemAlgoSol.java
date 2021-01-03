//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public int[] findErrorNums(int[] nums) {
	//Solution 1:
        int missing = 0,repeat=0;
        for (int i =0;i<nums.length;i++){
            missing ^=Math.abs(nums[i])^(i+1); //used in calculating c
            if(nums[Math.abs(nums[i])-1]<0)repeat=Math.abs(nums[i]);   //used in calculating repeat
            else nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];//used in calculating repeat
        }
        
        missing ^= repeat;

        return new int[]{repeat,missing}; 



        /*
	Solution 2:
        Time complexity : O(n)
        Space complexity: O(n)
        
        int[] array = new int[nums.length+1];
        for (int i =0; i<nums.length; i++){
            array[nums[i]] += 1;
        }
        int repeat=0,missing=0;
        for (int i =1; i<array.length; i++){
            if(array[i]==2){
                repeat = i;
            }
            if(array[i]==0){
                missing = i;
            }
            
        }
        return new int[]{repeat,missing}; 
        */
    }

}


