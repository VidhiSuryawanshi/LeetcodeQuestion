class Solution {
    public int search(int[] nums, int target) {
        int pivot = FindPivot(nums);
        if(pivot==-1){
            return BinarySearch(nums,0,nums.length-1,target);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return BinarySearch(nums,0,pivot-1,target);
        }
        return BinarySearch(nums,pivot+1,nums.length-1,target);
    }

    static int FindPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }



    public int BinarySearch(int [] nums,int start,int end,int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}