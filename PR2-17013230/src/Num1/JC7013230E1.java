package Num1;
import java.util.*;
class Location{
	public String cityname;
	int info_1;
	int info_2;
	public String get_cityname() {
		return cityname;
	}
	public int get_info_1() {
		return info_1;
	}
	public int get_info_2() {
		return info_2;
	}
}


public class JC7013230E1 {
	public static void main(String[] args) {
		System.out.println("17013230 강은현");
		int i=0;
		Location[] location = new Location[4];
		int size = location.length;
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Location> place = new HashMap<String, Location>();
		System.out.println("도시이름, 위도, 경도 순으로 입력하세요!");
		for(i=0;i<size;i++) {
			location[i] = new Location();
			location[i].cityname = scanner.next();
			location[i].info_1 = scanner.nextInt();
			location[i].info_2 = scanner.nextInt();
			place.put(location[i].cityname, location[i]);
		}

		for(i=0;;i++) {
			System.out.println("도시이름을 검색하세요!");
			String a = scanner.next();
			Location save = place.get(a);
			if(a.equals("종료"))break;
			if(save==null) {
				System.out.println(a +"라는 검색결과는 없습니다.");
			}
			else {
				System.out.println(save.get_cityname()+","+save.get_info_1()+","+save.get_info_2());
			}
		}
		scanner.close();
	}
}
/*
 * 서울 37 126 LA 34 -118 파리 2 48 시드니 151 -33
 */