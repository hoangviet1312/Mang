import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = scanner.nextInt();
        int[] mang1 = new int[n];
        int[] mang2 = new int[n - 1];
        System.out.println("Nhap gia tri cua mang:");
        for (int i = 0; i < mang1.length; i++) {
            int number = scanner.nextInt();
            mang1[i] = number;
        }
        System.out.println("Nhap vi tri can xoa");
        int index = scanner.nextInt();
        for (int i = 0; i < index -1 ; i++) {
            mang2[i] = mang1[i];
        }
        for (int j = index - 1 ; j < mang2.length ; j++) {
            mang2[j] = mang1[j + 1];
        }
        for (int x = 0; x < mang2.length; x++) {
            System.out.println(mang2[x]);
        }
    }
}