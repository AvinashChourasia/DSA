
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int item:nums){
            if(!s.contains(item)){
                s.add(item);
            }
            else{
                return item;
            }
        }

        return -1;
    }
}
