package JavaBasics;

public class StarPatternsConcept {

	public static void main(String[] args) {
		
		//Patterns to print
		
		/* 1. Star Triangle
		 
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * *

		 */

		//logic
		for (int i=0; i<5; i++) { //i = # of rows
			
			for(int j=0; j<=i; j++) { //j= # of cols
				
				System.out.print("*   "); //use print instead of println to print on the same row
			}
			
			System.out.println(); //new line at the end of each row
		}
		
		/* 2. Reverse Star Triangle
		 
		 * * * * *
		 * * * *
		 * * *
		 * * 
		 * 
		 		
		*/
		
		//logic
		for (int i=0; i<5; i++) { //i = # of rows
					
			for(int j=4; j>=i; j--) { //decrease value of j after each iteration
				
				System.out.print("*   "); //use print instead of println to print on the same row
			}
			
			System.out.println(); //new line at the end of each row
		}
		
		
		/* 3. Combined Star Pattern
		   
			*   *   
			*   *   *   
			*   *   *   *   
			*   *   *   *   *   
			*   *   *   *   *   
			*   *   *   *   
			*   *   *   
			*   *   
			*

		 */
		
		//logic
		for (int i=0; i<5; i++) { //i = # of rows
			
			for(int j=0; j<=i; j++) { //j= # of cols
				
				System.out.print("*   "); //use print instead of println to print on the same row
			}
			
			System.out.println(); //new line at the end of each row
		}
		
		for (int i=0; i<5; i++) { //i = # of rows
			
			for(int j=4; j>=i; j--) { //decrease value of j after each iteration
				
				System.out.print("*   "); //use print instead of println to print on the same row
			}
			
			System.out.println(); //new line at the end of each row
		}
		
		
		/* 3. Star Pattern from R to L
			   
		   					*
			            *   *
			        *   *   *
			    *   *   *   *   
			*   *   *   *   *   

	    */
		
		//logic
		for (int i=0; i<=4; i++) { //i = # of rows
			for (int j=4; j>=i; j--) { //loop to print blank spaces in each row
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) { //loop to print actual *
				System.out.print("*");
			}
			System.out.println(); //new row
			
		}
		
		/* 3. Pyramind Start pattern
		   
					*
		         *     *
		        *   *   *
		      *   *   *   *   
		    *   *   *   *   *   

		*/

		//logic
		 //put space before each * in the previous logic
		for (int i=0; i<=4; i++) { //i = # of rows
			for (int j=4; j>=i; j--) { //loop to print blank spaces in each row
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) { //loop to print actual *
				System.out.print(" "); //space before each *
				System.out.print("*");
			}
			System.out.println(); //new row
			
		}
		

		/* 3. Alphabet Pattern
			   
			  A
			  A B
			  A B C
			  A B C D
			  A B C D E
			  A BC D E F 

		*/
			//logic
			int alpha = 65;//use ASCII values of UPPERCASE alphabets to print
		  //int alpha = 97;//use ASCII values of LOWERCASE alphabets to print
			for (int i=0; i<=5; i++) { //i = # of rows
				for(int j=0; j<=i; j++) { //j= # of cols
					System.out.print((char)(alpha+j)+" "); //cast as a character	
				}
			System.out.println();	//new row
		}

	}
	
}
