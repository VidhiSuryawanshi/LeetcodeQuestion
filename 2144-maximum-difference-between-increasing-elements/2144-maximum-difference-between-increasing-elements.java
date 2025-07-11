class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int maxDiff = -1;
        for(int i=0;i<nums.length;i++){
            if(min<nums[i]){
                int diff = nums[i]-min;
                maxDiff = Math.max(maxDiff,diff);
            }
            else{
                min=nums[i];
            }
        }
        return maxDiff;
    }
}