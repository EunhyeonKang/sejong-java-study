package Num1;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
class SwingProgram extends JFrame{
	public SwingProgram(){	
		int n=20,i=0;
		setTitle("17013230 ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� ������ ����
		Container r_cp = getContentPane();
		r_cp.setBackground(Color.GREEN); //����Ʈ�� ��׶��� ����
		while(i<n) { 
			i++;
			JLabel r_la = new JLabel("*");
			r_cp.setLayout(null); //��ġ������ ����
			int r_x=(int)(Math.random()*200)+50; //������ ��ġ
			int r_y=(int)(Math.random()*200)+50; 
			r_la.setBounds(r_x,r_y, 10, 10);//������ġ,20���� 10*10 ũ��
			r_cp.add(r_la);//���̺� ���
		}
		setSize(300,300);//������ ũ��
		setVisible(true);
	}
}
public class JC7013230E1 {
	public static void main(String[] args) {
			new SwingProgram();
	}
}