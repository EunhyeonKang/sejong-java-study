package Num3;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class JF17013230_E3 extends JFrame {
	JLabel la = new JLabel("");
	JLabel la1 = new JLabel("17013230");
	JLabel la2 = new JLabel("드래깅");
   public JF17013230_E3() {
      setTitle("JF17013230_E4");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel pn = new JPanel();
      JPanel pn1 = new JPanel(); 
      JPanel pn2 = new JPanel();
      JPanel pn3 = new JPanel(); 
      setLayout(new GridLayout(2,2,12,12));
      Container c = getContentPane();
      MyMouseListener listener = new MyMouseListener(); 
    //  pn3.addActionListener(new MyActionListener());
      pn2.addMouseListener(new MyMouseListener1());
      c.addMouseListener(listener); 		// MouseListener 리스너 등록
      c.addMouseMotionListener(listener); // MouseMotionListener 리스너 등록
     
      c.add(pn); //라벨패널
      c.add(pn1); // 타이머패널
      c.add(pn2); //라벨패널
      c.add(pn3); // 타이머패널
      pn.add(la); // 레이블 컴포넌트 삽입
      pn1.add(la);
      pn2.add(la1);
      pn3.add(la2);
  
      pn.setLayout(null); 
      pn.addKeyListener(new MyKeyListener());
      setSize(720, 720);
      setVisible(true);

  
      pn.setFocusable(true);
      pn.requestFocus();
   }
   class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			// la에 입력된 키의 키 이름 문자열을 출력하여 사용자에게 보고함
			la.setText(KeyEvent.getKeyText(e.getKeyCode()));

			if(e.getKeyChar() == '1') // 입력된 키가  % 인 경우
				contentPane.setBackground(Color.RED);
			else if(e.getKeyChar() == '2') // 입력된 키가  % 인 경우
				contentPane.setBackground(Color.BLUE);
			else if(e.getKeyChar() == '3') // 입력된 키가  % 인 경우
				contentPane.setBackground(Color.yellow);
			else if(e.getKeyCode() == KeyEvent.VK_F1) // 입력된 키가 <F1> 인가
				contentPane.setBackground(Color.GREEN);
		}
   }
   class MyMouseListener implements MouseListener, MouseMotionListener {
		// MouseListener의 5개 메소드 구현
		public void mousePressed(MouseEvent e) {
			la.setText("Pressed ("+e.getX()+","+e.getY()+")"); // 마우스가 눌러진 위치 (x,y) 점을 출력
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("Released("+e.getX()+","+e.getY()+")"); // 마우스가 떼어진 위치 (x,y) 점을 출력
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource(); // 마우스가 올라간 컴포넌트를 알아낸다.
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource(); // 마우스가 내려간 컴포넌트를 알아낸다.
			c.setBackground(Color.YELLOW);
		}
		
		// MouseMotionListener의 2개 메소드 구현
		public void mouseDragged(MouseEvent e) { // 마우스가 드래깅되는 동안 계속 호출
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
		}
		public void mouseMoved(MouseEvent e) { // 마우스가 움직이는 동안 계속 호출
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
		}
	}
   private class lbMouseAdapter extends MouseAdapter {
      public void mousePressed(MouseEvent e) {//마우스 버튼 누를 때마다 호출
         int x = e.getX();
         int y = e.getY();
         la.setLocation(x, y);
      }
   }
   private class MyMouseListener1 implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // 마우스 클릭 좌표 x
			int y = e.getY(); // 마우스 클릭 좌표 y
			la1.setLocation(x, y); // 레이블의 위치를 (x,y)로 이동
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
   }
   private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) 
				b.setText("액션");
			else 
				b.setText("Action");
			
			// InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
			JF17013230_E3.this.setTitle(b.getText()); // 프레임의 타이틀에 버튼 문자열을 출력한다. 
		}
	}	
   public static void main(String[] args) {

      new JF17013230_E3();
   }
}