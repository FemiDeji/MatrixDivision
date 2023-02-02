import java.util.Scanner;
public class MatrixDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1, col1, row2, col2;

        System.out.print("enter the number of rows in first matrix");
        row1 = sc.nextInt();

        System.out.print("enter the number of cols in first matrix");
        col1 = sc.nextInt();

        System.out.print("enter the number of rows in second matrix");
        row2 = sc.nextInt();

        System.out.print("enter the number of cols in second matrix");
        col2 = sc.nextInt();

        int a[][] = new int[row1][col1];
        int b[][] = new int[row2][col2];
        int c[][] = new int[row1][col2];

        System.out.println("Enter the values for matrix A: \n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the values for matrix B: \n");
        for (int i = 0; i < row2; i++)
            for (int j = 0; j < col2; j++)
                b[i][j] = sc.nextInt();

        System.out.println("Matrix Division is: \n");
        for (int i = 0; i < row1; i++) {

            for (int j = 0; j < col1; j++) {

                c[i][j] = 0;
                for (int k = 0; k < col2; k++) {

                    c[i][j] = c[i][j] + a[i][k] / b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}




