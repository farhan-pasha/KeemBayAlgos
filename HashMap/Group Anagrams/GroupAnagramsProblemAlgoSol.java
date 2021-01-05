//Time Complexity: O(n*26*k) - This can be solved with a better solution  - O(n*k*log(k))
//Space Complexity:

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,ArrayList<String>> hs = new HashMap<>();
        
        for (int i =0; i<strs.length ;i++){
            var sortedLetters = getSortedLetters(strs[i]);
            System.out.println("getSortedLetters: "+sortedLetters);
            ArrayList<String> arr = new ArrayList<>();
            if (hs.containsKey(sortedLetters)) {
                arr = hs.get(sortedLetters);
                arr.add(strs[i]);
            } else {
                arr.add(strs[i]);
            }
            hs.put(sortedLetters,arr);
        }
        
        List<List<String>> values = new ArrayList<>(hs.values());
        return values;
        
    }
    
    public String getSortedLetters(String currentString){
        char letters[] = new char[26];
        for (int i =0;i<currentString.length();i++){
            letters[currentString.charAt(i)-97] += 1;
        }
            StringBuilder builder = new StringBuilder(currentString.length());

        //ArrayList<Character> c = new ArrayList<>();
        for(int i =0;i<letters.length;i++){
            
            if (letters[i] >= 1) {
                for(int j=1;j<=letters[i];j++){
                    System.out.println("i: "+i);
                    builder.append((char) i+97);
                }
            } 
            
        }
        
        
        return  builder.toString() ;
    }
}