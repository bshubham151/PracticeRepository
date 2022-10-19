import java.util.*;
public class FirstDemo {
	public static void main(String[] args) {
	int x, y, choice;
    Calculator obj = new Calculator();
    Scanner sc=new Scanner(System.in);
    
System.out.println("============= Calculator Menu=========");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
System.out.println("======================================");
System.out.println("Enter two numbers");
x=sc.nextInt();
y=sc.nextInt();
System.out.println("Enter your choice");
choice=sc.nextInt();
switch(choice) {
case 1:
obj.addition(x, y);
break;
case 2:
if(x>y)
System.out.println("Difference of two numbers " + obj.subtraction(x, y));
else
    System.out.println("OOPS, got negative result");
break;
case 3:
System.out.println("Product of two numbers "  + obj.product( x, y));
break;
case 4:
obj.division(x, y);
break;
default:
    System.out.println("Invalid choice");
    break;
}
}


}



