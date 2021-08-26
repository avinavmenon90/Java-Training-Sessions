package JavaBasics;

public class CallByValueAndCallByReference {

	int p,q; //global vars
	
	public static void main(String[] args) {

		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		
		int x=10;
		int y=20;
		
		obj.testSum(x, y); //call by value/pass by value (copy of x & y  given to a & B)
		
		//initializing non-static global vars
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj); //call by reference
		
		//after swap
		System.out.println(obj.p); //p=60
		System.out.println(obj.q); //q=50
	}
	
	public int testSum(int a, int b) {
		a=30;
		b=40;
		
		int c=a+b;
		
		return c;
	}
	
	//call by reference (passing value of obj reference)
	public void swap(CallByValueAndCallByReference t) {
		
		int temp;
		temp = t.p; //temp=50
		t.p = t.q; //t.p=60
		t.q = temp; //t.q = 50
		
	}

}
