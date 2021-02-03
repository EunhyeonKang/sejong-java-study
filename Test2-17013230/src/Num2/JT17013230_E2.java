package Num2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JT17013230_E2 extends JFrame {
   JLabel lb;
   private class TimeRunnable implements Runnable {
      private JLabel timerLabel; // Ÿ�̸� ���� ��µǴ� ���̺�

      public TimeRunnable(JLabel timerLabel) {
         this.timerLabel = timerLabel; // Ÿ�̸� ī��Ʈ�� ����� ���̺�
      }
      // ������ �ڵ�. run()�� �����ϸ� ������ ����
      @Override
      public void run() {
         int n = 0; // Ÿ�̸� ī��Ʈ ��
         while (true) { // ���� ����
            timerLabel.setText(Integer.toString(n)); // ���̺� ī��Ʈ �� ���
            n++;
            try {
               Thread.sleep(1000); // 1�� ���� ���� �ܴ�.
            } catch (InterruptedException e) {
               return; // ���ܰ� �߻��ϸ� ������ ����
            }
         }
      }
   }

   public JT17013230_E2() {
      setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel pn = new JPanel();
      JPanel pn1 = new JPanel();
      setLayout(new GridLayout(2,1,12,12)); //2x1�׸��� ����, ����,��������
      Container c = getContentPane();

      // Ÿ�̸� ���� ����� ���̺� ����
      JLabel timerLabel = new JLabel();
      c.add(pn); //���г�
      c.add(pn1); // Ÿ�̸��г�

      lb = new JLabel("hello");
      lb.setSize(50, 20); // ���̺��� ũ�� 50x20 ����
      lb.setLocation (30, 30); //��ġ���� 
      pn.add(lb); // ���̺� ������Ʈ ����
      pn.setLayout(null); //�г��� �����ִ� Ư���� ���ְ�
      pn.addMouseListener(new lbMouseAdapter());

      timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
      pn1.add(timerLabel); // ���̺��� ����Ʈ�ҿ� ����
   
      setSize(300, 300);
      setVisible(true);

  
      Thread th = new Thread(new TimeRunnable(timerLabel));
      th.start(); // Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.
   }
   private class lbMouseAdapter extends MouseAdapter {
      public void mousePressed(MouseEvent e) {//���콺 ��ư ���� ������ ȣ��
         int x = e.getX();
         int y = e.getY();
         lb.setLocation(x, y);
      }
   }
   public static void main(String[] args) {
      System.out.println("17013230/������");
      new JT17013230_E2();
   }
}