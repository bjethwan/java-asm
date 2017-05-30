package com.bjethwan;


/**
 * Use 
 * javap Sample1.class
 * javap -c Sample1.class
 * javap -c -verbose Sample.class
 * 
 * @author bjethwan
 *
 */
public class Sample1 {
	
	public String sayHello(String name){
		return "Hello " + name;
	}

	public static void main(String[] args) {
		new Sample1().sayHello("Bipin");
		System.out.println(System.getProperty("sun.arch.data.model")); 
		System.out.println(System.getProperty("os.arch"));
	}
}
