package com.capg;

import java.util.*;

public class SecondSource {
// es progm me collection and generic ki madat se type di hui hai values ko
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();// collection Create with generic type
		List<Integer> marks=new ArrayList<Integer>();
		List<Double> perc=new ArrayList<>();
		marks.add(34);
		marks.add(67);
		perc.add(56.7);
		perc.add(78.5);
		names.add("Hrithik");
		names.add("Vipin");
		names.add("Yuvraj");
		names.add("Nithya");
		System.out.println("Name = " +names);
		System.out.println("Marks = " +marks);
		System.out.println("Perc = " +perc);
		List lst=new ArrayList(); // empty and normal collection made
		List numbers=new ArrayList(); // 2 numbers and normal collection made
		numbers.add(5);
		numbers.add(7);
		List coll=new ArrayList();// normal collection made
		coll=Arrays.asList(56,67,78,89); // vararags collection made here
		System.out.println("Varargs collection" +coll);
		System.out.println("Number list" +numbers);
		lst.addAll(coll); // empty list -- adding the coll
		System.out.println(lst);
		lst.addAll(numbers); // appending elements from number list
		System.out.println(lst);
		lst.add("Vasantha"); // appending string element in the list
		System.out.println(lst);

		lst.addAll(names); //appending another collection of type String
		System.out.println(lst);

		numbers.addAll(names);
		System.out.println(numbers);

		// names.addAll(marks);
		System.out.println(names.get(0));

		Collections.sort(names);
		System.out.println(names);

//		Collections.sort(lst); sort can't be perform becs in this lst collection
//		System.out.println(lst); it contain different types of date like int , string,  
		
		//marks.addAll(perc); // marks is generic list which can contain only one 
		                   //type of value and perc is another generic class so
		// marks list can't contain the list of perc list 
		

		// perc.addAll(marks);// perc is generic list which can contain only one 
        //type of value and marks is another generic class so
		// perc list can't contain the list of marks list 
		names.remove("Vipin");
		System.out.println(names);
	}

}
