

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int n = nums.length;
        int sum = 0;
        int count = 0;
        
        HashMap<Integer,Integer>map = new HashMap<>();
        
        map.put(sum,1);
        for(int i = 0;i<n;i++){
            sum += nums[i];
            int temp = sum%k;
            if(temp<0){
                temp+=k;
            }
            if(map.containsKey(temp)==true){
                int r = map.get(temp);
                count += r;    
                map.put(temp,r+1);
            }
            else{
                map.put(temp,1);
            }
        }
        return count;

    }
}
