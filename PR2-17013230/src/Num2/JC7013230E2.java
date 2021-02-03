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
		System.out.println("17013230 ������");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("����:1, ����:2, ��κ���:3, ����:4 �� �������ּ���");
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
		System.out.println("---������ �����Ͽ����ϴ�---");
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
		System.out.println("---������ �����Ͽ����ϴ�---");
		System.out.println("[���� �� ���� ����]");
		Scanner scanner = new Scanner(System.in);
		Vector<Shape> vect = new Vector<Shape>();
		int location = scanner.nextInt();
		if((vect.size()<=location) || (vect.size()==0) ) System.out.println("---������ �� �����ϴ�---");
		else vect.remove(location);
	}
	
	private static void exit_close() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---���Ḧ �����Ͽ����ϴ�---");
		scanner.close();
	}

	private static void totalview_draw() {
		System.out.println("---��κ��⸦ �����Ͽ����ϴ�---");
		Vector<Shape> vect = new Vector<Shape>();
		for(int i=0;i<vect.size();i++) {
			vect.get(i).draw();
		}
	}
}
