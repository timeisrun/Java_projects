package teach;

import java.util.Scanner;

public class text01 {

	public static void main(String[] args) {
//		//块
//		System.out.println("硂穦传︽~~~~~");
//		System.out.println("硂穦传︽~");
//		System.out.println("硂穦传︽~");
//		System.out.print("硂ぃ穦传︽~~");
//		System.out.print("硂ぃ穦传︽~~");
//		System.out.print("硂ぃ穦传︽~~");
//
//		System.out.println();

//		System.out.println("硂穦传︽~\n礛跑Θ︽~");
				
//		//俱计
//		int a = 21;
//		System.out.println(a);
		
//		//玥笲衡
//		int num = 10, ber = 31;
//		System.out.println(num + ber);
//		System.out.println(num - ber);
//		System.out.println(num * ber);
//		System.out.println(num / ber);
//		System.out.println(num % ber);
		
//		//计
//		Double b = 123.456;
//		System.out.println(b);
//		
//		//﹃
//		String c = "";
//		System.out.println(c);
		
//		//﹃い
//		System.out.println(", "+c+"Ωǎ");
//		System.out.printf(", %sΩǎ\n", c);
		
//		System.out.println(", "+a+"Ωǎ");
//		System.out.println(", "+b+"Ωǎ");
		
//		//ノ硚ぃじ
//		char d = 'a';
//		System.out.println(d);
		
//		//块
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String str = scn.nextLine();
		
		while(scn.hasNext()) System.out.println(scn.nextLine());
		
//		//ifノ猭の闽菠珹腹
//		int e = 1;
//		if(e == 1) {
//			System.out.println("e琌1");
//		} else if(e == 2){
//			System.out.println("e琌2");
//		} else {
//			System.out.println("e琌"+e);
//		}
		
//		if(e == 1) System.out.println("e琌1");
//		else if(e == 2) System.out.println("e琌2");
//		else System.out.println("e琌"+e);
		
//		//forノ猭
//		for( int i=0; i<3; i++) {
//			System.out.println(i);
//		}
		
//		//switchノ猭
//		int f = 5;
//		switch(f) {
//			case 1: System.out.println("f琌1"); break;
//			case 2: System.out.println("f琌2"); 
//					break;
//			case 3: System.out.println("f琌3");
//			case 4: System.out.println("иа癘breakQQ"); break;
//			case 5: System.out.println("f琌5, ⊿break⊿畉"); 
//		}
		
//		//じ笲衡
//		int g = 1;
//		int h = (g == 1) ? 2 : 3;
//		System.out.println(h);
		
		//锣
		String ii = "123";
		System.out.println(ii + 1);
		System.out.println(ii + (1+3));
		
		int j = Integer.parseInt(ii);
		System.out.println(j + 1);
		
		//practice example
		int k = 0;
		for(int i=1; i<=50; i++) {
			k += i;
		}
		System.out.println("羆㎝琌"+k+"!!!");
	}

}
