//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftToRight[] = new int[nums.length];
        int rightToLeft[] = new int[nums.length];

        int leftToRightProd =1;
        leftToRight[0]=1;
        for(int i=1;i<nums.length;i++){
            leftToRightProd = leftToRightProd*nums[i-1];
            leftToRight[i] =  leftToRightProd;
        }
        
        int rightToLeftProd = 1;
        rightToLeft[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            rightToLeftProd = rightToLeftProd*nums[i+1];
            rightToLeft[i] =  rightToLeftProd;
        }
        
        for(int i=0;i<nums.length;i++){
            nums[i]=leftToRight[i]*rightToLeft[i];
        }
        
        return nums;
    }
}

