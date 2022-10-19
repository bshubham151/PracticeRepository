package com.capg;
import java.util.*;
public class ThirdSource {

	public static void main(String[] args) {
	  List<Employee> empLst=new ArrayList<Employee>();
	  Employee emp1=new Employee(101, "Chandrika", 22, "HR", 'F');
	  empLst.add(emp1);// ist way to enter details in collection empLst
	  empLst.add(new Employee(102, "Chandrakirani", 21, "Production", 'F'));// 2nd way to enter details in collection empLst
	  empLst.add(new Employee(103, "Dakshu", 20, "Development", 'F'));
	  empLst.add(new Employee(104, "Jensi", 21, "Production", 'F'));
	  empLst.add(new Employee(105, "Himanshu", 21, "Testing", 'M'));
	  for(Employee employee : empLst) {
		  System.out.println(employee);
		  System.out.println(employee.getEmployeeId()); 
         }
	  System.out.println(" below there is another method same as above method (for)");
	  Iterator<Employee> itr=empLst.iterator(); 
	   while(itr.hasNext()) { 
//		   System.out.println(itr.next()); 
	  System.out.println(itr.next().getEmployeeId());
	  
	}
	}
}
