寫寫看教學囉

********

這篇內容很淺，範圍只涵蓋LB上課會教的課程而已

如果在coding的過程中遇到問題可以聯絡給你網址的人歐~

#0. 教學大綱

##text01

- jre, jdk, new project class, package, public static void, import,

- 輸出, 整數, 小數, 字串, 字元, 輸入, try catch, throw IOException, if else, for, switch, (1>2)?3:1, 

- 轉型

##text02

- 陣列, length, new, null, 函數, void, return, static variable,

##text03

- class, static, private, protect, private不會繼承, 繼承

##text04

- screenwidth, frame, JPanel, JButton, font, label, textArea, textField, two of action, mouse Listener

##text05

- write and read, timer

#1. text01.java
==============

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

其他還有各種互相轉換方式, google上都有人列出來


> ##practice:
> 1. 輸入一個數字, 算出1~輸入數字的總和,<p>
> 如果大於1000, 輸出"數字太大了~", 小於1000則輸出"總和是XXX!!",<p>
> 如果輸入的不是數字, 則輸出"ERROR"(不用考慮輸入負數和小數的情況)

#2. text02.java
===============


> ##practice:
> 1. 寫一個function, 傳遞50進去, 可以回傳1加到50的結果回來
> 2. 寫一個function, 不使用return, 傳遞50進去後可以在main主程式印出1加到50的結果

#3. text03.java
===============

> ##practice:
> 1. 創造一個calss名稱為shape,裡面有變數unit=0, 計算邊長的function(內容為空)
> 2. 創造兩個calss分別為circle, square, 他們extends shape
> 3. 更新繼承來的function, 使得在主程式呼叫circle和square可以順利算出邊長(unit在circle和square中分別代表半徑和一個邊的長度)

#4. text04.java
===============

> ##practice:
> 1. 創造一個頁面, 上面有兩個Label顯示食物名稱, 兩個textField給使用者輸入購買數量, 一個按鈕在按下之後可以在另外一個label顯示"您要購買X個漢堡和X個薯條"
> 2. 創造一個頁面, 上面有一個button, 當滑鼠碰到他, 他會隨機跑到畫面的某處, 使玩家按不到他

#5. text05.java
===============

> ##practice:
> 1. 創造一個頁面有200個button, 其中50個會隨著時間變色, 其中50個會隨時間變大一定程度,再變小, 其中50個會左右跑碰到牆壁再返回, 最後50個會上下跑撞到牆壁再返回

> 2. 創造一個頁面, 隨著時間生成button, 上限自行設定, 出生點自行設定(隨機or中央or其他), 最後, 這些button會隨機移動, 看到其他button會遠離
