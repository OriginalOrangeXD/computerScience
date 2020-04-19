public class Polymorphism
{
   public static void main(String args[])
    {
	Shape trap = new Trapezoid(2,3,4,5,3);
	trap.printInfo();
	Shape rhom = new Rhombus(15, 12);
	rhom.printInfo();
	Shape sqr = new Square(5);
	sqr.printInfo();
	Shape quad = new Quadrilateral(5,5);
	quad.printInfo();
	Shape eli = new Ellipse(2,4);
	eli.printInfo();
        Shape sh = new Circle(2);
        sh.printInfo();
	Shape rtri = new RightAngledTriangle(5,5);
	rtri.printInfo();
	Shape tri =  new Triangle(1,1,1);
	tri.printInfo();
    }
}
