public class Quadrilateral extends Shape
{
	// Create the protected variables width and height
    protected double width, height;

    public Quadrilateral()
    {
    }
    /* Quadrilateral contructor find area and perimeter if corners are 90 degrees 
     * @param width double width of quadrilateral
     * @param height double height of quadrilateral
     */
    public Quadrilateral(double width, double height)
    {
        this.width = width;
        this.height = height;
	// Calculates the area with width * height and saves it int the instance variable area 
        this.area = width * height;
	//calculates the perimeter (with base + height )*2 and saves it in teh instance variable perimeter
        this.perimeter = 2 * (width +height);
    }
    /* Prints information about object (height base area and perimeter
     */
    public void printInfo()
    {
	// Check if the width variable is initilaized
	if(this.width > 0){
        System.out.println("The width of this quadrilateral is = " + this.width);
        System.out.println("The height of this quadrilateral is = " + this.height);
	}
	// Call parent print info to print area and perimeter
        super.printInfo();
    }
}
