class TruException{
	public static void main(String agrs[]){
		try{
			int a = 10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println("Devided By Zero Error !!!!!");
		}
	}
}