import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0; i < a.length(); i++) {
	            char str = a.charAt(i);
	            
	            if(str >= 'a' && str <= 'z') str -= 32;
	            	else if(str >= 'A' && str <= 'Z') str += 32;
	            System.out.print(str);
	        }
    }
}