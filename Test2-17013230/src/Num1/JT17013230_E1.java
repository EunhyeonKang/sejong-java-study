package Num1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JT17013230_E1 extends JFrame {
	JLabel lb;
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { //��ư Ŭ���� ȣ��Ǵ� �޼ҵ�
			JButton b = (JButton) e.getSource(); // �̺�Ʈ �ҽ� ��ư �˾Ƴ���
			if (b.getText().equals("Action")) // ��ư�� ���ڿ��� "Action"���� ��
				b.setText("�׼�"); // ��ư�� ���ڿ��� "�׼�"���� ����
			else
				b.setText("Action"); // ��ư�� ���ڿ��� "Action"���� ����
		}
	}
	private JT17013230_E1() {
		setTitle("��ư�� Mouse �̺�Ʈ �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); //�����ӿ� ����� ����Ʈ��
		MyMouseListener ln = new MyMouseListener(); 
		JPanel pn = new JPanel(); //�гο� ������Ʈ�� �ޱ����� �г� ��ü ����
		JButton btn = new JButton("Mouse Event�׽�Ʈ ��ư");

		pn.addMouseListener(new MyMouseAdapter()); //���콺 �̵��� �巡�� ����
		btn.addActionListener(new MyActionListener()); // �׼� �̺�Ʈ ������ �ޱ�
		
		c.setLayout(new BorderLayout(30, 20)); //����Ʈ�� ��ġ������ ����
		c.add(btn, BorderLayout.NORTH); //North��ġ�� ��ư�ޱ�
		c.add(pn, BorderLayout.CENTER); //Center��ġ�� �гδޱ�
		
		btn.setBackground(Color.yellow); //�⺻ ��ư ����
		btn.addMouseListener(ln); //���콺 Ŭ��
		
		lb = new JLabel("hello");
		lb.setSize(50, 20);
		lb.setLocation(30, 30);
		
		pn.add(lb);

		setSize(230, 150);
		setVisible(true);
	}

	private class MyMouseListener implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override //���콺 ��ġ�� ��ư �ȿ� ������ ������
		public void mouseEntered(MouseEvent e) {
			JButton b = (JButton) e.getSource();
			b.setBackground(Color.RED);
		}
		@Override //���콺 ��ġ�� ��ư �ۿ� ������ �����
		public void mouseExited(MouseEvent e) {
			JButton b = (JButton) e.getSource();
			b.setBackground(Color.YELLOW);
		}
	}

	private class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {//���콺 ��ư ���� ������ ȣ��
			int x = e.getX();
			int y = e.getY();
			lb.setLocation(x, y); 
		}
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		System.out.println("17013230/������");
		new JT17013230_E1();
	}
}
