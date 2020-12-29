//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sArr = s.toCharArray(); //As Strings are immutable in java ;)
        char[] tArr = t.toCharArray();

        char[] sm = new char[256];
        char[] tm = new char[256];
        
        if(s.length()!=t.length() || s == null || t==null){
            return false;
        }
        
        for (int i = 0, max = tArr.length; i < max; i++) {
            char sc = sArr[i];
            char tc = tArr[i];

            if (sm[sc] == 0 && tm[tc] == 0) { //If both the indexes have values as zero, add some unique value
                sm[sc] = tc;
                tm[tc] = tc;
            } else if (sm[sc] != tm[tc]) {  //else check their values
                return false;
            }
        }
        return true;
    }
}




//Time Complexity: O(n)
//Space Complexity: O(n)

/*

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        
        for(int i =0;i<s.length();i++){
            char currentS = s.charAt(i);           
            char currentT = t.charAt(i);

            if (map1.containsKey(currentS) ){
                if (map1.get(currentS) != currentT ){
                    return false;
                }
            } else if (map2.containsKey(currentT) ){
                if (map2.get(currentT) != currentS ){
                    return false;
                }            
            } else {
                map1.put(currentS, currentT);                
                map2.put(currentT, currentS);

            }
        }
        return true;
        
        
    }
}


*/