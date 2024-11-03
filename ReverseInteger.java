import java.util.Scanner;

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        int y = Math.abs(x);

        while (y > 0) {
            int res = y % 10;

            if (rev > (Integer.MAX_VALUE - res) / 10) {
                return 0;
            }

            rev = rev * 10 + res;
            y /= 10;
        }

        return (x > 0) ? rev : -rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ReverseInteger ri = new ReverseInteger();
        System.out.println("Output is: " + ri.reverse(num));
    }
}
