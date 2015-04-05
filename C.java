class C
{
	String name;
	void init(String name)
	{
		System.out.println("From init method");
		this.name=name;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		C rv1=new C();
		rv1.init("Rama");
		System.out.println("The name is "+rv1.name);
		System.out.println("==============");
		C rv2=new C();
		rv2.init("Seetha");
		System.out.println("The name is "+rv2.name);
		System.out.println("Main ends");
	}
}
