package Akshita;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {4, 15, 16, 18, 22, 45, 89};
        int target = 2;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    //return the index of greatest no <= target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }
}
