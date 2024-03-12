package bt;

import java.util.Scanner;

public class bai7 {
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
        int[] newArr = new int[arr.length + 1];
        if (addIndex < 0 || addIndex > n) {
            System.out.println("Chỉ số không hợp lệ!");
        } else {
            for (int i = 0, j = 0; i < n + 1; i++, j++) {
                if (i == addIndex) {
                    newArr[i] = addValue;
                    j--;
                } else {
                    newArr[i] = arr[j];
                }
            }
            arr = newArr;
            System.out.println("Mảng sau khi thêm chèn:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
