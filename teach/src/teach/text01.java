package teach;

import java.util.Scanner;

public class text01 {

	public static void main(String[] args) {
//		//��X
//		System.out.println("�o�|����~~~~~");
//		System.out.println("�o�|����~");
//		System.out.println("�o�|����~");
//		System.out.print("�o���|����~~");
//		System.out.print("�o���|����~~");
//		System.out.print("�o���|����~~");
//
//		System.out.println();

//		System.out.println("�o�|����~\n�M���ܦ��U�@��~");
				
//		//�ŧi���
//		int a = 21;
//		System.out.println(a);
		
//		//�|�h�B��
//		int num = 10, ber = 31;
//		System.out.println(num + ber);
//		System.out.println(num - ber);
//		System.out.println(num * ber);
//		System.out.println(num / ber);
//		System.out.println(num % ber);
		
//		//�ŧi�p��
//		Double b = 123.456;
//		System.out.println(b);
//		
//		//�ŧi�r��
//		String c = "�p��";
//		System.out.println(c);
		
//		//�r�ꤤ���ۥ[
//		System.out.println("�A�n, "+c+"�즸�����C");
//		System.out.printf("�A�n, %s�즸�����C\n", c);
		
//		System.out.println("�A�n, "+a+"�즸�����C");
//		System.out.println("�A�n, "+b+"�즸�����C");
		
//		//�γ~�������r��
//		char d = 'a';
//		System.out.println(d);
		
//		//��J
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String str = scn.nextLine();
		
		while(scn.hasNext()) System.out.println(scn.nextLine());
		
//		//if���Ϊk�H������ٲ��j�A��
//		int e = 1;
//		if(e == 1) {
//			System.out.println("e���ȬO1");
//		} else if(e == 2){
//			System.out.println("e���ȬO2");
//		} else {
//			System.out.println("e���ȬO"+e);
//		}
		
//		if(e == 1) System.out.println("e���ȬO1");
//		else if(e == 2) System.out.println("e���ȬO2");
//		else System.out.println("e���ȬO"+e);
		
//		//for�Ϊk
//		for( int i=0; i<3; i++) {
//			System.out.println(i);
//		}
		
//		//switch�Ϊk
//		int f = 5;
//		switch(f) {
//			case 1: System.out.println("f���ȬO1"); break;
//			case 2: System.out.println("f���ȬO2"); 
//					break;
//			case 3: System.out.println("f���ȬO3");
//			case 4: System.out.println("�ڧѰO�[break�FQQ"); break;
//			case 5: System.out.println("f���ȬO5, �᭱�Sbreak�S�t"); 
//		}
		
//		//�T���B��l
//		int g = 1;
//		int h = (g == 1) ? 2 : 3;
//		System.out.println(h);
		
		//�૬
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
		System.out.println("�`�M�O"+k+"!!!");
	}

}
