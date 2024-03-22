import java.util.Scanner;

class Pkg{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = scan.nextLine();
		System.out.println("Your Name is : "+name);
	}
}