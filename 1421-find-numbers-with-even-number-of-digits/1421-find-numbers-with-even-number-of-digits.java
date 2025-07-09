class Solution {
    public int findNumbers(int[] nums) {
        int even =0;
        for(int i=0;i<nums.length;i++){
            int c=countDigit(nums[i]);
            if(c%2==0){
                even++;
            }
        }
        return even;
    }

    public int countDigit(int n){
        int count = 0;
        while(n!=0){
            int rem=n%10;
            count++;
            n/=10;
        }
        return count;
    }
}