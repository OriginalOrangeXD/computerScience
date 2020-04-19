public class Circle extends Ellipse
{
	public Circle()
	{
	}
	public Circle (double d)
	{
		super(d);
		this.area = (this.r1)*(this.r1)*Math.PI;
		this.perimeter=this.r1*Math.PI;
	}
	public void printInfo()
	{
		super.printInfo();
	}	
}
