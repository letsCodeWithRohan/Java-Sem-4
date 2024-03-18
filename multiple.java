public class multiple{
	public static void main(String args[]){
		result obj = new result();
		obj.display();
		obj.show();
	}
}
interface I1{
	void display();
}
interface I2{
	void show();
}
class result implements I1,I2{
	public void display(){
		System.out.println("Display method from I1");
	}
	public void show(){
		System.out.println("Show method from I2");
	}
}