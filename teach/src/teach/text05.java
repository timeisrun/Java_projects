package teach;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class text05 extends JFrame{

	static text05 frm = new text05();
	
	static JPanel pnl = new JPanel();
	
	static JButton btn = new JButton();
	
	public static void main(String[] args) {
//		//write file
//		try {
//			String str;
//			FileWriter fw=new FileWriter("index.txt");
//			BufferedWriter bfw=new BufferedWriter(fw);
//
//			for(int i=0;i<10;i++){
//				bfw.write(Double.toString(Math.random()));
//				bfw.newLine();
//			}
//
//			bfw.flush();
//			fw.close();
//		} catch (IOException e1) {
//			// TODO 自動產生的 catch 區塊
//			e1.printStackTrace();
//		}
		
//		//read file
//		try {
//			String str;
//			File file = new File("index.txt");//HAND FUNCTION_ball_1.slk");
//			BufferedReader bfr=new BufferedReader(new FileReader(file));
//			
//			while((str=bfr.readLine())!=null)
//			{
//				System.out.println(str);
//			}
//
//		} catch (IOException e1) {
//			// TODO 自動產生的 catch 區塊
//			e1.printStackTrace();
//		}
		
//		//timer
//		frm.setLayout(null);
//	    frm.setBounds(200,200,500,500);
//	    frm.setVisible(true);
//	    frm.addWindowListener(new WindowAdapter(){
//	    	public void windowClosing(WindowEvent e){
//	    		System.exit(0);}});
//		
//	    pnl = new JPanel();
//	    pnl.setLayout(null);
//        pnl.setBounds(0,0,500,500);
//	    pnl.setBackground(Color.BLACK);
//	    frm.add(pnl);
//		
//	    btn = new JButton();
//	    btn.setBounds(100,100,20,20);
//	    btn.setBackground(Color.white);
//	    pnl.add(btn);
	    
//	    Timer timer = new Timer(1, null);
//	    timer = new Timer(1000, new ActionListener() {
//        	public void actionPerformed(ActionEvent e) {
//        		
//        		System.out.println("a");
//        	}
//        });
//	    
//	    timer.start();
//	    
//	    timer = new Timer(1000, new ActionListener() {
//        	public void actionPerformed(ActionEvent e) {
//        		
//        		System.out.println("b");
//        	}
//        });
//	    
//	    timer.start();
//	    
//	    timer.stop();
		
//		timer = new Timer(1000, new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				btn.setLocation(btn.getLocation().x + 10, btn.getLocation().y);
//			}
//		});
//		
//		timer.start();
		
		
	}

}
