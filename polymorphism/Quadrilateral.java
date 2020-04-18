public class  extends Shape
{
    private double width, height;

    public Rectangle()
    {
    }
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
        this.area = width * height;
        this.perimeter = 2 * (width +height);
    }
    public void printInfo()
    {
        System.out.println("The width of this rectangle is = " + this.width);
        System.out.println("The height of this rectangle is = " + this.height);
        super.printInfo();
    }
}
