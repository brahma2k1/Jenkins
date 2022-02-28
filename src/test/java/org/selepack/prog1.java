package org.selepack;

import org.selepack1.seleprog2;

public class prog1 extends seleprog2 {
	
		int x,y,z;
		
		public void m7(int x)
		{
			System.out.println("The value of x is:"+x);
		}
		public void m8(int x,int y)
		{
			z=x/y;
			System.out.println("The values of z in m8 method is:"+z);
		}
public static void main(String[] args) {
			
			prog1 obj2=new prog1();
			obj2.m7(10);
			obj2.m8(20,20);
			obj2.m3(30,40);
	}

}
