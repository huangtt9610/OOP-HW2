import java.util.*;
/**
 * Question 2
 * @author huangtt
 *
 */
public class Calender {
	public static int getSpace(String day) {
		if(day.length()<2)
			return -1;
		String tempDay=day.toUpperCase().substring(0,2);
		
		switch(tempDay) {
			case "SU":
				return 2;
		
			case "MO":
				return 5;
				
			case "TU":
				return 8;
			
			case "WE":
				return 11;
			
			case "TH":
				return 14;
			
			case "FR":
				return 17;
			
			case "SA":
				return 20;
			
			default:
				return -1;	
		
		}
	}
	
	public static boolean isLeapYear (int year) {
		if((year%400==0)) 
			return true;		
		if(year%4==0 && year%100!=0)
			return true;		
		return false;
				
	}
	
	public static int dayOfMonth(int i, boolean isleap) {
		switch (i){
			case 1:
			case 3:
			case 5:
			case 7:
			case 10:
			case 12:
				return 31;
			case 2:
				if(isleap)
					return 29;
				else 
					return 28;
			default:
				return 30;
			
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Please enter a year: ");
		
		while(!s.hasNextInt()) {
			System.out.print("Please enter a year: ");
			s.next();
		}
		
		int year=s.nextInt();
		boolean isLeap=isLeapYear (year);
		
		System.out.print("\nPlease enter the day the first of January fell on: ");
		int i, space=getSpace(s.next());	;	
		while(space==-1) {
			System.out.print("\nInvalid value. Please reenter the day the first of January fell on: ");
			space=getSpace(s.next());	
		}
		
		for(i=1; i<=12; i++) {
			System.out.printf("%11s%5d\n",Month.getMonth(i),year);
			System.out.printf("Su Mo Tu We Th Fr Sa\n");
			
			System.out.printf("%"+ space +"d ",1);
			space +=3;
			for(int j=2; j<=dayOfMonth(i,isLeap);j++) {
				
				if(space>20) {
					System.out.print("\n");
					space=2;
				}
				System.out.printf("%2d ",j );
				space +=3;

			}
			System.out.println("\n");
		}
		
		s.close();
		System.exit(0);
	}

}

