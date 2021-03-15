//Time Complexity: O(n*3)~O(n)
//Space Complexity: O(1)

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main m = new Main();
		int res = m.minCost(new int [][]{{17,2,17},{16,16,5},{14,3,19}});
		System.out.println("Result"+res); //10

	}
	
	public int minCost(int [][] costs) {
	    for (int i =1;i<costs.length;i++){
	        costs[i][0]+=Math.min(costs[i-1][1],costs[i-1][2]);
	        costs[i][1]+=Math.min(costs[i-1][0],costs[i-1][2]);
	        costs[i][2]+=Math.min(costs[i-1][0],costs[i-1][1]);
	    }
	    //Return min from the last row we just calculated!
	   return Math.min(Math.min(costs[costs.length-1][0],costs[costs.length-1][1]),costs[costs.length-1][2]); 

    }
	    
}