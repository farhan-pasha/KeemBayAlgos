//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap <Character,String> hs = new HashMap<>();
        HashSet<String> hset = new HashSet<>();
        String sArray [] =  s.split(" ");
        if (sArray.length != pattern.length()) {
            return false;
        }
        
        for (int i =0; i < pattern.length(); i++){
         
            var currentPattern = pattern.charAt(i);
            var currentString = sArray[i];
            if (hs.containsKey(currentPattern)) {
                if (!hs.get(currentPattern).equals(currentString)) {
                    return false;
                }
            } else if (hset.contains(currentString)){
                return false;
            } else {
            hs.put(currentPattern,currentString);
            hset.add(currentString);
            }
        }
        
        return true;
        
    }
}