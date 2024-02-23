class ConstOver{
	ConstOver(){
		System.out.println("Default Constructor !");
	}
	
	ConstOver(String name){
		System.out.println("Parametrized Constructor by "+name+" !");
	}
	public static void main(String args[]){
		ConstOver obj1,obj2;
		obj1 = new ConstOver();
		obj2 = new ConstOver("Rohan");
	}
}