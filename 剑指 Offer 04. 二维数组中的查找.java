class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;      //将图逆时针旋转45度，就是一个顺序二叉树了
        while (row < rows && column >= 0) {             //从右上角开始查找（排除左边的一行，或者是下边的一列）[也可以从左下角开始]
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}
