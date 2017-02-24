寫教學順便練git

********

這篇內容很淺，範圍只涵蓋LB上課會教的課程而已

如果在coding的過程中遇到問題可以聯絡給你網址的人歐~

#[0. 教學大綱](#0-%E6%95%99%E5%AD%B8%E5%A4%A7%E7%B6%B1)

##[text01](#1-text01java)

- [jre](#jre), [jdk](#jdk), [new project class](#new-project-class), [package](#package), [public static void](#public-static-void), [import](#import),

- [輸出](#輸出), [整數](#宣告整數), [小數](#宣告小數), [字串](#宣告字串), [字元](#宣告字元), [輸入](#%E8%BC%B8%E5%85%A5-trycatch-throw-ioexception), [try catch](#%E8%BC%B8%E5%85%A5-trycatch-throw-ioexception), [throw IOException](#%E8%BC%B8%E5%85%A5-trycatch-throw-ioexception), [if else](#if-else%E9%81%B8%E6%93%87%E6%95%98%E8%BF%B0), [for](#for%E8%BF%B4%E5%9C%88), [switch](#switch%E9%81%B8%E6%93%87%E6%95%98%E8%BF%B0), [(1>2)?3:1](#%E4%B8%89%E5%85%83%E9%81%8B%E7%AE%97%E5%AD%90), 

- [轉型](#%E8%BD%89%E5%9E%8B)

##[text02](#2-text02java)

- [陣列](#陣列), [length](#length), [new](#new), [null](#null), [函數](#函數), [return](#return), [static variable](#static-variable),

##text03

- class, static, private, protect, private不會繼承, 繼承

##text04

- screenwidth, frame, JPanel, JButton, font, label, textArea, textField, two of action, mouse Listener

##text05

- write and read, timer

#[1. text01.java](#1-text01java)  

##jre<p>

    JAVA運行環境(JAVA running environment), 這是JAVA通行各種OS(作業系統)的基礎

##jdk<p>

    JAVA開發套件(JAVA development kit), 一般使用者不需, 但程師開發者需要此物來協助compile和debug

好的 以上是最基礎要知道的名詞意義<p>

至於JAVAHOME變數我沒在用就不介紹了哈哈哈<p>

##new project class<p>
首先我們要先開啟新專案, 才能在裡面coding然後送給編譯器編譯<p>
請先啟動你的eclipse<p>

    File -> new -> Java projects -> 填寫專案名稱 -> finish

接著在你的專案瀏覽器(或稱工作區)對著剛剛新增的java project點右鍵<p>

    new -> class -> 給你的主檔案取個名字 -> 下方public static void main(String[] args)勾選 -> finish

剛剛新增的Java project表示說我們要做一個專案, 這個專案的名字叫做XXX<p>
新增完後eclipse會幫你建好檔案內容, 比如說裝著原始碼的src資料夾, 裝編譯完後.class檔存放的bin資料夾等等<p>
接著對project按右鍵新增class檔, 就是增加一個檔案可以寫你的原始碼(還有很多東西可以新增到你想指定的地方)<p>

##package<p>
也許會有一行package在你剛new的class內容最上方, package和class是讓編譯器分辨該檔案應是和那些群組連結在一起的<p>
如果編譯器分辨錯誤, 將所有檔案編譯在一起就會造成混亂, 比如變數名稱, class名稱重複, 或是不知道該去哪裡執行程式等等<p>

##public static void<p>
剛剛在new class時, 勾選的選項意義是, 給你的這個java檔加上那一段function(可以自行試試看new class不勾選會變什麼樣子)<p>
而這段function的意義是, 你的編譯器會將有這段function的java檔, 當作此project的進入點, 從這邊開始運行程式<p>
其中public為公開之意, 其他檔案可呼叫此檔案的public function<p>
static只要程式運行, 則此修飾子修飾的物件就會存在, 程式結束此物才跟著消滅, (function, 變數, 物件等等都可用此修飾子)<p>
void為不回傳, JAVA是物件導向程式語言, 裡面所有東西, 都可視為物件, 所以表示此物件不回傳值<p>

##import<p>
再來是import, 跟C一樣將其他人寫好的函式庫匯入進來, 等等會用到<p>

> ##tips
> Ctrl + 斜線可整行(整段)註解或反註解<p>
> 在eclipse中 Ctrl + F11 可編譯並執行

##輸出<p>

接著請先打開text01.java檔, 邊看裡面程式碼邊學~<p>

學一個程式語言, 慣例是讓你印出Hello world, 所以先學習輸出內容到monitor上

    System.out.println("Hello world!");

println的意思是印出+換行<p>

用print則只有印出<p>

而且輸出可吃反斜線n

    System.out.println("這會換行~\n然後變成下一行~");
    
##宣告整數<p>

    int a = 21;

並可將變數a放至輸出中印出<p>

    System.out.println(a);
    
##四則運算<p>

也可在輸出中做運算

    int num = 10, ber = 31;
    System.out.println(num + ber);

##宣告小數<p>

    Double b = 123.456;
    
##宣告字串<p>

    String c = "小明";
    
##字串中的相加<p>

    System.out.println("你好, "+c+"初次見面。");

也可以使用C的printf

    System.out.printf("你好, %s初次見面。\n", c);
    
##宣告字元<p>

    char d = 'a';
    
##輸入, try/catch, throw IOException<p>

輸入有scanner或bufferedreader等, 我都是用bufferedreader<p>
不過之後沒人在讓你輸入東西的, 所以只要稍微了解就好<p>

    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	String buf_int = "aasdfasdf";
	try {
		buf_int = buf.readLine();
	} catch (IOException exce) {
		// TODO 自動產生的 catch 區塊
		exce.printStackTrace();
	}
	System.out.println(buf_int);

這邊有兩點需要注意:<p>
- 1. 基本上你第一行如果是用手打而不是貼上或是從他給的提示字選的話, eclipse會在他的底下畫波浪線報錯給你<p>
這時你可將滑鼠觸碰波浪線, 顯示錯誤訊息<p>
裡面會提示你說你的某些東西沒有import或定義, 要不要import或定義?<p>
這時就選擇import bufferedreader, 然後你就會在這個java檔的最上方發現他幫你加了一行import了<p>
- 2. Java有一些例外處理機制, 免得工程師的粗心讓程式無法順利執行<p>
在Input/Output(簡稱IO)這部分有throw IOException和try/catch兩種機制可以運用<p>
前者會在最上方public class xxxx的後面, 加上 throw IOException,<p>
表示說在這個class裡面發生的例外全部拋出, 但不會讓程式停滯<p>
後者則是像我提供的例子, 將IO部分用try和catch包住, <p>
則程式一般情況會執行try裡面的程式, 只有在try裡面的程式出現了Exception,<p>
才會運行catch部分抓住這個例外, 並執行你寫在裡面的code, 也就不會讓程式停止運行了<p>

##if else選擇敘述
    int e = 1;
	if(e == 1) {
		System.out.println("e的值是1");
	} else if(e == 2){
		System.out.println("e的值是2");
	} else {
		System.out.println("e的值是"+e);
	}
    
基礎知識, 僅介紹格式, 不再贅述<p>
當然Java在只有一行指令時, 也可以省略大括號<p>

    if(e == 1) System.out.println("e的值是1");
	else if(e == 2) System.out.println("e的值是2");
	else System.out.println("e的值是"+e);
    
##for迴圈

    for( int i=0; i<3; i++) {
		System.out.println(i);
	}

也是基礎知識, 不再贅述<p>

##switch選擇敘述

    int f = 5;
	switch(f) {
		case 1: System.out.println("f的值是1"); break;
		case 2: System.out.println("f的值是2"); 
				break;
		case 3: System.out.println("f的值是3");
		case 4: System.out.println("我忘記加break了QQ"); break;
		case 5: System.out.println("f的值是5, 後面沒break沒差"); 
	}
    
這邊注意的是break必須在每個case的最後使用, 否則會執行到switch結尾或遇到break才離開<p>

##三元運算子

    int g = 1;
	int h = (g == 1) ? 2 : 3;
	System.out.println(h);
    
雖然是基礎知識還是解釋一下<p>
格式意義為 (邏輯敘述) ? 前者為真 : 前者為假;<p>
所以上方例子, 程式會印出2<p>

##轉型

    String ii = "123";
    int j = Integer.parseInt(ii);

其他還有各種互相轉換方式, google上都有人列出來<p>


> ##practice:
> 1. 輸入一個數字, 算出1~輸入數字的總和,<p>
> 如果大於1000, 輸出"數字太大了~", 小於1000則輸出"總和是XXX!!",<p>
> 如果輸入的不是數字, 則輸出"ERROR"(不用考慮輸入負數和小數的情況)

#[2. text02.java](#2-text02java)

##陣列

	int[] a = new int[12];
	int[] b = {1, 2, 3};
	
介紹陣列寫法, 與C語言相似<p>
可以用第一種宣告陣列大小的方式, 宣告陣列, 如果沒設定初始值則JAVA幫自動全部歸0<p>
第二種為宣告陣列內容的方式, 大小為3<p>

##length

	for(int i=0; i<a.length; i++) System.out.println(a[i]);
	
a.length可以取得a陣列的大小<p>

##new
再來說說宣告變數時用到的""new""這個詞<p>
當一個物件宣告完並且使用完後, 如果再被new一次<p>
他會變成一個全新的物件<p>
而舊的物件過一段時間後會被JAVA垃圾回收機制回收, 歸還記憶體<p>	

	int[] a = new int[12];
	a[0] = 5;
	System.out.println(a[0]);
	a = new int[12];
	System.out.println(a[0]);
	
如上範例會印出5下一行印出0

##null

再來說說null的概念<p>
他表示這個物件內的東西不存在或未賦值或未指向任何物件<p>
有時可以藉此判斷有沒有獲得值來寫判斷式<p>
首先我們先宣告兩個陣列<p>

	Double[] c = new Double[12];
	String[] d = new String[12];

因為只有int陣列宣告JAVA會幫你自動歸0<p>
所以

	System.out.println(c[0]);
	System.out.println(d[0]);
	
會印出兩個null

##函數

你的main就是一個函數(function)<p>
比如在和main同階層的地方新增一個function<p>

	public static void print(String s) {
		System.out.println("我在這!!");
		System.out.println("而且我要印出"+s);
	}
	
	
public static void在text01解釋過了<p>
表示此function可以被其他java檔呼叫, 表示此程式片段隨著程式執行而生成而消滅<p>
表示此function不需回傳值<p>
括號裡頭的string s表示此function從別的地方呼叫, 必須傳入字串型態的變數, (在此function中此傳入物件的名稱為s)<p>
否則系統會報錯<p>
我可以在main中呼叫此function<p>

	print("今天天氣真好~");
	
則程式會將""今天天氣真好~""這個字串傳進去print function<p>
並照著程式執行下去, 印出兩行字<p>
同樣的也可以先宣告變數, 再傳進function<p>

	String s = "今天下雨= =";
	print(s);
	
但注意到了嗎?<p>
我們宣告的變數s型態是string<p>
所以才可以傳進去print function<p>
因為你在print function那邊已經宣告了會傳入型態為string 的變數s進來<p>
所以如下程式編譯器會報錯<p>

	int num = 132;
	print(num);
	
因為你的num是int型態不是string型態<p>

##return

既然了解了function的寫法及意義, 再來介紹return功能<p>

return顧名思義就是回傳值<p>
所以function要這樣宣告<p>

	public static int calc(int a, int b) {
		return a+b;
	}
	
function的修飾子從剛剛的void變成int了<p>
表示這個function執行完會回傳一個int回去呼叫的地方<p>
在上方例子中也就是回傳a+b的結果回去呼叫的地方<p>
所以可以在main中這樣呼叫<p>

	int calc1 = 10, calc2 = 25;
	int calc3 = calc(calc1, calc2);
	System.out.println(calc3);
	
則執行程式會印出10+25的結果35<p>
當然, 因為Java是物件導向程式語言<p>
所以也可以直接將呼叫function的程式碼放在println裡面<p>

	System.out.println(calc(calc1, calc2));
	
##static variable

最後, 來說明static variable<p>
在text02.java檔中, 在main function的上方, 有宣告兩個變數<p>

	static int var1 = 0;
	static String str1 = "";
	
static表示此變數隨著程式執行結束而生成消滅<p>
故可將這當作c中全域變數的概念<p>
我們先寫一個function<p>

	public static void test_var(int a) {
		var1 += a;
	}
	
呼叫此function會將你傳入function的值加到var1這個變數之中<p>
所以在main function寫出如下程式<p>

	int e = 10;
	System.out.println(var1);
	test_var(e);
	System.out.println(var1);
	test_var(e);
	System.out.println(var1);
	
雖然在main沒有運算到var1這個變數<p>
但因為他是全域變數<p>
所以可以在test_var function中運算<p>

> ##practice:
> 1. 寫一個function, 傳遞50進去, 可以回傳1加到50的結果回來
> 2. 寫一個function, 不使用return, 傳遞50進去後可以在main主程式印出1加到50的結果

#[3. text03.java](#3-text03java)

> ##practice:
> 1. 創造一個calss名稱為shape,裡面有變數unit=0, 計算邊長的function(內容為空)
> 2. 創造兩個calss分別為circle, square, 他們extends shape
> 3. 更新繼承來的function, 使得在主程式呼叫circle和square可以順利算出邊長(unit在circle和square中分別代表半徑和一個邊的長度)

#[4. text04.java](#4-text04java)

> ##practice:
> 1. 創造一個頁面, 上面有兩個Label顯示食物名稱, 兩個textField給使用者輸入購買數量, 一個按鈕在按下之後可以在另外一個label顯示"您要購買X個漢堡和X個薯條"
> 2. 創造一個頁面, 上面有一個button, 當滑鼠碰到他, 他會隨機跑到畫面的某處, 使玩家按不到他

#[5. text05.java](#5-text05java)

> ##practice:
> 1. 創造一個頁面有200個button, 其中50個會隨著時間變色, 其中50個會隨時間變大一定程度,再變小, 其中50個會左右跑碰到牆壁再返回, 最後50個會上下跑撞到牆壁再返回

> 2. 創造一個頁面, 隨著時間生成button, 上限自行設定, 出生點自行設定(隨機or中央or其他), 最後, 這些button會隨機移動, 看到其他button會遠離
