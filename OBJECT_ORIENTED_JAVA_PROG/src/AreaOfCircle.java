
public class AreaOfCircle {
	
	private final double radius ;
	
	public AreaOfCircle(double radius) {
		this.radius  = radius;
		
	}

	public static void main(String[]args) {
		
		final AreaOfCircle area = new AreaOfCircle(5);
		System.out.println("Area of Circle with radius "+area.radius + " is " + area.areaOfCircle(area.radius));
		
		
	}
	
	public  double areaOfCircle(double radius) {
		return Math.PI * radius * radius;
	}
}
