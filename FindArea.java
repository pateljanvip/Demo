class Figure
{
	double dim1;
	double dim2;
	
	Figure(){}//default constructer
	
	Figure(double a,double b)//parameteraized constructer
	{
		this.dim1=a;
		this.dim2=b;
	}
	
	double area()
	{
		System.out.println("Area figure");
		return 0;
	}
}

class Rectangle extends Figure
{
	Rectangle(){}//default constructer
	
	Rectangle(double a,double b)//parameteraized constructer
	{
		super(a,b);//parameteraized Figure(double double) is called
	}
	double area()
	{
		System.out.println("Inside the Rectangle area");
		return this.dim1*this.dim2;
	}
}
class Triangle extends Figure
{
	Triangle(){}//default constructer
	
	Triangle(double a,double b)//parameteraized constructer
	{
		super(a,b);//parameteraized Figure(double double) is called
	}
	double area()
	{
		System.out.println("Inside the Triangle area");
		return (this.dim1*this.dim2)/2;
	}
}

class FindArea
{
	public static void main(String args[])
	{
		Figure f=new Figure(22,11);
		
		Rectangle r=new Rectangle(12,21);
		//System.out.println("hello"+r.area());
		
		Triangle t=new Triangle(8,10);
		
		Figure figref;
		
		figref=r;
		System.out.println("The Area is "+figref.area());
		
		figref=t;
		System.out.println("The Area is "+figref.area());
		
		figref=f;
		System.out.println("The Area is "+figref.area());
		
		
	}
}