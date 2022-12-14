

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int a[] = new int[n+m];
        
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m && j<n){
            if(nums1[i]<= nums2[j] ){
                a[k] = nums1[i];
                i++;
            }
            else{
                a[k] = nums2[j];
                j++;
            }
          k++;   
        }
        
        if(i>=m){
            while(j<n){
                a[k] = nums2[j];
                j++;
                k++;
            }
        }
        if(j>=n){
            while(i<m){
                a[k] = nums1[i];
                i++;
                k++;
            }
        }
        
        
        for(int l = 0;l<n+m;l++){
            nums1[l] = a[l];
        }
        
    }
}
