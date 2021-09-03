
class Solution {
    
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int even = 0;
        int odd = n;
        for(int i = 0; i < nums.length ; i++){
            if (i%2==0){
                arr[i] = nums[even++];
            }else{
                arr[i] = nums[odd++];
            }
            }
        return arr;
    }
}
