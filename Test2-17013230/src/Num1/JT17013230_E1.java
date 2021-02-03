package Num1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JT17013230_E1 extends JFrame {
	JLabel lb;
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) { //버튼 클릭시 호출되는 메소드
			JButton b = (JButton) e.getSource(); // 이벤트 소스 버튼 알아내기
			if (b.getText().equals("Action")) // 버튼의 문자열이 "Action"인지 비교
				b.setText("액션"); // 버튼의 문자열을 "액션"으로 변경
			else
				b.setText("Action"); // 버튼의 문자열을 "Action"으로 변경
		}
	}
	private JT17013230_E1() {
		setTitle("버튼에 Mouse 이벤트 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); //프레임에 연결된 컨텐트팬
		MyMouseListener ln = new MyMouseListener(); 
		JPanel pn = new JPanel(); //패널에 컴포넌트를 달기위해 패널 객체 생성
		JButton btn = new JButton("Mouse Event테스트 버튼");

		pn.addMouseListener(new MyMouseAdapter()); //마우스 이동과 드래그 추적
		btn.addActionListener(new MyActionListener()); // 액션 이벤트 리스너 달기
		
		c.setLayout(new BorderLayout(30, 20)); //컨턴트팬 배치관리자 설정
		c.add(btn, BorderLayout.NORTH); //North위치에 버튼달기
		c.add(pn, BorderLayout.CENTER); //Center위치에 패널달기
		
		btn.setBackground(Color.yellow); //기본 버튼 배경색
		btn.addMouseListener(ln); //마우스 클릭
		
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

	private class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {//마우스 버튼 누를 때마다 호출
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
		System.out.println("17013230/강은현");
		new JT17013230_E1();
	}
}
