class B 
{
	B()
	{
		System.out.println("From B()");
	}
	B(int a)
	{
		this();
		System.out.println("From B(int a)");
	}
	B(int a,double d)
	{
		this(10);
		System.out.println("From B(int a,double d)");
	}
	B(double d,int a)
	{
		this(10,10.5);
		System.out.println("From B(double d,int a)");
	}
	public static void main(String[] args) 
	{
		B rv=new B(90.5,90);
	}
}
