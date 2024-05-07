package accessmodifier1;

import acessmodifiers.AccessClass1;
import acessmodifiers.AcessClass2;
import java_home.accessmodifier_a;

public class AccessClass3 extends AccessClass1 {
	
	public static void print()
	{
		System.out.println("method cls 3");
	}
	

	public static void main(String[] args) {
		AccessClass3.print();
		AccessClass1.pubMeth();
		AcessClass2.display();
		//System.out.println(accessclass1.b);    //outside package
		System.out.println(AccessClass1.p);    //protected accessible by subclass
		//System.out.println(AccessClass1.d);  //default not accessible
		
	}

}
