package project;

public class TypeCasting {

	public static void main(String[] args) {
		byte b = 100;
		int i = b;
		System.out.println(i);
		
		float f = 23.09f;
		double d = f;
		System.out.println(d);
		
		char ch = 'C';
		int i3 = ch;
		System.out.println(i3);
		
		char var1 = '\u00A7';
		int i4 = var1;
		System.out.println(i4);
		
		// narrowing/explicit type casting

		double f1 = 31.52f;
		long l = (long) f1;
		System.out.println(l);

		long l1 = 923372567454775806l;
		int i2 = (int) l1;
		System.out.println(i2);

		float f2 = 44.56f;
		int i1 = (int) f2;
		System.out.println(i1);

		byte b1 = 80;
		char ch1 = (char) b1;
		System.out.println(ch1);
	}

}
