package acessmodifiers;

import java_home.accessmodifier_a;

public class AccessClass1 {
public static int a=20;	
private static int b=20;
protected static int p=24;
static int d=9;
public char i='a';   //aggregation  var
private char z='e';
protected char t='r';
char f='y';
	public static void pubMeth()
	{
		System.out.println("public method");
	}

	protected static void print()
	{
		System.out.println("protected method");	
	}
	
	public static void main(String[] args) {
		AccessClass1.pubMeth();
		System.out.println(AccessClass1.a);
		System.out.println(AccessClass1.b);
		
		System.out.println(accessmodifier_a.b); //call pub static var b from javahome package
		accessmodifier_a.print();   //call pub method
		
		//System.out.println(accessmodifier_a.c);   //private var not visible here
		
		//accessmodifier_a obj3=new accessmodifier_a();  //private var not visible here
		//System.out.println(obj3.d);
		
		System.out.println(AccessClass1.p);  //protected var
		System.out.println(AccessClass1.d);  //default
		AccessClass1.print();
	}

}

	

