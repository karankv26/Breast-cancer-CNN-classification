class Solution {
    public int[] runningSum(int[] nums) {
        int n = 0;
        for(int i =0;i<nums.length;i++){
            nums[i]= nums[i]+n;
            n = nums[i];    
        }
        return nums;
    }
}
