//extends Thread class
class NewThreadOE extends Thread{
	
	//constructor method
    NewThreadOE(String threadname){
        super(threadname);
    }
	
	//run method overrided
    public void run(){
		
		//If number is odd
        if(getName().equals("Odd")==true){
            for(int i=1;i<=200;i=i+2){
                System.out.print("\nOdd: " + i);
				
                try{ Thread.sleep(500); }
				
                catch(InterruptedException e){
                    System.out.println("Exception Occurred.");
                }
            }
        }
		
		//if number is even
        else{
            for(int i=2;i<=200;i=i+2){
                if(i%10==0)
					System.out.println();
					System.out.print("\nEven: " + i);
                try{ Thread.sleep(500); }
                catch(InterruptedException e){
                    System.out.println("Exception Occurred.");
                }
            }
        }
    }
}

//main method class
public class OddEvenThread{
	//main method
    public static void main(String[] args){
        NewThreadOE t1 = new NewThreadOE("Odd");
        NewThreadOE t2 = new NewThreadOE("Even");
        t1.start();
        t2.start();
    }
}