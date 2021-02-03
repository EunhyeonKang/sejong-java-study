package Num2;
class Point{
	private int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	 public String toString() {
	    return color + "색의 {" + getX() + "," + getY() + ")의 점";
	}
}
public class JS17013230_E2 {
	public static void main(String[] args) {
		System.out.println("17013230 강은현");
		ColorPoint p1 = new ColorPoint(0, 0, "");
        p1.setXY(0, 0);
        p1.setColor("Black");
        String str1 = p1.toString();
        System.out.println(str1 + "입니다.");
        
        ColorPoint p2 = new ColorPoint(0, 0, "");
        p2.setXY(5, 5);
        p2.setColor("Red");
        String str2 = p2.toString();
        System.out.println(str2 + "입니다.");
	}
}
