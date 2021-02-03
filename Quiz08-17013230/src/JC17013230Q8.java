import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class InsertCombo extends JFrame
{
 	JTextField jt = new JTextField(10); //�Է� â�� ���� ������ 10�� �ؽ�Ʈ �ʵ�
    JComboBox<String> jcb = new JComboBox<String>(); //�޺��ڽ� ����
    JPanel jp = new JPanel(); //�г� ����
    InsertCombo()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� ������ ����
        
        jt.addKeyListener(new ComboKeyListener()); //Ű������ Ű�� ������ ȣ��
        
        jp.add(jt); //jt �׸���
        jp.add(jcb); //jcb �׸���
        
        add(jp); //�г� �׸���
        
        setSize(300, 200);
        setVisible(true);
        jt.requestFocus(); //Ű �̺�Ʈ�� ���� ������Ʈ�� ������ ����
    }
    
    class ComboKeyListener implements KeyListener
    {
    	@Override
        public void keyPressed(KeyEvent e) //Ű���带 ������ 
        {
            if(KeyEvent.VK_ENTER == e.getKeyCode()) //getkeycode()�� �ƽ�Ű�ڵ�� ��ȯ VK_DOWN(�����)�� ��ġ�ϸ� ����ȣ��
            {
            	//���Ͱ� �ԷµǸ� jt�� �Էµ� ���ڸ� �޺��ڽ��� �߰�
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