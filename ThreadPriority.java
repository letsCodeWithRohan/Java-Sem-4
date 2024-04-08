class ThreadPriority implements Runnable{
	public void run(){
		int i= 0;
		while(i < 3)
			System.out.println ("Hello:"+ i++);
	}
	public static void main(String args[]){
		ThreadPriority d = new ThreadPriority();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		System.out.println("Current priority of thread t1 is:" + t1.getPriority());
		t1.setPriority(3);
		t1.start();
		t2.start();
		System.out.println("New priority of thread t1 is:" + t1.getPriority());
	}
}