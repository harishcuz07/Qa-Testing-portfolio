package ArrayConcept;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calc {
// tutorial007 chanel utube
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea area = new JTextArea(2,10);
	
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();
	JButton btn4 = new JButton();
	JButton btn5 = new JButton();
	JButton btn6 = new JButton();
	JButton btn7 = new JButton();
	JButton btn8 = new JButton();
	JButton btn9 = new JButton();
	JButton btn0 = new JButton();
	
	JButton btnadd = new JButton();
	JButton btnsub = new JButton();
	JButton btnmul = new JButton();
	JButton btndiv = new JButton();
	JButton btnclr = new JButton();
	JButton btndot = new JButton();
	JButton btneql = new JButton();
	
	double num1,num2,result;
	int addc=0, subc=0,divc=0,mulc=0;
	
	public calc() {
frame.setSize(340,450);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setTitle("selva");
frame.add(panel);
panel.setBackground(Color.pink);
Border border = BorderFactory.createLineBorder(Color.BLACK);
panel.add(area);
	Font font = new Font("arial", Font.BOLD,33);
	area.setFont(font);
	area.setForeground(Color.blue);
	area.setPreferredSize(new Dimension(2,10));
	area.setLineWrap(true);
	btn1.setPreferredSize(new Dimension(100,40));
	btn1.setIcon(new ImageIcon("C:\\Users\\selva\\Desktop\\Caculator Buttons\\button1.png"));
	
	panel.add(btn1);


	btn1.addActionListener((ActionListener) this);
	}
	
	

	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();
		if(source==btn1) {
			area.append("1");
		}
	}


	
	
	
}
