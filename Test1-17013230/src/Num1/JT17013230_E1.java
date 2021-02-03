package Num1;
class PrintShop{
	private char c1;
	private int n1;
	public PrintShop() {
		this.n1=5;
	}
	public PrintShop(char c) {
		this.c1=c;
		this.n1=5;
	}
	public PrintShop(char c,int a) {
		this.c1=c;
		this.n1=a;
	}
	public void print() {
		for(int i=0;i<n1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public void print(int a) {
		if(a%2==0)printReverse(a);
		else {
			printAsc(a);
		}
	}
	public void printAsc(int a) {
		for(int i=0;i<n1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(c1);
			}
			System.out.println();
		}
		a--;
		if(a<=0) {}
		else printReverse(a);
	}
	public void printReverse(int a) {
		for(int i=n1;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(c1);
			}
			System.out.println();
		}
		a--;
		if(a<=0) {}
		else print(a);
	}	
}
public class JT17013230_E1 {
	public static void main(String[] args) {
		System.out.println("17013230 °­ÀºÇö");
		PrintShop ps1 = new PrintShop();
		PrintShop ps2 = new PrintShop('@');
		PrintShop ps3 = new PrintShop('$',10);
		
		ps1.print();
		ps2.print(3);
		ps3.printReverse(2);
	}
}
