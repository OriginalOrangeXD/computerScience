public class Trapezoid extends Quadrilateral
{
	protected double base1,base2,side1,side2,height;
	public Trapezoid()
	{
	}
	public Trapezoid(double b1, double b2, double s1, double s2, double h)
	{
		this.base1 = b1;
		this.base2 = b2;
		this.side1 = s1;
		this.side2 = s2;
		this.height = h;
		this.area = ((this.base1 +this.base2)/2)*this.height;
		this.perimeter = this.base1+this.base2+this.side1+this.side2;
	}
	public void printInfo()
	{
		System.out.printf("The sides of the trapizoid is %f and %f and the bases are %f and %f%n", this.side1, this.side2, this.base1, this.base2);
		super.printInfo();
	}
}
