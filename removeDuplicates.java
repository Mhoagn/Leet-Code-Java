import java.util.Scanner;

public class removeDuplicates {

    public int returnNumberElement(int[] nums) {
        int j = 0;
        int n = nums.length;

        for(int i = 1; i < n; i++) {
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your number of elements is: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input your elements: ");
        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("After removed: ");
        removeDuplicates rd = new removeDuplicates();
        int res = rd.returnNumberElement(arr);
        for(int i = 0; i < res; i++) {
            if(i != res - 1) System.out.print(arr[i] + ", ");
            else System.out.print(arr[i]);
        }
    }
}
