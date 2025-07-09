class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int Max = 0;
        for(int num:nums){
            if(num==1){
                max++;
            }
            else{
                Max=Math.max(Max,max);
                max=0;
            }
        }
        max=Math.max(Max,max);
        return max;
    }
}