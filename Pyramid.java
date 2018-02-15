import java.util.*;
/**
 * Question 1
 * @author huangtt
 *
 */
public class Pyramid {
	
	public static void printPyramid(int space, int height, int blank) {
		if(height<1) return;
		height--;
		blank+=space;
		
		printPyramid(space, height, blank);

		System.out.printf("%"+blank+"d",1);
		for(int i=2; i<=height+1; i++) {
			System.out.printf("%"+space+"d", i);
		}
		for(int i=height; i>=1; i--) {
			System.out.printf("%"+space+"d", i);
		}
		System.out.println();
			
	}
	
	public static void main(String[] args) {
		int height;
		int blank=1;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter the height of your pyramid: ");
		
		while(s.hasNext()) {
			
			while(!s.hasNextInt()) {
				String str=s.next();
				System.out.println(str+" is an invalid value.\nPlease reenter the height of your pyramid: ");
			}
			
			height=s.nextInt();
			System.out.println("The height you entered is: "+height+'\n');
		
			int space = (int) (Math.log10(height) + 2); //I learn this trick from http://www.baeldung.com/java-number-of-digits-in-int
			
			printPyramid(space, height, blank);
			System.out.println("\nPlease enter the height of your pyramid: ");
		}
		
		s.close();
		System.exit(0);
		
		
	}
}
