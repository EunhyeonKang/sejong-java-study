import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class InsertCombo extends JFrame
{
 	JTextField jt = new JTextField(10); //입력 창의 열의 개수가 10인 텍스트 필드
    JComboBox<String> jcb = new JComboBox<String>(); //콤보박스 생성
    JPanel jp = new JPanel(); //패널 생성
    InsertCombo()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //스윙 프레임 종료
        
        jt.addKeyListener(new ComboKeyListener()); //키보드의 키를 누르면 호출
        
        jp.add(jt); //jt 그리기
        jp.add(jcb); //jcb 그리기
        
        add(jp); //패널 그리기
        
        setSize(300, 200);
        setVisible(true);
        jt.requestFocus(); //키 이벤트를 받을 컴포넌트를 강제로 설정
    }
    
    class ComboKeyListener implements KeyListener
    {
    	@Override
        public void keyPressed(KeyEvent e) //키보드를 누를때 
        {
            if(KeyEvent.VK_ENTER == e.getKeyCode()) //getkeycode()로 아스키코드로 변환 VK_DOWN(상수값)과 일치하면 앤터호출
            {
            	//앤터가 입력되면 jt에 입력된 문자를 콤보박스에 추가
            	jcb.addItem(jt.getText());
                jt.setText("");
            }
        }
    	@Override
        public void keyReleased(KeyEvent e){	
    	}
    	@Override
        public void keyTyped(KeyEvent e) {
    	}
    }
}

public class JC17013230Q8
{
	public static void main(String[] args)
    {	
       new InsertCombo();
    }
}