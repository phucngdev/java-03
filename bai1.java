package bt;
import java.util.Scanner;

class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("nhap vào mang: ");
            arr1[i] = sc.nextInt();
            System.out.println(arr1[i]);
        }
        for(int i: arr1) {
            System.out.print(i + "\t");
        }
    }
}