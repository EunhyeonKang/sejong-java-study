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
		public CircleThread(CiclePanel p) {cp = p;} //타원패널 
		public void CircleFg(boolean f) {fg = f;} 
		//동기화 
		synchronized public void threadPlay() {notify();}//synchronized메소드
		public void run() {
			try { 
				synchronized (this) {//synchronized코드블록
					wait();
				}
			} catch (InterruptedException ex) {
				return;
			}
			while (true) {
				try {
					if (fg) {
						cp.repaint();//프레임 전체를 다시 칠하는 일을 반복 
						cp.CircleRandom(); //랜덤 타원크기
					//	cp.setBackground(Color.green);
					}
					Thread.sleep(300);//0.3초마다 
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
			super.paintComponent(c);//Jcomponent 상속받아 타원 그리기 코드 작성
			CircleRandom();
			c.setColor(Color.pink);
			c.fillOval(cx, cy, cWidth, cHeight); //타원 그리기
			
		}
		
		public void CircleRandom() {
			cWidth = (int) (Math.random() * 200)+1; //랜덤 타원 
			cHeight = (int) (Math.random() * 200)+1;
			cx = (int) (Math.random() * (getWidth()));
			cy = (int) (Math.random() * (getHeight()));			
		}

	}
	public JC17013230E2() {
		
		CircleThread circleThread;
		CiclePanel cp = new CiclePanel();
		
		setTitle("17013230 강은현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(cp);
		
		setSize(300, 300);
		setVisible(true);
		cp.setBackground(Color.LIGHT_GRAY);
		circleThread = new CircleThread(cp);
		circleThread.start(); //스레드 시작
		circleThread.addMouseListener(new CircleListener()); //wakeup, pause메소드실행
		addMouseListener(new MouseAdapter() {
	
			public void mouseEntered(MouseEvent e) {//마우스 가 패널 안에 있을 경우
				circleThread.CircleFg(true); 
				circleThread.threadPlay();
			}
			
			public void mouseExited(MouseEvent e) {//마우스가 패널 밖에 있을 경우
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
		System.out.println("17013230/강은현");
		new JC17013230E2();
	}
}