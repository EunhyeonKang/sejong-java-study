import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class JC17013230Q07 extends JFrame {
	JPanel cp = new JPanel();
	JC17013230Q07() {
		setTitle("17013230 ������");
		setLayout(new FlowLayout());//����Ʈ���� flowlayout ��ġ�����ڷμ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� ������ ����
		setContentPane(cp);//��ġ������ Ȱ��
		cp.setBackground(Color.GREEN); //����Ʈ�� ��׶��� ����
		//���콺 ��� ������ ����
		cp.addMouseMotionListener(new MouseDrag_1());//�巡�� ���� �� ȣ��
		cp.addMouseListener(new MouseDrag_2());//�巡�� �ϰ� ���� ��

		//������ ���̱�
		setSize(300,300);
		setVisible(true);
	}
	//���콺 �巡�������� ������ �߻� ����� Ŭ���� ���
	class MouseDrag_1 extends MouseMotionAdapter{
		//�巡�� ���� �� ��������� ����
	    public void mouseDragged(MouseEvent e) {cp.setBackground(Color.YELLOW);}
	}
	//���콺 ������������ ������ �� �ִ� �߻� ����� Ŭ���� ���
	class MouseDrag_2 extends MouseAdapter{
		//�巡�� �ϰ� ���� �� �ʷϻ����� ����
	    public void mouseReleased(MouseEvent e) { cp.setBackground(Color.GREEN);}
	}
	public static void main(String[] args) {
		System.out.println("17013230 ������");
		new JC17013230Q07();
	}
	
}
