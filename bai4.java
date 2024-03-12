package bt;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap vao gia trị : ");
            arr[i] = sc.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("max: %d", max);
    }
}
