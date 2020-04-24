public class Rhombus extends Quadrilateral
{
	// Create protected variables for the diagnals of the Rhombus
	protected double p, q;
	public Rhombus()
	{
	}
	/* Constuctor for rhombus takes in 2 variables
	 * @param p double horozontal diagnal
	 * @param q double vertical diagnal
	 */
	public Rhombus(double p, double q)
	{
		this.p = p;
		this.q = q;
		//calculates the area of the rhombus and saves it in the instace variable area
		this.area = (p*q)/2;
		// calculates the perimeter of the rhombus and saves it in the instance variable perimeter
		this.perimeter = Math.sqrt((p*p)+(q*q))*2;
	}
	/* prinInfo will print out the information and return nothing
	 */
	public void printInfo()
	{
		System.out.printf("The length of the diagnals are %f and %f%n", this.p, this.q);
		// calls the super classes printInfo()
		super.printInfo();
	}
}

