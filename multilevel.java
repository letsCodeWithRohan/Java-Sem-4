/** Experiment 15 - Write a program in Java to demonstrate multilevel inheritance */
class multilevel{
	public static void main(String args[]){
		subChild m1 = new subChild();
		m1.parentMethod();
		m1.childMethod();
		m1.subChildMethod();
	}
}
class parent{
	protected void parentMethod(){
		System.out.println("Parent Class Method Called!");
	}
}
class child extends parent{
	protected void childMethod(){
		System.out.println("Child Class Method Called!");
	}
}
class subChild extends child{
	protected void subChildMethod(){
		System.out.println("Sub-Child Class Method Called!");
	}
}