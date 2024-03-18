class AbstractClass {
	public static void main(String args[]){
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		System.out.println("Area of Rectangle is : "+r.area(10.0f,30.0f));
		System.out.println("Area of Triangle is : "+t.area(20.0f,30.0f));
		System.out.println("Area of Triangle is : "+c.area(5.3f));
	}
}
abstract class Shapes {
	public float area(){ return 0; }
}
class Rectangle extends Shapes{
	public float area(float h,float w){
		return h * w;
	}
}
class Triangle extends Shapes{
	public float area(float h,float b){
		return (0.5f*(h * b));
	}
}
class Circle extends Shapes{
	public float area(float r){
		return (3.14f * r * r);
	}
}