/** Expreimrnt 12 */
class ConstOver{
	
	String name;
	
	//Default Constructor
	ConstOver(){
		System.out.println("Default Constructor !");
		name = "Default";
	}
	
	//Parametrized Constructor
	ConstOver(String name){
		this.name = name;
		System.out.println("Parametrized Constructor by "+name+" !");
	}
	
	//Copy Constructor
	ConstOver(ConstOver c){
		name = c.name;
		System.out.println("Copy Constructor By Name of "+name+" !");
	}
	
	//Main Method
	public static void main(String args[]){
		ConstOver obj1,obj2,obj3;
		obj1 = new ConstOver();
		obj2 = new ConstOver("Rohan");
		obj3 = new ConstOver(obj1);
	}
}
