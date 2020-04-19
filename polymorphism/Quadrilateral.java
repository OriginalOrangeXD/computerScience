public class Quadrilateral extends Shape
{
    protected double width, height;

    public Quadrilateral()
    {
    }
    public Quadrilateral(double width, double height)
    {
        this.width = width;
        this.height = height;
        this.area = width * height;
        this.perimeter = 2 * (width +height);
    }
    public void printInfo()
    {
	if(this.width > 0){
        System.out.println("The width of this quadrilateral is = " + this.width);
        System.out.println("The height of this quadrilateral is = " + this.height);
	}
        super.printInfo();
    }
}
