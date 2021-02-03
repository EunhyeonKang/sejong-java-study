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
		Vector<Point> v = new Vector<Point>(); // Point 객체를 요소로 다루는 벡터 생성 
		Vector<Integer> v1 = new Vector<Integer>(); // Point 객체를 요소로 다루는 벡터 생성 

		// 3 개의 Point 객체 삽입 
	
		
		v1.add((int) Math.sqrt((3*3)+(4*4))); // 5 삽입
		v1.add((int) Math.sqrt((-5*-5)+(10*10))); // 4 삽입
		v1.add((int) Math.sqrt((30*30)+(-7*-7))); // -1 삽입
	
//		System.out.println(Math.sqrt((3*3)+(4*4)));
//		System.out.println(Math.sqrt((-5*-5)+(10*10)));
//		System.out.println(Math.sqrt((30*30)+(-7*-7)));
//		
		v.add(new Point(3, 4));
		v.add(new Point(-5, 10));
		v.add(new Point(30, -7));

		
	
		
		// 벡터에 있는 Point 객체 모두 검색하여 출력
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); // 벡터의 i 번째 Point 객체 얻어내기
			System.out.println("점:"+p+", 거리:"); // p.toString()을 이용하여 객체 p 출력
		}
		Iterator<Integer> it = v1.iterator();  // Iterator 객체 얻기
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
	}
}