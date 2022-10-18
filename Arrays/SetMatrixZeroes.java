

class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r = matrix.length;
        int c = matrix[0].length;

        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 0){
                    x.add(i);
                    y.add(j);
                }
            }
        }

        int k=0;
        int a =x.size();
        while(k < a){
            for(int i=0;i<c;i++){
                matrix[x.get(k)][i] = 0;
            }
            for(int i=0;i<r;i++){
                matrix[i][y.get(k)] = 0;
            }
            k++;
        }

    }
}
