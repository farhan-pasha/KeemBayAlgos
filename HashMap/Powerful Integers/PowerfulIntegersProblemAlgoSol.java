//Time Complexity: O(log(x, bound) * log(y, bound)), where log(a, b) is log base a of b
//Space Complexity: O(log(x, bound) * log(y, bound)), where log(a, b) is log base a of b

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        double imax=0,jmax=0;
        if(x != 1 && y !=1) {
            imax=Math.log(bound)/Math.log(x);
            jmax=Math.log(bound)/Math.log(y);
        }else if (x ==1 && y ==1){
            imax = 1;
            jmax = 1;
        }
        else if (x ==1){
            imax = 1;
            jmax=Math.log(bound)/Math.log(y);

        }else if (y ==1){
            jmax=1;
            imax=Math.log(bound)/Math.log(x);

        }
        
        
        
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i =0;i<=(int)imax;i++){
            for (int j =0;j<=(int)jmax;j++){
                int powerfulIntCandidate = (int)Math.pow(x,i)+ (int)Math.pow(y,j) ;
                if (powerfulIntCandidate <= bound && !hs.contains(powerfulIntCandidate)) {
                    hs.add(powerfulIntCandidate);
                }      
            }
        }
        List<Integer> ls = new ArrayList<>(hs);
        

        return ls;
        
    }
}