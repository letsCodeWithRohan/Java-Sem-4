/** Experiment 13 */
class StringFn{
	public static void main(String args[]){
		String name = "Rohan";
		int age = 19;
		
		//String Length
		int Lnt = name.length();
		System.out.println("Length of String "+name+" is : "+Lnt);
		
		//String Chat at
		char chrAt3 = name.charAt(3);
		System.out.println("Char at index 3 in String "+name+" is : "+chrAt3);
		
		//String Contains
		if(name.contains("Ro"))
			System.out.println("String contains \"Ro\"");
		else
			System.out.println("String doesn't contains \"Ro\"");
		
		//String Split
		String str = "Java is fun programming language";
		String[] splited = str.split(" ");
		for(int i = 0;i<splited.length;i++){
			System.out.println(splited[i]);
		}
		
		//String Format
		String formatted = String.format("My name is %s of age %d ",name,age);
		System.out.println(formatted);
	}
}