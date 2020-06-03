package JavaBasic;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 40;
		
		if(b>a) 
			{
			System.out.println("B is greater than a");
			}
		
			else 
			{
			System.out.println("a is greater than b");
			}
		
		int c = 40;
		int d = 4;
		
		if (c==d)
			{
			System.out.println("c is equal to d");
			}
		else
			{
			System.out.println("c is not equal to d");
			}
				
		
		int a1 = 900;
		int b1 = 500;
		int c1 = 600;
		
		if (a1>b1 & a1>c1)
			{
			System.out.println("a1 is greater number");
			}
		
			else if (b1>c1)
			{
				System.out.println("b1 is greater number");
			}
			else 
			{
				System.out.println("c1 is greater number");
			}
	}

}
