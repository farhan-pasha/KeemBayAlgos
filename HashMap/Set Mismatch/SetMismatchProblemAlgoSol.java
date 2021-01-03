class Solution {
    public int[] findErrorNums(int[] nums) {
        /*
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
        
        
        
        /*
        (1 ^ 2 ^ 3 ^ .. ^ n) ^ (1 ^ 2 ^ 3 ^ .. ^ n) = 0
Same way,(1 ^ 2 ^ 3 ^ .. ^ n) ^ (1 ^ 2 ^ 2 ^ .. n)  = 3 ^ 2 (other will get cancelled), suppose it to be missing->3 and repeat->2
Let c = missing ^ repeat, if we can find 'repeat' which appears 2 times in the original array, 'missing' can be easily calculated by missing= c ^ repeat.
        
        
        */
        int missing = 0,repeat=0;
        for (int i =0;i<nums.length;i++){

            missing ^=Math.abs(nums[i])^(i+1); //used in calculating c
            
            
            if(nums[Math.abs(nums[i])-1]<0)repeat=Math.abs(nums[i]);   //used in calculating repeat
            else nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];//used in calculating repeat
            
            /*
            logic here is, change the sign of the number on the index of nums[i] -1. If you encounter later that the sign was changed earlier, which means we already saw somewhere that number.
            Note, always use absolute value when accessing number in nums[i] -1 index as we do not want sign to affect our operation.
            eg: nums =  3,2,2
                when i =0:
                    Math.abs(nums[i])-1 =>   3-1  => 2
                    nums[Math.abs(nums[i])-1] => 2 (value at index 3 in nums)
                    as the above is greater than 0, else part will be executed and now nums will be nums = 3,2,-2    
                 when i =1:
                    Math.abs(nums[i])-1 =>   2-1  => 1
                    nums[Math.abs(nums[i])-1] => 2 (value at index 2 in nums)
                    as the above is greater than 0, else part will be executed and now nums will be nums = 3,-2,-2
                    
                 when i =2 (last):
                    Math.abs(nums[i])-1 =>   2-1  => 1
                    nums[Math.abs(nums[i])-1] => 2 (value at index 2 in nums)
                    as the above is less than 0, if part will be executed and repeat will be repeat = 2 
            */        
                        
        }
        
        missing ^= repeat;
            
            

    
        return new int[]{repeat,missing}; 
    }

}
