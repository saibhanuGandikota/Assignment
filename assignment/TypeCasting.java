package com.saibhanu.assignment;
public class TypeCasting {

	public static void main(String[] args) {
		//Implicit Type Casting
		System.out.println("Implicit Type Casting:");
		 byte i = 50;
		    
		    short j = i;
		    int k = j;
		    long l = k;
		    float m = l;
		    double n = m;
		    
		    System.out.println("byte value : "+i);
		    System.out.println("short value : "+j);
		    System.out.println("int value : "+k);
		    System.out.println("long value : "+l);
		    System.out.println("float value : "+m);
		    System.out.println("double value : "+n);
		    System.out.println("-------------------------------");
//Explicit Type Casting
			double d = 75.0;
			System.out.println("Explicit Type Casting :");
			float f = (float) d;
			long g = (long) f;
			int p  = (int) g;
			short s = (short) p;
			byte b = (byte) s;
			
			System.out.println("double value : "+d);
			System.out.println("float value : "+f);
			System.out.println("long value : "+g);
			System.out.println("int value : "+p);
			System.out.println("short value : "+s);
			System.out.println("byte value : "+b);

		
	}
}