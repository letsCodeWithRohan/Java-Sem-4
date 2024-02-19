class p5
{
	public static void main(String args[])
	{
		student s1,s2,s3;
		s1 = new student();
		s2 = new student();
		s3 = new student();
		s1.display("224590307004","Chaudhari Rohan");
		s2.display("224590307003","Harshal Chaudhari");
		s3.display("224590307024","Nitesh Nadar");
	}
}
class student
{
	String name;
	String no;
	
	void display(String a,String s){
		name = s;
		no = a;
		System.out.println("Student Name : "+name+"\nStudent No : "+no);
	}
}