import java.util.Scanner;

class PhoneBook { // �迭 a�� ���鹮�ڸ� ','�� ����
	String name, tel;
}
public class JC17013230PR0102 {
	public static void main(String args[]) {
		System.out.println("17013230 ������");
		int n=0;
		Scanner num= new Scanner(System.in); //�ο��� �Է�	
		System.out.print("�ο���>>");
		n=num.nextInt();
		
		PhoneBook [] user = new PhoneBook[n];
	
		Scanner Number= new Scanner(System.in);
		for(int i = 0 ; i < user.length ; i++) {
			user[i] = new PhoneBook();
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			user[i].name = Number.next();
			//System.out.println(user[i].name);
			user[i].tel = Number.next();
			//System.out.println(user[i].tel);
		
		}
		int cnt=0;
		System.out.println("����Ǿ����ϴ�...");
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String name2 = Number.next();
			
			if (name2.equalsIgnoreCase("�׸�")) {
		           
                break;
            }
			
			for(int i=0;i<user.length;i++) {
				//System.out.println(name2+" "+user[i].name);
				if(name2.equals(user[i].name)) {
					System.out.println(name2+"�� ��ȣ�� "+user[i].tel+" ���̴�.");
					
				}
				else if(!name2.equals(user[i].name)){
					//System.out.println(name2+" �� �����ϴ�.");
					cnt++;
				}
						
			}
			if(cnt==user.length) {
				System.out.println(name2+" �� �����ϴ�.");
			}
			
		}
	
		//num.close();
	}
}

//import java.util.Scanner;
//
//class Book {
//	String title, author;
//	public Book(String title, String author) { // ������
//		this.title = title;
//		this.author = author;
//	}
//}
//
//public class BookArray {
//	public static void main(String[] args) {
//		Book [] book = new Book[2]; // Book �迭 ����
//		
//		Scanner scanner = new Scanner(System.in);
//		for(int i=0; i<book.length; i++) { // book.length = 2
//			System.out.print("����>>");
//			String title = scanner.nextLine();
//			System.out.print("����>>");
//			String author = scanner.nextLine();
//			book[i] = new Book(title, author); // �迭 ���� ��ü ����
//		}
//		
//		for(int i=0; i<book.length; i++)
//			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
//
//		scanner.close();
//	}
//}