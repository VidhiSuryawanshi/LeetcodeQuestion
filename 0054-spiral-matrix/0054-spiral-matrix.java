class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0 , bottom = matrix.length-1 ;
        int left = 0 , right = matrix[0].length-1 ;
        ArrayList <Integer> ans = new ArrayList<>();
        while(top<=bottom && left<=right){
            //left--->right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //top-->bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            //right --> left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //bottom-->top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}