class Solution {
    public void sortColors(int[] nums) {
        int low=0,high=nums.length-1,mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }

    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}