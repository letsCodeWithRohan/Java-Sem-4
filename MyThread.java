//Thread creation using Thread class 

/*
class MyThread extends Thread {
	public void run(){
		System.out.println("Thread Is Running by class");
	}
	public static void main(String args[]){
		MyThread obj = new MyThread();
		obj.start();
	}
}*/

//Thread creation using Runnable interface
class MyThread implements Runnable {
	public void run(){
		System.out.println("Thread Is Running by Interface");
	}
	public static void main(String args[]){
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
	}
}