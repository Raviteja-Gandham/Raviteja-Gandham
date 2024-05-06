class ExplicitTypeCasting
{
	public static void main(String ar[])
	{
		double d=2134.234;
		long l=(long)d;
		float f=(float)l;
		int i= (int)f;
		short s=(short)i;
		byte b=(byte)s;
		boolean bl=(boolean)b;
		
		System.out.println("Double : "+d);
		System.out.println("Long : "+l);
		System.out.println("Float : "+f);
		System.out.println("Int : "+i);
		System.out.println("Short : "+s);
		System.out.println("Byte : "+b);
		System.out.println("Byte : "+bl);
		
	}
}