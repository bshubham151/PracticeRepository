
public class Calculator {
	public void addition(int num1, int num2) {
	    int sum=num1+num2;
	    System.out.println("The addition is "+sum);
	    System.out.println("Change to view in github");
	}

	public int product(int a, int b) {
	    int prd=a*b;
	    return prd;
	}
	public void division(int num1,int num2) {
	    if(num2==0) {
	        System.out.println("Cannot divide by zero");
	    }
	    else {
	    int div=num1/num2;
	    System.out.println("Division result is "+ div);
	    }
	}
	public int subtraction(int x, int y) {
	    return x-y;
	}
//	/public void multiplication(int num1, int num2)
//	{
//		  int sum=num1+num2;
//		    System.out.println("The addition is "+sum);
//	}
}
