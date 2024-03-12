package bt;

import java.util.Scanner;

public class bai3 {
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
        for(int[] i: arr) {
            for(int j: i) {
                System.out.print(j + "\t");
            }
            System.out.print("\n");
        }
    }
}
