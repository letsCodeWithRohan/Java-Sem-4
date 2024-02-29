/** Experiment 16 - Write a program in Java to demonstrate hierarchical inheritance. */
class hierarchical{
	public static void main(String args[]){
		cat c1 = new cat();
		System.out.println("\nCat :");
		c1.base();
		c1.meow();
		
		dog d1 = new dog();
		System.out.println("\nDog :");
		d1.base();
		d1.bark();
	}
}
class Animal{
	protected void base(){
		System.out.println("This is an Animal");
	}
}
class dog extends Animal{
	protected void bark(){
		System.out.println("Dog is barking");
	}
}
class cat extends Animal{
	protected void meow(){
		System.out.println("Cat is meowing");
	}
}
