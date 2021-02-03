import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Point {
	private int x,y;
	public Point (int x,int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
}
	public int sum() {
		return x+y;
	}
}
public class JC17013230Q06 {
	public static void main(String[] args) { 
		System.out.println("17013230 강은현");
		Map<Integer,Point> PointMap = new HashMap<Integer,Point>();//HashMap생성
		Point pointA = new Point(-10,-10);
		PointMap.put(pointA.sum(), pointA);
		
		Point pointB = new Point(10,10);
		PointMap.put(pointB.sum(), pointB);
		
		Point pointC = new Point(20,20);
		PointMap.put(pointC.sum(), pointC);
		
		Point pointD = new Point(30,30);
		PointMap.put(pointD.sum(), pointD);
		
		//Iterator<Integer> map = ((Set<Integer>) PointMap).iterator();
		//System.out.println(map.next());

		Iterator<Integer> map = PointMap.keySet().iterator();
		while(map.hasNext()) {
			Integer key = map.next();
			Point value = PointMap.get(key);
			//System.out.println("Key = "+key + ", value = " + value);
			System.out.println("key : "+key.toString()+ ", value :" + value.toString());
		}


		
//		System.out.println("key출력 >>>"+PointMap.keySet());
//		System.out.println(PointMap);
	}

	
}

