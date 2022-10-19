

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int sum = 0; 
        int count = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        
        h.put(sum,1);
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            if(h.containsKey(sum - k)){
                count += h.get(sum - k);  
            }

            if(h.containsKey(sum)){
                h.put(sum, h.get(sum)+1);  
            }
            else{
                h.put(sum,1);
            }
        }
        
        return count;
    }
}
