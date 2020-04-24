public class Ellipse extends Shape
{
	protected double r1, r2;
	public Ellipse()
	{
	}
	/* Creates an ellipse with a uniform radius
     * Can't be directly accessed by the user
	 * @param r1 double variable holding radius
	 */
	protected Ellipse(double r1)
	{
		this.r1 = r1;
		this.r2 = r1;
	}
    /* Creates an Ellipse with an ununiform radius
     * @param r1 double holding horizontal radius
     * @param r2 double holding vertical radius
     */
	public Ellipse(double r1, double r2)
	{
        //set the r1 and e2 specified by the user as instance variables so they can be called with this.
		this.r1 = r1;
		this.r2 = r2;
        //Solve for area of ellipse and save it into the instance variable area
		this.area = Math.PI * r1 * r2;
		//Ramanujan approx for perimeter is use to calculate perimeter then dave it into the instance variable perimeter
		this.perimeter = Math.PI*(3*(r1+r2)-Math.sqrt((3*r1+r2)*(r1+3*r2)));
	}
    /* Prints information of ellipse then calls the that parent class to print area and perimeter
     */
	public void printInfo()
	{
		System.out.printf("The verticle radius is %f and the horozontal radius is %f%n", this.r2, this.r1);
		super.printInfo();
	}
}
