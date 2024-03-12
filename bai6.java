package bt;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so cot: ");
        int col = sc.nextInt();
        System.out.print("nhap vao so hang: ");
        int row = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("nhap vao gia tri Arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("nhap findNumber: ");
        int find = sc.nextInt();
        int total = 0;
        int rowIndex = 0;
        for(int[] i: arr) {
            int colIndex = 0;
            for(int j: i) {
                if(j == find) {
                    System.out.printf("arr[%d][%d]", rowIndex, colIndex);
                    total += j;
                }
                colIndex++;
            }
            rowIndex++;
            System.out.print("\n");
        }
        System.out.printf("total: %d", total);
    }
}
