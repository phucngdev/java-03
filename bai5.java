package bt;

import java.util.Scanner;

public class bai5 {
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
        int total = 0;
        for(int[] i: arr) {
            for(int j: i) {
                if(j % 2 == 0) {
                    System.out.print(j + "\t");
                    total += j;
                }
            }
            System.out.print("\n");
        }
        System.out.printf("total: %d", total);
    }
}
