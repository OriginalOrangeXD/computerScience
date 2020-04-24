public class Circle extends Ellipse
{
	public Circle()
	{
	}
	/* Constuctor for the class circle
	 * @param d double radius of circle 
	 */
	public Circle (double d)
	{
		// Calls the constuctor of the parent class Ellipse and goves it the radius
		super(d);
		// calculates the area of the circle pi*r^2 and saves it into the instace variable area
		this.area = ((this.r1)*(this.r1))*Math.PI;
		// finds the perimemeter with pi*r and saves it into the instance variable perimeter
		this.perimeter=2*this.r1*Math.PI;
	}
	/* prints info of circle
	 */
	public void printInfo()
	{
		// calls the superclass printInfo
		super.printInfo();
	}	
}
