package JavaBasic;

public class IncrementalDecrementalOperator {

	public static void main(String[] args) {
		
		//++
		//--
		
		int i = 1;
		int j = i++; //post increment
		
		System.out.println("The value of i = " + i);
		System.out.println("The value of j = " + j);

	
	
		int a = 1;
		int b = ++a; //pre increment
		
		System.out.println("The value of a = " + a);
		System.out.println("The value of b = " + b);
		
	
		int m = 2;
		int n = m--; //pre increment
	
		System.out.println("The value of m = " + m);
		System.out.println("The value of n = " + n);
		
	}


}
