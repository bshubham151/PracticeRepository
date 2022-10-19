package com.capg;
import java.util.*;
public class Source {

	public static void main(String[] args) {
		List lst=new ArrayList();
		List numbers=new ArrayList();
		numbers.add(5);// NORMAL INITALIZATION
		numbers.add(7);
		List coll=new ArrayList();
		coll=Arrays.asList(56,67,78,89);// VARAGS INITIALIZATION
		System.out.println("Varargs collection" +coll);
		System.out.println("Number list" +numbers);
		lst.addAll(coll);
		System.out.println(lst);
		lst.addAll(numbers);
		System.out.println(lst);

	}
}
