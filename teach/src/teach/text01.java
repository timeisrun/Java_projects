package teach;

public class text01 {

	public static void main(String[] args) {
//		//輸出
//		System.out.println("這會換行~~~~~");
//		System.out.println("這會換行~");
//		System.out.println("這會換行~");
//		System.out.print("這不會換行~~");
//		System.out.print("這不會換行~~");
//		System.out.print("這不會換行~~");
//
//		System.out.println();

//		System.out.println("這會換行~\n然後變成下一行~");
				
//		//宣告整數
//		int a = 21;
//		System.out.println(a);
		
//		//四則運算
//		int num = 10, ber = 31;
//		System.out.println(num + ber);
//		System.out.println(num - ber);
//		System.out.println(num * ber);
//		System.out.println(num / ber);
//		System.out.println(num % ber);
		
//		//宣告小數
//		Double b = 123.456;
//		System.out.println(b);
//		
//		//宣告字串
//		String c = "小明";
//		System.out.println(c);
		
//		//字串中的相加
//		System.out.println("你好, "+c+"初次見面。");
//		System.out.printf("你好, %s初次見面。\n", c);
		
//		System.out.println("你好, "+a+"初次見面。");
//		System.out.println("你好, "+b+"初次見面。");
		
//		//用途不明的字元
//		char d = 'a';
//		System.out.println(d);
		
//		//輸入
//		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//		String buf_int = "aasdfasdf";
//		try {
//			buf_int = buf.readLine();
//		} catch (IOException exce) {
//			// TODO 自動產生的 catch 區塊
//			exce.printStackTrace();
//		}
//		System.out.println(buf_int);
		
//		//if的用法以及關於省略大括號
//		int e = 1;
//		if(e == 1) {
//			System.out.println("e的值是1");
//		} else if(e == 2){
//			System.out.println("e的值是2");
//		} else {
//			System.out.println("e的值是"+e);
//		}
		
//		if(e == 1) System.out.println("e的值是1");
//		else if(e == 2) System.out.println("e的值是2");
//		else System.out.println("e的值是"+e);
		
//		//for用法
//		for( int i=0; i<3; i++) {
//			System.out.println(i);
//		}
		
//		//switch用法
//		int f = 5;
//		switch(f) {
//			case 1: System.out.println("f的值是1"); break;
//			case 2: System.out.println("f的值是2"); 
//					break;
//			case 3: System.out.println("f的值是3");
//			case 4: System.out.println("我忘記加break了QQ"); break;
//			case 5: System.out.println("f的值是5, 後面沒break沒差"); 
//		}
		
//		//三元運算子
//		int g = 1;
//		int h = (g == 1) ? 2 : 3;
//		System.out.println(h);
		
//		//轉型
//		String ii = "123";
//		System.out.println(ii + 1);
//		System.out.println(ii + (1+3));
		
//		int j = Integer.parseInt(ii);
//		System.out.println(j + 1);
		
		//practice example
		int k = 0;
		for(int i=1; i<=50; i++) {
			k += i;
		}
		System.out.println("總和是"+k+"!!!");
	}

}
