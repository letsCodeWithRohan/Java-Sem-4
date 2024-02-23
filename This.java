class This{  
	public static void main(String args[]){  
		Student s1=new Student(024,"Nitesh");  
		Student s2=new Student(004,"Rohan");  
		s1.display();  
		s2.display();  
	}	
}  
class Student{  
	int rollno;  
	String name;   
	
	Student(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
	}  

	void display(){
		System.out.println(rollno+" "+name+" ");
	}  
}  