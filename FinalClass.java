final class Fix{
	int a = 10;
}
class FinalClass extends Fix{
	void display(){
		System.out.print(a);
	}
	public static void main(String args[]){
		FinalClass f1 = new FinalClass();
		f1.display();
	}
}