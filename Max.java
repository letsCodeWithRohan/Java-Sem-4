public class Max{
	public static void main(String args[]){
		int a = 5,b = 7,c = 9,ans;
		ans = (a > b ? (a > c ? a : c) : (b > c ? b:c));
		System.out.print("From "+a+", "+b+", "+c+" "+"Maximum : "+ans);
	}
}