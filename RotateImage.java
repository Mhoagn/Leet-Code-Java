import java.util.Scanner;

public class RotateImage {

    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int temp;

        for(int j = 0; j < column; j++) {
            int start = 0, end = row - 1;
            while(start < end) {
                temp = matrix[start][j];
                matrix[start][j] = matrix[end][j];
                matrix[end][j] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < column; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input row of matrix: ");
        int row = sc.nextInt();
        System.out.println("Input column of matrix: ");
        int column = sc.nextInt();
        System.out.println("Input elements of matrix: ");
        int[][] matrix = new int[row][column];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        RotateImage ri = new RotateImage();
        ri.rotate(matrix);

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
