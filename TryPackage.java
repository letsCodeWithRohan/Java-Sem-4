import myPack.myPackage;

class TryPackage{
	public static void main(String args[]){
		myPackage obj = new myPackage();
		System.out.println("Sum is : "+obj.sum(2,4));
		System.out.println("Difference is : "+obj.minus(10,5));
		System.out.println("Multiplication is : "+obj.multiply(2,4));
		System.out.println("Division is : "+obj.divide(10,5));
		System.out.println("Modulo is : "+obj.mod(10,4));
	}
}