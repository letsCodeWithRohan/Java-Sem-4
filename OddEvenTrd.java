//main method class
public class OddEvenTrd{
	//main method
    public static void main(String[] args){
        NewThreadOE t1 = new NewThreadOE("Odd");
        NewThreadOE t2 = new NewThreadOE("Even");
        t1.start();
        t2.start();
    }
}

//extends Thread class
class NewThreadOE extends Thread{
	
	//constructor method
    NewThreadOE(String threadname){
        super(threadname);
    }
	
	//run method overrided
    public void run(){
		for(int i=1;i<=200;i++){
			if(i%2!=0){
				if(getName().equals("Odd")==true){
					System.out.println("\nOdd: " + i);
					try{ Thread.sleep(500); }
				
					catch(InterruptedException e){
						System.out.println("Exception Occurred.");
					}
				}
			}
			else{
				if(getName().equals("Even")==true){
					System.out.println("\nEven: " + i);
					try{ Thread.sleep(500); }
				
					catch(InterruptedException e){
						System.out.println("Exception Occurred.");
					}
				}
			}
		}
    }
}