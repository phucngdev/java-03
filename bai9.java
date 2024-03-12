package bt;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap vao gia trị : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("nhap deleteIndex: ");
        int deleteIndex = sc.nextInt();
        if (deleteIndex >= 0 && deleteIndex < n) {
            for (int i = deleteIndex; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.println("Mang sau khi xoa:");
            for (int i = 0; i < n; i++) {
                System.out.println("arr[" + i + "]: " + arr[i]);
            }
        }
    }
}
