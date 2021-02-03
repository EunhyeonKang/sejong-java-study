package Num1;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
class SwingProgram extends JFrame{
	public SwingProgram(){	
		int n=20,i=0;
		setTitle("17013230 강은현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //스윙 프레임 종료
		Container r_cp = getContentPane();
		r_cp.setBackground(Color.GREEN); //컨텐트팬 백그라운드 색상
		while(i<n) { 
			i++;
			JLabel r_la = new JLabel("*");
			r_cp.setLayout(null); //배치관리자 제거
			int r_x=(int)(Math.random()*200)+50; //랜덤한 위치
			int r_y=(int)(Math.random()*200)+50; 
			r_la.setBounds(r_x,r_y, 10, 10);//랜덤위치,20개의 10*10 크기
			r_cp.add(r_la);//레이블 출력
		}
		setSize(300,300);//프레임 크기
		setVisible(true);
	}
}
public class JC7013230E1 {
	public static void main(String[] args) {
			new SwingProgram();
	}
}