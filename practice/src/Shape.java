import java.util.*;
public class Shape {

	public static void main(String[] args) {
		
		double radius;
		
		Color Color = new Color("Red");
		Circle Shape = new Circle("Circle");
		Size Size = new Size();
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of a circle to find diameter and circumfrence");
		radius = input.nextDouble();
		
		Size.setSize(radius);
		
		diameter diameter = new diameter();
		
		System.out.println(Color.getColor());
		System.out.println(Shape.getShape());
		System.out.println(Size.getSize());
		System.out.println(diameter.getDiameter());
	
		
		
		

	}

}
