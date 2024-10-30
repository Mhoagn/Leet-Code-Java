import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionTwoArray {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();


        for (int num : nums1) {
            hs1.add(num);
        }

        for (int num : nums2) {
            if (hs1.contains(num)) {
                result.add(num);
            }
        }


        int[] resArray = new int[result.size()];
        int index = 0;
        for (int num : result) {
            resArray[index++] = num;
        }

        return resArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your length of first array: ");
        int length1 = sc.nextInt();
        System.out.println("Input your length of second array: ");
        int length2 = sc.nextInt();

        int[] nums1 = new int[length1];
        int[] nums2 = new int[length2];
        System.out.println("Input your elements of first array: ");
        for(int i = 0 ; i < length1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Input your elements of second array: ");
        for(int i = 0 ; i < length2; i++) {
            nums2[i] = sc.nextInt();
        }

        IntersectionTwoArray ita = new IntersectionTwoArray();
        int[] res = ita.intersection(nums1, nums2);

        for(int num : res) {
            System.out.print(num + " ");
        }
    }

}
