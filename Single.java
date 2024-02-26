/** Experiment 14 */

//Child Class
class Student extends Single{
	void display(){
		System.out.println("Name is : "+name);
	}
	public static void main(String args[]){
		Student s1 = new Student();
		s1.display();
	}
}

//Parent Class
public class Single{
	public String name = "Rohan";
}