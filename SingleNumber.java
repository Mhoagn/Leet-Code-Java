import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            if (hm.containsKey(num))
                hm.put(num, hm.get(num) + 1);
            else hm.put(num, 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] nums = new int[length];

        for(int i = 0; i < length; i++){
            nums[i] = sc.nextInt();
        }

        SingleNumber sn = new SingleNumber();
        System.out.println("The element appears once time: " + sn.singleNumber(nums));
    }
}
