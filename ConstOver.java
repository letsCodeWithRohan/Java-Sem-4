class ConstOver{
	String name;
	
	ConstOver(){
		System.out.println("Default Constructor !");
		name = "Default";
	}
	
	ConstOver(String name){
		this.name = name;
		System.out.println("Parametrized Constructor by "+name+" !");
	}
	
	ConstOver(ConstOver c){
		name = c.name;
		System.out.println("Copy Constructor By Name of "+name+" !");
	}
	
	public static void main(String args[]){
		ConstOver obj1,obj2,obj3;
		obj1 = new ConstOver();
		obj2 = new ConstOver("Rohan");
		obj3 = new ConstOver(obj1);
	}
}