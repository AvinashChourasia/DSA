

class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        int maxReach = nums[0];
        int step = nums[0];
        int jump = 1;
        if(n==1){
            return true;
        }
        else if(nums[0] == 0){
            return false;
        }
        else{
            for(int i=1;i<n;i++){
                if(i==n-1){
                    return true;
                }
                maxReach = Math.max(maxReach,i+nums[i]);
                step--;
                if(step==0){
                    jump++;
                    if(maxReach <= i){
                        return false;
                    }
                    step = maxReach-i;
                }
            }
        }
        return true;

    }
}
