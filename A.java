class A 
{
	A()
	{
		System.out.println("From A()");
	}
	A(int a)
	{
		this();
		System.out.println("From A(int a)");
	}
	public static void main(String[] args) 
	{
		A rv=new A(90);
	}
}
