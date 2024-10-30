import java.util.HashSet;
import java.util.Scanner;
// 217. Contains Duplicate

public class containDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            if (numbers.contains(num)) {
                return true;
            }
            numbers.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] nums = new int[length];

        for(int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }
        containDuplicate cD = new containDuplicate();
        System.out.println("The array has duplicates: " + cD.containsDuplicate(nums));
    }
}
