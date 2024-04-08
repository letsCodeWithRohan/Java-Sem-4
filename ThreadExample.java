class ThreadExample extends Thread{
	//Constructor Function
    ThreadExample(String s){
        super(s);
        start();
    }
	
	//run() method override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            try{
                if(Thread.currentThread().getName()=="Thread1"){
                    Thread.sleep(1000);
                }else{
                    Thread.sleep(2000);
                }
            }
            catch(Exception e){}
        }
    }
	
	//Main Method
	public static void main(String arg[]){
        System.out.println("Thread name : "+Thread.currentThread().getName());
        ThreadExample e1=new ThreadExample("Thread1");
        ThreadExample e2=new ThreadExample("Thread2");
    }
}