class Solution {
    Random rand;
    int total=0;
    int[] nums;
    public Solution(int[] w) {
        int weight=0;
        this.nums=new int[w.length+1];
        for(int i=0;i<w.length;i++){
            weight+=w[i];
            this.nums[i]=weight;
        }
        this.total=weight;
    }
    
    public int pickIndex() {
        if(total==0){return -1;}
        this.rand=new Random();
        int n=this.rand.nextInt(total);
        for(int i=0;i<nums.length;i++){
            if(n<nums[i]){
                return i;
            }
        }
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */