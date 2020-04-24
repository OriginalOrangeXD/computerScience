public class Trapezoid extends Quadrilateral
{
	// creates protected double variables
	protected double base1,base2,side1,side2,height;
	public Trapezoid()
	{
	}
	/* Constuctor class of trapizoid which takes in 4 variables and finds the height area and perimeter
	 * @param b1 doube large base
	 * @param b2 double of the smaller base
	 * @param s1 doube of left side
	 * @param s2 double of right side
	 */
	public Trapezoid(double b1, double b2, double s1, double s2)
	{
		//big base
		this.base1 = b1;
		//small base
		this.base2 = b2;
		// left side
		this.side1 = s1;
		//right side
		this.side2 = s2;
		//height eqn found on www-formula.com
		this.height = Math.sqrt(Math.pow(s1,2)-Math.pow((Math.pow(b1-b2, 2)+Math.pow(s1,2)-Math.pow(s2,2))/(2*(b1-b2)),2));
		// calculates the area of the trapezoid and saves it in the instance variable area
		this.area = ((this.base1 +this.base2)/2)*this.height;
		// Calculates the perimeter of the trapezoid and saves it in the instance variable  perimeter
		this.perimeter = this.base1+this.base2+this.side1+this.side2;
	}
	/* Prints the inforamtion of the trapezoid
	 */
	public void printInfo()
	{
		System.out.printf("The sides of the trapizoid is %f and %f, the bases are %f and %f, and the height is %f%n" , this.side1, this.side2, this.base1, this.base2, this.height);
		// calls the super classes printInfo()
		super.printInfo();
	}
}
