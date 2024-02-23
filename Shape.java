class Shape{
	static float area(float r){
		return 3.14f * r * r;
	}
	static int area(int h,int w){
		return h * w;
	}
	static int area(int l){
		return l * l;
	}
	public static void main(String args[]){
		
		float areaCir = area(2.3f);
		System.out.println("Area of Circle is : "+areaCir);
		
		int areaRec = area(20,10);
		System.out.println("Area of Rectangle is : "+areaRec);
		
		int areaSqr = area(20);
		System.out.println("Area of Square is : "+areaSqr);
		
	}
}