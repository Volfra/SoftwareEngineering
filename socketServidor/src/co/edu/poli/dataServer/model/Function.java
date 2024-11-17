package co.edu.poli.dataServer.model;

public class Function {
	
	public static int calculateFibonacci(int n) {
		
		int fib0=0,fib1=1,res=0;
      
		if (n==0)
			return fib0;
		if (n==1)
			return fib1;

		for (int x=2;x<=n;x++) {
			res=fib0+fib1;
			fib0=fib1;
			fib1=res;    
		} 
		
		return res;

	}
	
	public static String calculatenumberNarcissistic (int limit) {
		
		int digits;
		String serie = "";
		
		if (limit >= 10) {
		
			serie = "1 2 3 4 5 6 7 8 9";
		
			for (int n = 10; n <= limit; n++) {
			
				digits = ((int) Math.log10(n)) + 1;		
				
				int r = 0, s = 0, aux=n;
				while (aux>0) {
					r = aux%10;
					aux = aux/10;
					s += (int)Math.pow(r, digits);
				}
				
				if (s==n) 
					serie += " " + n;
			}
			
		} else {
			for (int i = 1; i <= limit; i++)
				serie += i + " ";
		}
		
		return serie; 

	}

}