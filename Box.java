class Box 
{
	int length;
	int breadth;
	int height;
	Box(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	Box(int side)
	{
		this(side,side,side);
	}
	void volume()
	{
		int v=length*breadth*height;
		System.out.println("The volume is" +v);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Box b1=new Box(11,22,33);
		b1.volume();
		System.out.println("Main ends");
	}
}
