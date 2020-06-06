class Solution {
    public int twoCitySchedCost(int[][] costs) {
        if(costs.length==0){return 0;}
        int cost=0,count_A=0,count_B=0;
        Arrays.sort(costs,(a,b)->Math.abs(b[0]-b[1])-Math.abs(a[0]-a[1]));
        for(int i=0;i<costs.length;i++){
            if(costs[i][0]<costs[i][1]){
                if(count_A!=costs.length/2){
                    count_A++;
                    cost+=costs[i][0];
                }
                else{
                    count_B++;
                    cost+=costs[i][1];
                }
            }
            else{
                if(count_B!=costs.length/2){
                    count_B++;
                    cost+=costs[i][1];
                }
                else{
                    count_A++;
                    cost+=costs[i][0];
                }
            }
        }
        return cost;
    }
}