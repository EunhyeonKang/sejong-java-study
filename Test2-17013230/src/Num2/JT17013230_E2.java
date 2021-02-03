package Num2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JT17013230_E2 extends JFrame {
   JLabel lb;
   private class TimeRunnable implements Runnable {
      private JLabel timerLabel; // 타이머 값이 출력되는 레이블

      public TimeRunnable(JLabel timerLabel) {
         this.timerLabel = timerLabel; // 타이머 카운트를 출력할 레이블
      }
      // 스레드 코드. run()이 종료하면 스레드 종료
      @Override
      public void run() {
         int n = 0; // 타이머 카운트 값
         while (true) { // 무한 루프
            timerLabel.setText(Integer.toString(n)); // 레이블에 카운트 값 출력
            n++;
            try {
               Thread.sleep(1000); // 1초 동안 잠을 잔다.
            } catch (InterruptedException e) {
               return; // 예외가 발생하면 스레드 종료
            }
         }
      }
   }

   public JT17013230_E2() {
      setTitle("Thread를 상속받은 타이머 스레드 예제");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel pn = new JPanel();
      JPanel pn1 = new JPanel();
      setLayout(new GridLayout(2,1,12,12)); //2x1그리드 분할, 수평,수직간격
      Container c = getContentPane();

      // 타이머 값을 출력할 레이블 생성
      JLabel timerLabel = new JLabel();
      c.add(pn); //라벨패널
      c.add(pn1); // 타이머패널

      lb = new JLabel("hello");
      lb.setSize(50, 20); // 레이블의 크기 50x20 설정
      lb.setLocation (30, 30); //위치지정 
      pn.add(lb); // 레이블 컴포넌트 삽입
      pn.setLayout(null); //패널이 갖고있는 특성을 없애고
      pn.addMouseListener(new lbMouseAdapter());

      timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
      pn1.add(timerLabel); // 레이블을 컨텐트팬에 부착
   
      setSize(300, 300);
      setVisible(true);

  
      Thread th = new Thread(new TimeRunnable(timerLabel));
      th.start(); // 타이머 스레드의 실행을 시작하게 한다.
   }
   private class lbMouseAdapter extends MouseAdapter {
      public void mousePressed(MouseEvent e) {//마우스 버튼 누를 때마다 호출
         int x = e.getX();
         int y = e.getY();
         lb.setLocation(x, y);
      }
   }
   public static void main(String[] args) {
      System.out.println("17013230/강은현");
      new JT17013230_E2();
   }
}