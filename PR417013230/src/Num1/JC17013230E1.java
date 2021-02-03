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
	
	// 라디오 패널
	class RPanels extends JPanel {

		// 라디오 버튼 생성
		private JRadioButton RadioRight = new JRadioButton("Right");
		private JRadioButton RadioLeft = new JRadioButton("Left");
		
		public boolean Leftselect() {
			return RadioLeft.isSelected();
		}

		public RPanels() {
			// 그룹에 라디오버튼 추가
			ButtonGroup group = new ButtonGroup();
			group.add(RadioLeft);
			add(RadioLeft);//패널에 추가
			
			group.add(RadioRight);
			add(RadioRight);//패널에 추가
			// leftRadio버튼부터 선택 활성화
			RadioLeft.setSelected(true);
		}
	}

	public JC17013230E1() {
		setTitle("17013230 강은현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10, 10));

		// images 디렉터리 안에 이미지 생성
		File file = new File("images");
		File[] files = file.listFiles();
		// path 안에 있는 전체 파일명 알아내기
		for (int fi=0;fi<files.length;fi++) {
			// 파일인 경우
			ImageIcon Icon = new ImageIcon(files[fi].getPath());
			imageIcons.add(Icon);	
		}
		
		imageLabels.setIcon(imageIcons.get(0)); // 로딩한 0번 이미지
		imageLabels.addMouseListener(new MouseSelectListener(0)); // 0번 이미지부터 시작
		
		c.add(rPanels, BorderLayout.NORTH); // 라디오 패널 NORTH 에 위치
		c.add(imageLabels, BorderLayout.CENTER); // 이미지 패널 CENTER 에 위치

		setSize(400, 400);
		setVisible(true);
	}

	class MouseSelectListener extends MouseAdapter {
		private int i;
		public MouseSelectListener(int j) {i = j;}
		// 마우스 클릭할 떄
		@Override
		public void mouseReleased(MouseEvent e) {
			// 왼쪽으로 넘기기
			if (rPanels.Leftselect()) {
				i++;
				i=i%imageIcons.size();
				imageLabels.setIcon(imageIcons.get(i));//왼쪽 로딩 이미지 index
			}
			// 오른쪽으로 넘기기
			else if(!(rPanels.Leftselect())){
				i--;
				if (i < 0) {i=imageIcons.size()-1;}
				imageLabels.setIcon(imageIcons.get(i)); //오른쪽 로딩 이미지 index
			}
		}
	}

	
	public static void main(String[] args) {
		System.out.println("17013230/강은현");
		new JC17013230E1();
	}
}