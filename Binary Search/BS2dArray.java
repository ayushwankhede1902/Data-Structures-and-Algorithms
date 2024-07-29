import java.util.Arrays;

public class BS2dArray {
    public static void main(String[] args) {
        int matrix[][] = {
            {1 ,2 ,3 ,4 ,5 },
            {6 ,7 ,8, 9 ,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        int []ans = Search(matrix , 19);
        System.out.println(Arrays.toString(ans));
        
    }

    public static int[] Search(int matrix[][] , int target) {
        int row = 0;
        int column = matrix.length - 1;
    
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return new int[]{row, column};
            } else if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
