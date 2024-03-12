package bt;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap vao gia trị : ");
            arr[i] = sc.nextInt();
        }
        float tb = 0;
        for(int i: arr) {
            tb += i;
        }
        System.out.printf("gia tri trung binh %.2f", tb/n);
    }
}
