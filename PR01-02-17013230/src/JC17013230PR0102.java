import java.util.Scanner;

class PhoneBook { // 배열 a의 공백문자를 ','로 변경
	String name, tel;
}
public class JC17013230PR0102 {
	public static void main(String args[]) {
		System.out.println("17013230 강은현");
		int n=0;
		Scanner num= new Scanner(System.in); //인원수 입력	
		System.out.print("인원수>>");
		n=num.nextInt();
		
		PhoneBook [] user = new PhoneBook[n];
	
		Scanner Number= new Scanner(System.in);
		for(int i = 0 ; i < user.length ; i++) {
			user[i] = new PhoneBook();
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			user[i].name = Number.next();
			//System.out.println(user[i].name);
			user[i].tel = Number.next();
			//System.out.println(user[i].tel);
		
		}
		int cnt=0;
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>>");
			String name2 = Number.next();
			
			if (name2.equalsIgnoreCase("그만")) {
		           
                break;
            }
			
			for(int i=0;i<user.length;i++) {
				//System.out.println(name2+" "+user[i].name);
				if(name2.equals(user[i].name)) {
					System.out.println(name2+"의 번호는 "+user[i].tel+" 입이다.");
					
				}
				else if(!name2.equals(user[i].name)){
					//System.out.println(name2+" 이 없습니다.");
					cnt++;
				}
						
			}
			if(cnt==user.length) {
				System.out.println(name2+" 이 없습니다.");
			}
			
		}
	
		//num.close();
	}
}

//import java.util.Scanner;
//
//class Book {
//	String title, author;
//	public Book(String title, String author) { // 생성자
//		this.title = title;
//		this.author = author;
//	}
//}
//
//public class BookArray {
//	public static void main(String[] args) {
//		Book [] book = new Book[2]; // Book 배열 선언
//		
//		Scanner scanner = new Scanner(System.in);
//		for(int i=0; i<book.length; i++) { // book.length = 2
//			System.out.print("제목>>");
//			String title = scanner.nextLine();
//			System.out.print("저자>>");
//			String author = scanner.nextLine();
//			book[i] = new Book(title, author); // 배열 원소 객체 생성
//		}
//		
//		for(int i=0; i<book.length; i++)
//			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
//
//		scanner.close();
//	}
//}