public class RightAngledTriangle extends Triangle
{
	// Constuctor which takes in 2 parameters and returns nothing
	// @param h double which is the height of the triangle
	// @param b double which is the base of the triangle 
	RightAngledTriangle(double h, double b)
	{
		this.s1 = h;
		this.s2 = b;
		// Calculates the 3rd side of the triangle using pythagorean theorem and saves it in the instace variable s3
		this.s3= Math.sqrt((this.s1*this.s1)+(this.s2*this.s2));
		// Calculates the area of the triangle and saves it in the instance variable area
		this.area = (this.s2 * this.s1)/2;
		// Calculates the perimeter of the triangleand saves it in the instance variable perimeter
		this.perimeter = this.s1 + this.s2 + this.s3;
	}
	/* Prints out the information abou the triangle
	 */
	public void printInfo()
	{
		//calls the super classes printInfo()
		super.printInfo();
	}
}
