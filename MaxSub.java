import java.util.Scanner;

public class MaxSub {

    public int maxSubArray(int[] nums) {
        int maxi= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxi=Math.max(maxi,sum);
            if(sum<0) sum=0;
        }
        return maxi;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your length of array: ");
        int length = sc.nextInt();
        int[] nums = new int[length];
        System.out.println("Input your element of array: ");
        for(int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }
        MaxSub ms = new MaxSub();
        System.out.println("Maximum subarray is: " + ms.maxSubArray(nums));
    }
}
