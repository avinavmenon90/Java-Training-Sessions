package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {

//+ : Concatenation operator
//println : Print on console output in a new line
		int a=100;
		int b=200;
		
	//	String x="Hello";
	//	String y="World";
		
		//Execution is left-right
		System.out.println(x+y+a+b); //gives HelloWorld100200 and not HelloWorld300
		System.out.println(x+y+(a+b)); //gives HelloWorld300
		System.out.println(a+b+x+y+a+b); //gives 300HelloWorld100200
		
		
//Pre and Post Increments
		
		//int i=1;
		//int j=i++; //post-increment (j assigned value of i and then i incremented)
		
		System.out.println(i); //i is 2
		System.out.println(j); //j is 1 (old value of i)
		
		//int x=1;
		//int y=++x; //pre-increment (y assigned value of x AFTER x is incremented)
		
		System.out.println(x); //x is 2
		System.out.println(y); //y is also 2

		
//Array Concept
		
		int i[] = new int[4];

		//lower bound: 0, upper bound: [n]
		i[0]=10;
		i[1]=20;
		i[2]=42;
		i[3]=55;
		
		System.out.println(i[4]); //gives ArrayIndexOutOfBoundsException
		
		System.out.println(i.length); //size of array
		
		//print array values:
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		

		//Object Array
		Object obj[] = new Object[6];
		obj[0]="Tom";
		obj[1]=13;
		obj[2]=15.98;
		obj[3]=true;
		obj[4]='A';
		obj[5]="London";
		
		
		
//2D Array
		
		//String x[][] = new String[3][5]; //[row][col]
		
		System.out.println(x.length); //total # rows
		
		System.out.println(x[0].length); //total # columns
		
		//print values in 2D Array
		for(int row=0; row<x.length; row++) {
			for (int col=0; col<x[0].length; col++) {
				
				System.out.println(x[row][col]);
				
			}
			
			
	
		}
		
//Wrapper Class
			String s="100";
				
			//Integer - string to int
			int i = Integer.parseInt(s);
			System.out.println(s+20); //gives 120
			
			//Double - string to double
			double d = Double.parseDouble(s);
			System.out.println(d); //gives 100.00
			
			//Boolean - string to boolean
			String k = "true";
			boolean b = Boolean.parseBoolean(k);
			System.out.println(b); //gives 120.00
			
			//Int to string
			int j=200;
			System.out.println(j+20); //gives 220
			
			String s = String.valueOf(j);
			System.out.println(s+20); //gives 20020
			
			//If string is NOT a pure number
			//then Integer.parseInt() throws NumberFormatException
			
			String str ="100A";
			int l = Integer.parseInt(str); //NumberFormatException
			System.out.println(l);
			
	}
	
	
	
//Non-static methods		
	public void test() {
		
		System.out.println("test method");
	}
	
	public void pqr() {
		
		System.out.println("pqr method");
	}

}
