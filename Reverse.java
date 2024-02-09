public class Reverse{
	public static void main(String args[]){
		int a = 123,r;
		System.out.println("Original Number is : "+a);
		System.out.print("Reverse Number is : ");
		while(a!=0){
			r = a % 10;
			System.out.print(r);
			a/=10;
		}
	}
}