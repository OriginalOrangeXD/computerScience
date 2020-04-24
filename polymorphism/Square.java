public class Square extends Quadrilateral
{
	public Square()
	{
	}
	/* Constuctor for Square which takes in one of the side lengths
	 * @param side double which will hold one of the side lengths
	 */
	public Square(double side)
	{
		this.width = side;
		this.height = side;
		// Calculates the area of the Square and saves it as the instance varuable area
		this.area = this.width*this.height;
		//calculates the perimeter of the square and saves it as the instance variable perimeter 
		this.perimeter = this.width*2 + this.height*2;
	}
	/*Prints the inforrmation about the Square
	 */
	public void printInfo()
	{
		// calls printInfo() in the superclass
		super.printInfo();
	}
}
