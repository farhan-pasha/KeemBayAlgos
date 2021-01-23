//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public boolean checkPossibility(int[] nums) {
        var defect = 0;
        for (int i=0;i<nums.length-1;i++) {
            if (nums[i] <=nums[i+1]){
                continue;
            }else if (defect == 0){
                defect = nums[i];
            } else {
                return false;
            }
        }
        return true;
    }
}

