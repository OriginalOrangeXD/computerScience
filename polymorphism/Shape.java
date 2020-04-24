
public abstract class Shape
{
	// creates protected double variables that will hold the area and perimeter of the shape
    protected double area;
    protected double perimeter;
	/* Prints out the area and perimete of the shape
	 */
    protected void printInfo()
    {
        System.out.println("area = " + this.area + " perimeter = " + this.perimeter);
    }
}

