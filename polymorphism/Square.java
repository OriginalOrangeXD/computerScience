public class Square extends Quadrilateral
{
	public Square()
	{
	}
	public Square(double side)
	{
		this.width = side;
		this.height = side;
		this.area = this.width*this.height;
		this.perimeter = this.width*2 + this.height*2;
	}
	public void printInfo()
	{
		super.printInfo();
	}
}
