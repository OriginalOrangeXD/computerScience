public class RightAngledTriangle extends Triangle
{
	double hypotenuse;
	RightAngledTriangle(double h, double b)
	{
		this.s1 = h;
		this.s2 = b;
		this.s3= Math.sqrt((this.s1*this.s1)+(this.s2*this.s2));
		this.area = (this.s2 * this.s1)/2;
		this.perimeter = this.s1 + this.s2 + this.s3;
	}
	public void printInfo()
	{
		super.printInfo();
	}
}
