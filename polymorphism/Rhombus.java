public class Rhombus extends Quadrilateral
{
	protected double p, q;
	public Rhombus()
	{
	}
	public Rhombus(double p, double q)
	{
		this.p = p;
		this.q = q;
		this.area = (p*q)/2;
		this.perimeter = Math.sqrt((p*p)+(q*q))*2;
	}
	public void printInfo()
	{
		System.out.printf("The length of the diagnals are %f and %f%n", this.p, this.q);
		super.printInfo();
	}
}

