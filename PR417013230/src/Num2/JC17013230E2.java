package Num2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javafx.collections.MapChangeListener;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JC17013230E2 extends JFrame {
	CiclePanel cp;
	class CircleThread extends Thread {
		private boolean fg;
		public CircleThread(CiclePanel p) {cp = p;} //Ÿ���г� 
		public void CircleFg(boolean f) {fg = f;} 
		//����ȭ 
		synchronized public void threadPlay() {notify();}//synchronized�޼ҵ�
		public void run() {
			try { 
				synchronized (this) {//synchronized�ڵ���
					wait();
				}
			} catch (InterruptedException ex) {
				return;
			}
			while (true) {
				try {
					if (fg) {
						cp.repaint();//������ ��ü�� �ٽ� ĥ�ϴ� ���� �ݺ� 
						cp.CircleRandom(); //���� Ÿ��ũ��
					//	cp.setBackground(Color.green);
					}
					Thread.sleep(300);//0.3�ʸ��� 
				} catch (InterruptedException e) {
					return;
				}
			}
		}

		public void wakeup() {
			// TODO Auto-generated method stub
			
		}

		public void pause() {
			// TODO Auto-generated method stub
			
		}

		public void addMouseListener(CircleListener circleListener) {
			// TODO Auto-generated method stub
			
		}
	}
	class CiclePanel extends JPanel {
		
		private int cx, cy, cWidth, cHeight;
	
		public void paintComponent(Graphics c) {
			super.paintComponent(c);//Jcomponent ��ӹ޾� Ÿ�� �׸��� �ڵ� �ۼ�
			CircleRandom();
			c.setColor(Color.pink);
			c.fillOval(cx, cy, cWidth, cHeight); //Ÿ�� �׸���
			
		}
		
		public void CircleRandom() {
			cWidth = (int) (Math.random() * 200)+1; //���� Ÿ�� 
			cHeight = (int) (Math.random() * 200)+1;
			cx = (int) (Math.random() * (getWidth()));
			cy = (int) (Math.random() * (getHeight()));			
		}

	}
	public JC17013230E2() {
		
		CircleThread circleThread;
		CiclePanel cp = new CiclePanel();
		
		setTitle("17013230 ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(cp);
		
		setSize(300, 300);
		setVisible(true);
		cp.setBackground(Color.LIGHT_GRAY);
		circleThread = new CircleThread(cp);
		circleThread.start(); //������ ����
		circleThread.addMouseListener(new CircleListener()); //wakeup, pause�޼ҵ����
		addMouseListener(new MouseAdapter() {
	
			public void mouseEntered(MouseEvent e) {//���콺 �� �г� �ȿ� ���� ���
				circleThread.CircleFg(true); 
				circleThread.threadPlay();
			}
			
			public void mouseExited(MouseEvent e) {//���콺�� �г� �ۿ� ���� ���
				circleThread.CircleFg(false);
			}
		});
	}
	class CircleListener extends MouseAdapter {
		@Override
		public void mouseEntered(MouseEvent me) {
			CircleThread circleThread = null;
			circleThread.wakeup();
		}
		@Override
		public void mouseExited(MouseEvent me) {
			CircleThread circleThread = null;
			circleThread.pause();
		}

	}
	public static void main(String[] args) {
		System.out.println("17013230/������");
		new JC17013230E2();
	}
}