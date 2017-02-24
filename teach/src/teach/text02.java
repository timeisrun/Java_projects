package teach;

public class text02 {

	static int var1 = 0;
	static String str1 = "";
	
	public static void main(String[] args) {
//		//array
//		int[] a = new int[12];
//		int[] b = {1, 2, 3};
		
//		System.out.println(a[0]);
//		System.out.println(b[0]);
		
//		for(int i=0; i<a.length; i++) System.out.println(a[i]);
		
//		for(int i=0; i<b.length; i++) System.out.println(b[i]);		
		
//		for(int i=0; i<a.length; i++) a[i] = i;
//		for(int i=0; i<a.length; i++) System.out.println(a[i]);
//		
//		a = new int[12];
//		for(int i=0; i<a.length; i++) System.out.println(a[i]);
		
//		Double[] c = new Double[12];
//		String[] d = new String[12];
//		
//		//null
//		System.out.println(c[0]);
//		System.out.println(d[0]);
		
//		if(c[0] == null) System.out.println("Nothing in c.");
//		else System.out.println("There have something!!");
		
//		//function
//		print("今天天氣真好~");
		
//		String s = "今天下雨= =";
//		print(s);
		
//		int num = 132;
//		print(num);
		
//		//return
//		int calc1 = 10, calc2 = 25;
//		System.out.println(calc1 + calc2);
//		
//		int calc3 = calc(calc1, calc2);
//		System.out.println(calc3);
//		
//		System.out.println(calc(calc1, calc2));
		
//		//static variable
//		int e = 10;
//		System.out.println(var1);
//		test_var(e);
//		System.out.println(var1);
//		test_var(e);
//		System.out.println(var1);
	}
	
	public static void print(String s) {
		System.out.println("我在這!!");
		System.out.println("而且我要印出"+s);
	}

	public static int calc(int a, int b) {
		return a+b;
	}
	
	public static void test_var(int a) {
		var1 += a;
	}
}
