

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> l = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        for(int item:nums){
            if(h.contains(item)){
                l.add(item);
            }
            else{
                h.add(item);
            }
        }

        return l;
    }
}
