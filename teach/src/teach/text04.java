package teach;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class text04 extends JFrame {

	static text04 frm = new text04();
	
	static JPanel pnl = new JPanel();
	
	static JButton[] btn = new JButton[11];
	
	static JLabel lab = new JLabel();
	
	static TextArea txa = new TextArea();	
	
	static TextField txf = new TextField();

	public static void main(String[] args) {
//		//get width or height
//		int screenwidth= (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		
//		//Frame
//		frm.setLayout(null);
//	    frm.setBounds(100,100,500,500);
	    
//	    frm.setUndecorated(true);
//	    frm.setVisible(true);
	    
//	    frm.addWindowListener(new WindowAdapter(){
//	    	public void windowClosing(WindowEvent e){
//	    		System.exit(0);}});
	    
//	    //JPanel
//	    pnl = new JPanel();
//	    pnl.setLayout(null);
//        pnl.setBounds(0,0,500,500);
//	    pnl.setBackground(Color.gray);
//	    frm.add(pnl);
		
//	    //JButton and font
//		String[] s = {"a","b","c","d","e","f","g","h","lalala","dddd","abcde"};
//	    Font F0 = new Font("FangSong", Font.PLAIN, 20);
//	    for(int num=0; num<s.length; num++) {
//	    	btn[num] = new JButton(s[num]);
//	    	btn[num].setBounds(0 + num*51,0,50,50);
//	    	btn[num].setFont(F0);
//	    	btn[num].setBackground(Color.gray);
//	    	btn[num].setForeground(Color.white);
//		    pnl.add(btn[num]);
//	    }
	    
//	    btn[0].setLocation(0, 200);
		
		//btn[0].setBounds(100,100,300,300);
//		btn[0].setOpaque(true);
//		btn[0].setContentAreaFilled(false);
//		btn[0].setBorderPainted(false);
		
//		//JLabel
//		lab = new JLabel("今天天氣真好~");
//		lab.setFont(F0);
//		lab.setBounds(100, 100, 200, 80);
//		pnl.add(lab);
		
//		//TextArea
//		txa = new TextArea("");
//		//txa.setFont(F0);
//		txa.setBounds(100,100,200,200);
//		pnl.add(txa);
		
//		//TextField
//		txf = new TextField("132222222222222222222222222222222222");
//		txf.setBounds(100, 210, 100, 100);
//		txf.setFont(F0);
//		pnl.add(txf);
		
//		//Action
//		btn[0].addActionListener(new ActionListener() 
//		{public void actionPerformed(ActionEvent e){ 
//			btn[0].setLocation(btn[0].getLocation().x + 10, btn[0].getLocation().y);
//		} });
		
//		//actionlistener
//		btn[0].addActionListener(frm);
		
//		//mouselistener
//		btn[0].addMouseListener(frm);
	}

//	public void actionPerformed(ActionEvent e) {
//		JButton a =(JButton) e.getSource();
//		a.setLocation(a.getLocation().x+30, a.getLocation().y);
//	}
//	
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		// TODO 自動產生的方法 Stub
//		lab.setText("mouse click");
//	}
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO 自動產生的方法 Stub
//		lab.setText("mouse press");
//	}
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO 自動產生的方法 Stub
//		lab.setText("mouse release");
//	}
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO 自動產生的方法 Stub
//		lab.setText("mouse enter");
//	}
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// TODO 自動產生的方法 Stub
//		lab.setText("mouse leave");
//	}
}
