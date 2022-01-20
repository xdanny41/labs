import java.util.Scanner;
public class studentGrades extends HighestGrade{

	
	
	void output() {
		
	Scanner input = new Scanner(System.in);
		
		int[] grade = new int[5];
		int A;
		
		
		for (int i = 0;  i < grade.length; i++) {
		System.out.println("Enter student 5 grades: ");
		A = input.nextInt();
		grade[i] = A;
	
		
		}
		

		
	}
 		
		

		
	

	
}
