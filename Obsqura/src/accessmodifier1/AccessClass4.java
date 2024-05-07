package accessmodifier1;

import acessmodifiers.AccessClass1;
import acessmodifiers.AcessClass2;

public class AccessClass4 extends AcessClass2 {
	
	public static void print1()
	{
		System.out.println("method in cls 4");
	}
	

	public static void main(String[] args) {
		
		AccessClass4.print1();
		AcessClass2.display();
		//System.out.println(accessclass1.b);    not accessible
		//System.out.println(accessclass1.p);   //out package not accessible
		//System.out.println(AccessClass1.d);  //default not accessible
		
		AccessClass1 obj=new AccessClass1();
		System.out.println(obj.i);            //aggregation - HAS-A relationship- only pub has access- entity ref of another cls- call prev class inst var in another package without any connection
		//System.out.println(obj.z);         //aggreagtion pvt not visible
		//System.out.println(obj.t);          //aggregation protected not visible
		//System.out.println(obj.f);         //aggregation default not visible
	} 

}
