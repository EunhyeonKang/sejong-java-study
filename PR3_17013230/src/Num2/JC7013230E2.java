package Num2;
import java.awt.Color;
import java.awt.Container;
import java.awt.Window;
import javax.swing.*;
import java.awt.event.*;
class mouse_program extends JFrame{
	private JLabel C_la= new JLabel("C"); //문자열 "C" 레이블 생성
	public mouse_program(){
		setTitle("17013230 강은현");
		JPanel C_p = new JPanel(); //패널 생성
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(C_p);
		C_p.setBackground(Color.GREEN);//패널 백그라운드색상
		
		C_p.setLayout(null); //배치관리자 제거
		C_la.setLocation(100, 100); //레이블 초기값 
		C_la.setSize(10,10); //레이블 크기
		//어댑터 사용
		C_la.addMouseListener(new MouseAdapter() {
			//"C" 클릭
			public void mouseClicked(MouseEvent e) {
				//레이블 랜덤한 위치 
				int r_x = (int)(Math.random()*300);
				int r_y = (int)(Math.random()*300);
				
				C_la.setLocation(r_x, r_y);
			}
		});
		
		C_p.add(C_la);//레이블 출력
		
		setSize(500, 500);//프레임 크기
		setVisible(true);
	}
}
public class JC7013230E2{
	public static void main(String[] args) {
			new mouse_program();
	}
}
