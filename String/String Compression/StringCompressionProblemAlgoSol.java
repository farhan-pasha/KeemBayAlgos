//Time Complexity: O(n)
//Space Complexity:O(1)

class Solution {
    public int compress(char[] chars) {
        
        int index=0,j=0;
        for(int i=0;i<chars.length+1;i++){
            
            if (i<chars.length && chars[i] == chars[j]) {
                continue;
            }
            
            chars[index++] = chars[j];
            
            if (i-j>1){
                String counter = i-j+"";
                for (char c: counter.toCharArray()){
                    chars[index++]=c;
                }
            }
            
            j=i;
            
            
        }
        return index;
        
    }
}