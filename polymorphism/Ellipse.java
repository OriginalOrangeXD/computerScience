public class Ellipse extends Shape 
{
	protected double r1, r2;
	public Ellipse()
	{
	}
	public Ellipse(double r1)
	{
		this.r1 = r1;
		this.r2 = r1;
	}
	public Ellipse(double r1, double r2)
	{
		this.r1 = r1;
		this.r2 = r2;
		this.area = Math.PI * r1 * r2;
		//Ramanujan approx.
		this.perimeter = Math.PI*(3*(r1+r2)-Math.sqrt((3*r1+r2)*(r1+3*r2)));
	}

	public void printInfo()
	{
		System.out.printf("The verticle radius is %f and the horozontal radius is %f%n", this.r2, this.r1);
		super.printInfo();
	}
}
