

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int k = 0;
        for(int item:nums){

            if(!s.contains(item)){
                s.add(item);
                nums[k++] = item;
            }
        }
        return k;
    }
}
