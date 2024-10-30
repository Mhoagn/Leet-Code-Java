import java.util.Scanner;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while(start <= end){
            int mid = (end - start) / 2 + start;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your length of array:");
        int length = sc.nextInt();
        System.out.println("Input your target: ");
        int target = sc.nextInt();
        int[] nums = new int[length];
        System.out.println("Input your element of array:");
        for(int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }
        SearchInsert si = new SearchInsert();
        System.out.println("The inserted value is: " + si.searchInsert(nums,target));
    }
}
