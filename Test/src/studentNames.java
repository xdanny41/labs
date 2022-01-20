import java.util.Scanner;
public class studentNames extends HighestGrade  {

	
	
	void output() {
		
	Scanner c = new Scanner(System.in);
		
		String[] names = new String[5];
		String X;
		
		for (int i = 0; i<names.length; i++) {
			System.out.println("Enter 5 Student Names: ");
			X = c.next();
			names[i] = X;
		
			
		}
	
		
		
	}
	
	
}
