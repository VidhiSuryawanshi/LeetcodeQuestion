class Solution {
    public int singleNonDuplicate(int[] nums) {
        int unique=0;
        for(int num:nums){
            unique^=num;
        }
        return unique;
    }
}