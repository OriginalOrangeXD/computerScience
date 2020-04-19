public class Triangle extends Shape
{
	protected double s1, s2,s3;
	Triangle()
	{
	}
	Triangle(double s1,double s2,double s3)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.area = (this.s1+this.s2+this.s3)/2;
		this.perimeter = this.s1 + this.s2 +this.s3;
	}
	public void printInfo()
	{
		System.out.printf("The sides of the triangle are %f, %f, and %f%n", this.s1, this.s2,this.s3);
		super.printInfo();
	}
}
