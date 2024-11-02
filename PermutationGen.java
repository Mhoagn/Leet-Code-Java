import java.util.Scanner;


public class PermutationGen {
    int[] sol;
    boolean[][] checked;

    public PermutationGen(int n) {
        sol = new int[n];
        checked = new boolean[n][10];
    }

    public void printSol() {
        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i] + " ");
        }
        System.out.println();
    }

    public boolean ischecked(int i, int val) {
        return checked[i][val];
    }

    public void TRY(int k, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!ischecked(i, nums[i])) {
                sol[k] = nums[i];
                checked[i][nums[i]] = true;
                if (k == nums.length - 1) {
                    printSol();
                } else {
                    TRY(k + 1, nums);
                }
                checked[i][nums[i]] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] nums = new int[length];
        for(int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }
        PermutationGen permGen = new PermutationGen(nums.length);
        permGen.TRY(0, nums);
    }
}
