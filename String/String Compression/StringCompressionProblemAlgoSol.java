//Time Complexity: 
//Space Complexity:

class Solution {
    public int compress(char[] chars) {
        
        int index=0,j=0;
        for(int i=0;i<chars.length;i++){
            
            if (chars[i] == chars[j]) {
                continue;
            }
            
            chars[index++] = chars[i];
            
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