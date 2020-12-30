Time Complexity: O(n)
Space Complexity: O(n)

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {        
        HashMap<Integer,Integer> hs = new HashMap<>();

        for (int i =0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                int absoluteDifference = Math.abs(hs.get(nums[i]) - i);
                if(absoluteDifference <= k){
                    return true;
                }
            }
            hs.put(nums[i],i); //Update the value by latest index
        }
        return false;
    }
}