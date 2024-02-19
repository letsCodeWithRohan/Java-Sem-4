class Rectangle{
	public int height;
	public int width;
	
	//Parameterized Constructor
	public Rectangle(int h,int w){
		System.out.println("\nParameterized Constructor Called!!!");
		height = h;
		width = w;
		System.out.println("Height is "+height);
		System.out.println("Width is "+width);
	}
	
	//Default Constructor
	public Rectangle(){
		System.out.println("\nDefault Constructor Called !!!");
		height = 10;
		width = 40;
		System.out.println("Height is "+height);
		System.out.println("Width is "+width);
	}
	
	void getArea(){
		int area = width * height;
		System.out.println("Area of rectangle : "+area);
	}
	
	public static void main(String args[]){
		Rectangle r1,r2;
		r1 = new Rectangle();
		r2 = new Rectangle(50,68);
		r1.getArea();
		r2.getArea();
	}
}