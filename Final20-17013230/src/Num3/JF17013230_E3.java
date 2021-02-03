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
	JLabel la2 = new JLabel("�巡��");
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
      c.addMouseListener(listener); 		// MouseListener ������ ���
      c.addMouseMotionListener(listener); // MouseMotionListener ������ ���
     
      c.add(pn); //���г�
      c.add(pn1); // Ÿ�̸��г�
      c.add(pn2); //���г�
      c.add(pn3); // Ÿ�̸��г�
      pn.add(la); // ���̺� ������Ʈ ����
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
			
			// la�� �Էµ� Ű�� Ű �̸� ���ڿ��� ����Ͽ� ����ڿ��� ������
			la.setText(KeyEvent.getKeyText(e.getKeyCode()));

			if(e.getKeyChar() == '1') // �Էµ� Ű��  % �� ���
				contentPane.setBackground(Color.RED);
			else if(e.getKeyChar() == '2') // �Էµ� Ű��  % �� ���
				contentPane.setBackground(Color.BLUE);
			else if(e.getKeyChar() == '3') // �Էµ� Ű��  % �� ���
				contentPane.setBackground(Color.yellow);
			else if(e.getKeyCode() == KeyEvent.VK_F1) // �Էµ� Ű�� <F1> �ΰ�
				contentPane.setBackground(Color.GREEN);
		}
   }
   class MyMouseListener implements MouseListener, MouseMotionListener {
		// MouseListener�� 5�� �޼ҵ� ����
		public void mousePressed(MouseEvent e) {
			la.setText("Pressed ("+e.getX()+","+e.getY()+")"); // ���콺�� ������ ��ġ (x,y) ���� ���
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("Released("+e.getX()+","+e.getY()+")"); // ���콺�� ������ ��ġ (x,y) ���� ���
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource(); // ���콺�� �ö� ������Ʈ�� �˾Ƴ���.
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource(); // ���콺�� ������ ������Ʈ�� �˾Ƴ���.
			c.setBackground(Color.YELLOW);
		}
		
		// MouseMotionListener�� 2�� �޼ҵ� ����
		public void mouseDragged(MouseEvent e) { // ���콺�� �巡��Ǵ� ���� ��� ȣ��
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
		}
		public void mouseMoved(MouseEvent e) { // ���콺�� �����̴� ���� ��� ȣ��
			la.setText("MouseMoved ("+e.getX()+","+e.getY()+")");
		}
	}
   private class lbMouseAdapter extends MouseAdapter {
      public void mousePressed(MouseEvent e) {//���콺 ��ư ���� ������ ȣ��
         int x = e.getX();
         int y = e.getY();
         la.setLocation(x, y);
      }
   }
   private class MyMouseListener1 implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // ���콺 Ŭ�� ��ǥ x
			int y = e.getY(); // ���콺 Ŭ�� ��ǥ y
			la1.setLocation(x, y); // ���̺��� ��ġ�� (x,y)�� �̵�
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
				b.setText("�׼�");
			else 
				b.setText("Action");
			
			// InnerClassListener�� ����� JFrame�� ����� ȣ���� �� ����
			JF17013230_E3.this.setTitle(b.getText()); // �������� Ÿ��Ʋ�� ��ư ���ڿ��� ����Ѵ�. 
		}
	}	
   public static void main(String[] args) {

      new JF17013230_E3();
   }
}