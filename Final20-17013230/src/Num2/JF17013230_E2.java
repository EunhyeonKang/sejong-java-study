package Num2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



 
public class JF17013230_E2 extends JFrame implements KeyListener
{
	    public JF17013230_E2()
	    {
	    
	        this.setSize(500, 300);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setTitle("JF17013230_E2");
	        MyMouseListener ln = new MyMouseListener(); 
	        MyMouseListener1 ln1 = new MyMouseListener1(); 
	        MyMouseListener2 ln2 = new MyMouseListener2(); 
	        
	        
	        JButton JButton1 = new JButton("West");
	        add(JButton1, BorderLayout.WEST);
	        JButton1.setBackground(Color.yellow); 
	        JButton1.addActionListener(new MyActionListener());
	        JButton1.addMouseListener(ln1);
	        
	        
	        JButton JButton2 = new JButton("CENTER");
	        add(JButton2, BorderLayout.CENTER);
	        JButton2.setBackground(Color.GRAY); 
	        JButton2.addActionListener(new MyActionListener());
	        JButton2.addMouseListener(ln2);
	        
	        JButton JButton3 = new JButton("East");
	        add(JButton3, BorderLayout.EAST);
	        JButton3.setBackground(Color.yellow);
	        JButton3.addActionListener(new MyActionListener());
	        JButton3.addMouseListener(ln);
	        
	        //inputText.addKeyListener(this);
	         
	        setVisible(true);
	    }

	    private class MyActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) { //버튼 클릭시 호출되는 메소드
				JButton b = (JButton) e.getSource(); // 이벤트 소스 버튼 알아내기
				
			}
		}
	    private class MyMouseListener implements MouseListener {
			@Override
			public void mouseClicked(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override //마우스 위치가 버튼 안에 있으면 빨간색
			public void mouseEntered(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.RED);
			}
			@Override //마우스 위치가 버튼 밖에 있으면 노란색
			public void mouseExited(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.YELLOW);
			}
		}
	    private class MyMouseListener1 implements MouseListener {
			@Override
			public void mouseClicked(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override //마우스 위치가 버튼 안에 있으면 빨간색
			public void mouseEntered(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.BLUE);
			}
			@Override //마우스 위치가 버튼 밖에 있으면 노란색
			public void mouseExited(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.YELLOW);
			}
		}
	    private class MyMouseListener2 implements MouseListener {
			@Override
			public void mouseClicked(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override //마우스 위치가 버튼 안에 있으면 빨간색
			public void mouseEntered(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.PINK);
			}
			@Override //마우스 위치가 버튼 밖에 있으면 노란색
			public void mouseExited(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.YELLOW);
			}
		}
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
    public static void main(String[] args)
    {
    	JF17013230_E2 t = new JF17013230_E2();
    }
}
