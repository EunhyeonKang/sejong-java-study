package Num2;
import java.awt.Color;
import java.awt.Container;
import java.awt.Window;
import javax.swing.*;
import java.awt.event.*;
class mouse_program extends JFrame{
	private JLabel C_la= new JLabel("C"); //���ڿ� "C" ���̺� ����
	public mouse_program(){
		setTitle("17013230 ������");
		JPanel C_p = new JPanel(); //�г� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(C_p);
		C_p.setBackground(Color.GREEN);//�г� ��׶������
		
		C_p.setLayout(null); //��ġ������ ����
		C_la.setLocation(100, 100); //���̺� �ʱⰪ 
		C_la.setSize(10,10); //���̺� ũ��
		//����� ���
		C_la.addMouseListener(new MouseAdapter() {
			//"C" Ŭ��
			public void mouseClicked(MouseEvent e) {
				//���̺� ������ ��ġ 
				int r_x = (int)(Math.random()*300);
				int r_y = (int)(Math.random()*300);
				
				C_la.setLocation(r_x, r_y);
			}
		});
		
		C_p.add(C_la);//���̺� ���
		
		setSize(500, 500);//������ ũ��
		setVisible(true);
	}
}
public class JC7013230E2{
	public static void main(String[] args) {
			new mouse_program();
	}
}
