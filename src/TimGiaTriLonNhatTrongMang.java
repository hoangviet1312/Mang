public class TimGiaTriLonNhatTrongMang {
    static void max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int a[] = {12, 33, 45, 15};
        max(a);
    }
}
