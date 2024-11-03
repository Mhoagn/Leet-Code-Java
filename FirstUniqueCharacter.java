import java.util.Hashtable;
import java.util.Scanner;


public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        Hashtable<Character, Integer> map = new Hashtable<>();
        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }
            else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }

        for(int i = 0 ;i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        FirstUniqueCharacter fuc = new FirstUniqueCharacter();
        System.out.println("First index of unique character is : " + fuc.firstUniqChar(s));
    }
}
