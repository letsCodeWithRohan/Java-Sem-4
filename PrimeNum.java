public class PrimeNum{
		public static void main(String args[]){
			int i,n,temp;
			System.out.println("Prime numbers from 1 to 100 : ");
			for(n=1;n<=100;n++){
			temp = 0;
			for(i=2;i<=n-1;i++){
				if(n%i==0)
					temp = temp + 1;
			}
			if(temp==0)
				System.out.println(n);
			}
		}
}