import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class JC17013230Q07 extends JFrame {
	JPanel cp = new JPanel();
	JC17013230Q07() {
		setTitle("17013230 강은현");
		setLayout(new FlowLayout());//컨텐트팬의 flowlayout 배치관리자로설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //스윙 프레임 종료
		setContentPane(cp);//배치관리자 활용
		cp.setBackground(Color.GREEN); //컨텐트팬 백그라운드 색상
		//마우스 모션 리스너 삽입
		cp.addMouseMotionListener(new MouseDrag_1());//드래그 했을 때 호출
		cp.addMouseListener(new MouseDrag_2());//드래그 하고 뗐을 때

		//프레임 보이기
		setSize(300,300);
		setVisible(true);
	}
	//마우스 드래그추적이 가능한 추상 어댑터 클래스 사용
	class MouseDrag_1 extends MouseMotionAdapter{
		//드래그 했을 때 노란색으로 유지
	    public void mouseDragged(MouseEvent e) {cp.setBackground(Color.YELLOW);}
	}
	//마우스 릴르스출입을 추적할 수 있는 추상 어댑터 클래스 사용
	class MouseDrag_2 extends MouseAdapter{
		//드래그 하고 뗐을 때 초록색으로 유지
	    public void mouseReleased(MouseEvent e) { cp.setBackground(Color.GREEN);}
	}
	public static void main(String[] args) {
		System.out.println("17013230 강은현");
		new JC17013230Q07();
	}
	
}
