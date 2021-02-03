package Num1;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Vector;
import javax.swing.*;

public class JC17013230E1 extends JFrame {

	private JLabel imageLabels = new JLabel();
	private Vector<ImageIcon> imageIcons = new Vector<ImageIcon>();

	private RPanels rPanels = new RPanels();
	
	// ���� �г�
	class RPanels extends JPanel {

		// ���� ��ư ����
		private JRadioButton RadioRight = new JRadioButton("Right");
		private JRadioButton RadioLeft = new JRadioButton("Left");
		
		public boolean Leftselect() {
			return RadioLeft.isSelected();
		}

		public RPanels() {
			// �׷쿡 ������ư �߰�
			ButtonGroup group = new ButtonGroup();
			group.add(RadioLeft);
			add(RadioLeft);//�гο� �߰�
			
			group.add(RadioRight);
			add(RadioRight);//�гο� �߰�
			// leftRadio��ư���� ���� Ȱ��ȭ
			RadioLeft.setSelected(true);
		}
	}

	public JC17013230E1() {
		setTitle("17013230 ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10, 10));

		// images ���͸� �ȿ� �̹��� ����
		File file = new File("images");
		File[] files = file.listFiles();
		// path �ȿ� �ִ� ��ü ���ϸ� �˾Ƴ���
		for (int fi=0;fi<files.length;fi++) {
			// ������ ���
			ImageIcon Icon = new ImageIcon(files[fi].getPath());
			imageIcons.add(Icon);	
		}
		
		imageLabels.setIcon(imageIcons.get(0)); // �ε��� 0�� �̹���
		imageLabels.addMouseListener(new MouseSelectListener(0)); // 0�� �̹������� ����
		
		c.add(rPanels, BorderLayout.NORTH); // ���� �г� NORTH �� ��ġ
		c.add(imageLabels, BorderLayout.CENTER); // �̹��� �г� CENTER �� ��ġ

		setSize(400, 400);
		setVisible(true);
	}

	class MouseSelectListener extends MouseAdapter {
		private int i;
		public MouseSelectListener(int j) {i = j;}
		// ���콺 Ŭ���� ��
		@Override
		public void mouseReleased(MouseEvent e) {
			// �������� �ѱ��
			if (rPanels.Leftselect()) {
				i++;
				i=i%imageIcons.size();
				imageLabels.setIcon(imageIcons.get(i));//���� �ε� �̹��� index
			}
			// ���������� �ѱ��
			else if(!(rPanels.Leftselect())){
				i--;
				if (i < 0) {i=imageIcons.size()-1;}
				imageLabels.setIcon(imageIcons.get(i)); //������ �ε� �̹��� index
			}
		}
	}

	
	public static void main(String[] args) {
		System.out.println("17013230/������");
		new JC17013230E1();
	}
}