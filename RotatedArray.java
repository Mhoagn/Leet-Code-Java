import java.util.Scanner;


public class RotatedArray {

    public void reverseArray(int[] nums, int start, int end) {
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateArr(int[] nums, int k) {
        int n = nums.length;
        int rotatedCount = k % n;
        if (rotatedCount == 0) return;

        reverseArray(nums, 0, n - 1);

        reverseArray(nums, 0, rotatedCount - 1);

        reverseArray(nums, rotatedCount, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        System.out.println("Nhập các phần tử của mảng:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Nhập giá trị k (số lần xoay): ");
        int k = sc.nextInt();

        RotatedArray rotatedArray = new RotatedArray();
        rotatedArray.rotateArr(nums, k);

        System.out.println("Nhập các phần tử của mảng:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}

