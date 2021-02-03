package Num4;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JF17013230_E4 extends JFrame{
	int[] won = {50000,10000,1000,500,100,50,10,1};
	String[] str = {"금액","오만원","만원","천원","500원","100원","50원","10원","1원"};
	JLabel label;
	JTextField[] text = new JTextField[str.length];
	JCheckBox[] box = new JCheckBox[won.length];
	JButton b;
	JF17013230_E4() {
		setTitle("JF17013230_E4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		Container c = getContentPane();
		c.setBackground(Color.yellow);
		
		
		
		for(int i=1;i<str.length;i++) {
			label = new JLabel(str[i]);
			label.setHorizontalAlignment(JLabel.RIGHT);
			label.setSize(50,20);
			label.setLocation(50,100 + 20*i);
			c.add(label);
		}
		
		text[0] = new JTextField(15);
		text[0].setSize(100,20);
		text[0].setLocation(120,50);
		c.add(text[0]);
		label = new JLabel(str[0]);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setSize(50,20);
		label.setLocation(50,50);
		c.add(label);
		for(int i=0;i<box.length;i++) {
			box[i] = new JCheckBox();
			box[i].setBackground(Color.yellow);
			box[i].setSize(20,20);
			box[i].setLocation(250,120 + 20*i);
			c.add(box[i]);
		}
		
		for(int i=1;i<str.length;i++) {
			text[i] = new JTextField(15);
			text[i].setSize(100,20);
			text[i].setLocation(120,100 + 20*i);
			c.add(text[i]);
		}
		
	
		b = new JButton("계산");
		b.addActionListener(new MyActionListener());
		b.setSize(70,20);
		b.setLocation(250,50);
		c.add(b);
		
		
		setSize(380,380);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int input = Integer.parseInt(text[0].getText());
			
			int m = 0;
			
			
			for(int i=0;i<won.length;i++) {
				if(box[i].isSelected()) {
					m=input/won[i];
					text[i+1].setText(Integer.toString(m));
					input %= won[i];
				} else {
					text[i+1].setText("0");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JF17013230_E4();
	}

}
