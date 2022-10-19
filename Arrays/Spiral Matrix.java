

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        ArrayList<Integer> l = new ArrayList<>();
        int top = 0;
        int left = 0;
        int bottom = r-1;
        int right = c-1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                l.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                l.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    l.add(matrix[i][left]);
                }
                left++;
            }

        }

        return l;
    }
}
