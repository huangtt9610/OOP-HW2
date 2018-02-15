import java.util.*;
/**
 * Question 3
 * @author huangtt
 *
 */
public class Palindrome { 
	public static boolean checkPalindrome (String s) {
		if(s.length()<=1) 
			return true;	
		
		char[] c=s.toCharArray(); //find this method from https://www.javatpoint.com/java-string-tochararray
		boolean b=true;
		int i=0, j=s.length()-1;
		
		while(i<s.length()/2) {
			if ((c[i]!=c[j])) {
				b=false;
			}
			i++;
			j--;
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your value: ");
		
		while(s.hasNext()) {
			String str=s.next();
			if (checkPalindrome(str)) {
				System.out.println(str+" is a palindrome");
			}
			else
				System.out.println(str+" is not a palindrome");
			System.out.println("\nEnter your value: ");
		}		
		s.close();
		System.exit(0);
	}
}
