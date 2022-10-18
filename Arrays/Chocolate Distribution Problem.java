

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long sdiff = a.get(m-1) - a.get(0);
        
        for(int i=m;i<n;i++){
            long diff = a.get(i) - a.get(i-m+1);
            sdiff = Math.min(sdiff,diff);
        }
        
        return sdiff;
    }
}
