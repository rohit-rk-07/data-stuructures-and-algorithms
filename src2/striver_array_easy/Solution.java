package striver_array_easy;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
  
    }
    
    public static void main(String[] args) {
    	Solution obj = new Solution();
    	int[] nums = {1,2,3,4,5,6};
        obj.rotate(nums, 2);
    }
}