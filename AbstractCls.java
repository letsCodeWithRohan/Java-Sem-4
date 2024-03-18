class AbstractCls{
	public static void main(String args[]){
		Dog d1 = new Dog("Dog");
		System.out.print(d1.getName()+" Says : ");
		d1.makeSound();
	}
}
abstract class Animal{
	private String name;
	public Animal(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public abstract void makeSound();
}
class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
	public void makeSound(){
		System.out.println("woof");
	}
}