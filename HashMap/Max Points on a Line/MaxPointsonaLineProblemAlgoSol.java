class Solution {
    public int maxPoints(int[][] points) {
        HashMap<Float,Integer> hs = new HashMap<>();
        int max =1;
        for (int i=0;i<points.length;i++){
            for (int j=i+1;j<points.length;j++){
                float currentSlope = getSlope(points[i],points[j]);
                int currentValue = 1;
                if (hs.containsKey(currentSlope)) {
                    currentValue = hs.get(currentSlope) + 1;
                    if(max<currentValue){
                        max = currentValue;
                    }
                }
                System.out.println("fOR " + points[i][0]+"," +points[i][1] + " AND " + points[j][0]+","+points[j][1] + " " + " currentSlope " +currentSlope+" currentValue "+currentValue);

                        hs.put(currentSlope,currentValue);
                
            }
        }
        return max;
    
    }
    
    public float getSlope (int [] coordinate1, int [] coordinate2) {
        System.out.println((coordinate2[1]-coordinate1[1])+" "+(coordinate2[0]-coordinate1[0])+"");
        if ((coordinate2[1]-coordinate1[1]) == 0 || (coordinate2[0]-coordinate1[0]) == 0 ){
            System.out.println("here?");
            return 0;
        }
        return (float)((float)(coordinate2[1]-coordinate1[1])/ (float)(coordinate2[0]-coordinate1[0]));
    } 
}