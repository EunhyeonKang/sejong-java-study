package Num2;
import java.util.*;

abstract class Shape {
	protected abstract void draw();
}

class Line extends Shape {
	@Override
	protected void draw() {}
}
class Rect extends Shape {
	@Override
	public void draw() {}
}
class Circle extends Shape {
	@Override
	public void draw() {}
}
public class JC7013230E2 {
	public static void main(String[] args) {
		System.out.println("17013230 강은현");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("삽입:1, 삭제:2, 모두보기:3, 종료:4 중 선택해주세요");
			int n = scanner.nextInt();
			switch(n) {
			case 1:
				insert_num();
				break;
			case 2:
				delete_location();
				break;
			case 3:
				totalview_draw();
				break;
			case 4:
				exit_close();	
				return;
			}
		}
	}

	private static void insert_num() {
		Scanner scanner = new Scanner(System.in);
		Vector<Shape> vect = new Vector<Shape>();
		Shape graph = null;
		System.out.println("---삽입을 선택하였습니다---");
		System.out.println("[Line:1,Rect:2,Circle:3]");
		
		int num_in = scanner.nextInt();

		while(true) {
			if(num_in==1) {
				graph = new Line();
				break;
			}
			else if(num_in==2) {
				graph = new Rect();
				break;
			}
			else if(num_in==3) {
				graph = new Circle();
				break;
			}
			break;
		}
		vect.add(graph);
	}

	private static void delete_location() {
		System.out.println("---삭제을 선택하였습니다---");
		System.out.println("[삭제 할 도형 선택]");
		Scanner scanner = new Scanner(System.in);
		Vector<Shape> vect = new Vector<Shape>();
		int location = scanner.nextInt();
		if((vect.size()<=location) || (vect.size()==0) ) System.out.println("---삭제할 수 없습니다---");
		else vect.remove(location);
	}
	
	private static void exit_close() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---종료를 선택하였습니다---");
		scanner.close();
	}

	private static void totalview_draw() {
		System.out.println("---모두보기를 선택하였습니다---");
		Vector<Shape> vect = new Vector<Shape>();
		for(int i=0;i<vect.size();i++) {
			vect.get(i).draw();
		}
	}
}
