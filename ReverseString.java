import java.util.Scanner;
public class ReverseString {

    public void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;
        char temp;

        while(left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            right--;
            left++;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi cần đảo ngược: ");
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();

        ReverseString reverser = new ReverseString();
        reverser.reverseString(charArray);

        String reversedString = new String(charArray);
        System.out.println("Chuỗi sau khi đảo ngược: " + reversedString);

        scanner.close();
    }

}
