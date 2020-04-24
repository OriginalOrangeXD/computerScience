public class Polymorphism
{
   public static void main(String args[])
    {
	// Create a reference variable of type Shape which holds a reference to
	// An ellipse object with a vertical radius of 4 and a horozontal radius of 2
	Shape eli = new Ellipse(2,4);
	System.out.println("Ellipse");
	//Print information about the ellipse(call printInfo() In ellipse)
	eli.printInfo();
	// Create a reference variable of type Shape which holds a reference to
	// A circle object with a radius of 2
	Shape sh = new Circle(2);
	System.out.println("Circle");
	// Print information about the circle(call printInfo() in circle)
    	sh.printInfo();
	// Create a reference variable of type Shape which holds a reference to
	// A Triangle object with the side lengths 1,1,1
	Shape tri =  new Triangle(1,1,1);
	System.out.println("Triangle");
	//Print the information of the triangle (call printInfo() in Triangle)
	tri.printInfo();	
	// Create a reference variable of type Shape which holds a reference to
	// A rightAngleTriangle object with a height of 5 and a base of 5
	Shape rtri = new RightAngledTriangle(5,5);
	System.out.println("Right angle triangle");
	//Print the information of the right angle triangle( call printInfo() in RightAngleTriangle)
	rtri.printInfo();
	// Create a reference variable of type Shape which holds a reference to
	// A Quadrilateral object with the a width of 5 and a height of 5
	Shape quad = new Quadrilateral(5,5);
	System.out.println("Quadrilateral");
	//print the information of the Quadrilateral(call printInfo() in quadrilateral)
	quad.printInfo();
	// Create a reference variable of type Shape which holds a reference to
	// A Trapezoid object with bases of 26 and 13 and sides of 13 and 13
	Shape trap = new Trapezoid(26,16,13,13);
	System.out.println("Trapezoid");
	//prints infomation about trapezoid(calls printInfo() in Trapezoid
	trap.printInfo();
	// Create a reference variable of type Shape which holds a reference to
	// A Rhombus object with the the diagnals of 15 and 12
	Shape rhom = new Rhombus(15, 12);
	System.out.println("Rhombus");
	// prints info of rhombus(calls printInfo() in rhombus)
	rhom.printInfo();
	// Create a reference variable of type Shape which holds a reference to
	// A square object with a side length of 5
	Shape sqr = new Square(5);
	System.out.println("Square");
	//prints in the info of the square(calls printInfo() in square)
	sqr.printInfo();
    }
}
