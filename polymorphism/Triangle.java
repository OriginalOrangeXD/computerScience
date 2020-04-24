public class Triangle extends Shape
{
	protected double s1, s2,s3;
	Triangle()
	{
	}
	/* Triagle constuctor which takes in the 3 sides and calculates the area and perimeter
	 * @param s1 double hold a side
	 * @param s2 double holds a differen side
	 * @param s3 holds the third side
	 */
	Triangle(double s1,double s2,double s3)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		// Calculates the perimeter and saves it in the instance variable perimeter
		this.perimeter = this.s1 + this.s2 +this.s3;
		// Calculates the area and saves it in the instace variable area(Heron's formula
		this.area = Math.sqrt(this.perimeter/2*(this.perimeter/2-s1)*(this.perimeter/2-s2)*(this.perimeter/2-s3));
	}
	/* Prints the infoarmation of the triangle
	 */
	public void printInfo()
	{
		System.out.printf("The sides of the triangle are %f, %f, and %f%n", this.s1, this.s2,this.s3);
		// Calls the superclasses printInfo()
		super.printInfo();
	}
}
