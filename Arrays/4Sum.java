

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> q = new ArrayList<>();
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int low = j+1;
                int high = n-1;
                long res = (nums[i] + nums[j]);
                long remSum = target - res;
                while(low<high){
                    if(nums[low] + nums[high] == remSum ){
                        List<Integer> sum = new ArrayList<>();
                        sum.add(nums[i]);
                        sum.add(nums[j]);
                        sum.add(nums[low]);
                        sum.add(nums[high]);
                        q.add(sum);
                        while(low<high && nums[low] == sum.get(2)){
                                low++;
                        }
                        while(low<high && nums[high] == sum.get(3)){
                                high--;
                        }
                    }
                    else if(nums[low] + nums[high] > remSum){
                        high--;
                    }
                    else{
                        low++;
                    }
                }
                while(i<n-1 && nums[i+1] == nums[i]){
                    i++;
                }
                while(j<n-1 && nums[j+1] == nums[j]){
                    j++;
                }
            }
        }
        return q;     

    }
}
