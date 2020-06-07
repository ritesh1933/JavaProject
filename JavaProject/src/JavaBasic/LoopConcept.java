package JavaBasic;

public class LoopConcept {

	public static void main(String[] args) {
		
		
		//While Loop
		//disadavntage: If you won't increment the value of i then while will not terminate and it will keep printing the value
		
		int i=0;  //Initialization part
		while (i<10) {  //conditional part
			System.out.println(i);
			i=i+1;  //incremental part. 
			
		}
		
		System.out.println("**********");
		
		
		//For loop
		
		//j++ means j =  j + 1

		//Print 1 to 10
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}
		
		System.out.println("**********");
		
		
		//Print 10 to 9
		//k-- means k = k-1
		for (int k=10; k>=1; k--) {
			System.out.println(k);
		}
				
				
	}

}
