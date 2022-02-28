package org.selepack1;

public class seleprog1 {
	
	int x,y,z;
	
	public void m1(int x)
	{
		System.out.println("The value of x is:"+x);
	}
	public void m2(int x,int y)
	{
		z=x*y;
		System.out.println("The multiplication of z is:"+z);
	}
	public static void main(String[] args) {
		
		seleprog1 obj=new seleprog1();
		obj.m1(10);
		obj.m2(10,20);

	}

}
