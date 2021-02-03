package Num1;
import java.util.Iterator;
import java.util.Vector;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y; 
	}
	public String toString() {
		return "(" + x + "," + y + ")"; 
	}
}

public class JF17013230_E1 {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>(); // Point ��ü�� ��ҷ� �ٷ�� ���� ���� 
		Vector<Integer> v1 = new Vector<Integer>(); // Point ��ü�� ��ҷ� �ٷ�� ���� ���� 

		// 3 ���� Point ��ü ���� 
	
		
		v1.add((int) Math.sqrt((3*3)+(4*4))); // 5 ����
		v1.add((int) Math.sqrt((-5*-5)+(10*10))); // 4 ����
		v1.add((int) Math.sqrt((30*30)+(-7*-7))); // -1 ����
	
//		System.out.println(Math.sqrt((3*3)+(4*4)));
//		System.out.println(Math.sqrt((-5*-5)+(10*10)));
//		System.out.println(Math.sqrt((30*30)+(-7*-7)));
//		
		v.add(new Point(3, 4));
		v.add(new Point(-5, 10));
		v.add(new Point(30, -7));

		
	
		
		// ���Ϳ� �ִ� Point ��ü ��� �˻��Ͽ� ���
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); // ������ i ��° Point ��ü ����
			System.out.println("��:"+p+", �Ÿ�:"); // p.toString()�� �̿��Ͽ� ��ü p ���
		}
		Iterator<Integer> it = v1.iterator();  // Iterator ��ü ���
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
	}
}