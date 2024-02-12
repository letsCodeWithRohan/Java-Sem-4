public class Prime{
		public static void main(String args[]){
			int i,n=7,temp = 0;
			for(i=2;i<=n-1;i++){
				if(n%i==0)
					temp = temp + 1;
			}
			if(temp>0)
				System.out.print("Number "+n+" is not prime.");
			else
				System.out.print("Number "+n+" is prime.");
		}
}