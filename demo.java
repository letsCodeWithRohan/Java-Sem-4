public class demo{  
    public static void main(String args[]){
        int a = 15,b = 25,c =  25,answer;
        //answer = (a < b) ? a : b ;
		answer = (a < b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.print("Max numbers from "+a+", "+b+", "+c+" "+"is : "+answer);
    }
}