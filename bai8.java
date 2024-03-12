package bt;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap vao gia trị : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("nhap addValue: ");
        int addValue = sc.nextInt();
        System.out.print("nhap addIndex: ");
        int addIndex = sc.nextInt();
        if (addIndex < 0 || addIndex > n) {
            System.out.println("Chỉ số không hợp lệ!");
        } else {
            arr[addIndex] = addValue;
            System.out.println("Mang sau khi sua :");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
