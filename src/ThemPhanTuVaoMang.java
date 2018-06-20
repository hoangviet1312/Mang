import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Độ dài của mảng :");
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] array2 = new int[n + 1];
        System.out.println("Nhập giá trị vào cho mảng 1: ");
        for (int i = 0; i < array.length; i++) {
            int num = sc.nextInt();
            array[i] = num;
        }
        System.out.print("Nhập vị trí cần chèn vào: ");
        int n1 = sc.nextInt();
        System.out.print("Nhập giá trị cần chèn vào: ");
        int number = sc.nextInt();
        for (int i = 0; i < n1 - 1; i++) {
            array2[i] = array[i];
        }
        array2[n1 - 1] = number;
        for (int j = n1; j < array2.length; j++) {
            array2[j] = array[j - 1];
        }
        System.out.println("Mảng mới gồm các giá trị sau: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
    }
}
