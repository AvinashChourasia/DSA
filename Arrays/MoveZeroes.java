

class Solution {
    public void moveZeroes(int[] nums) {
        
        int k = 0;
        int count = 0;
        for(int item:nums){
            if(item!=0){
                nums[k++] = item;
            }
            else{
                count++;
            }
        }

        for(int i=0;i<count;i++){
            nums[k++] = 0;
        }

    }
}
