public class JC17013230Q0201 {
	public static void main(String[] args) {
		System.out.println("17013230 강은현");
		int intArray[][] = new int[4][]; // 각 행의 레퍼런스 배열 생성
		intArray[0] = new int[5]; // 첫째 행의 정수 5개의 배열 생성
		intArray[1] = new int[4]; // 둘째 행의 정수 4개의 배열 생성
		intArray[2] = new int[3]; // 셋째 행의 정수 3개의 배열 생성
		intArray[3] = new int[2]; // 넷째 행의 정수 2개의 배열 생성

		int sum=0;
		for (int i=0; i<intArray.length; i++) // 행에 대한 반복
			for (int j=0; j<intArray[i].length; j++) // 열에 대한 반복
				intArray[i][j] = (int)(Math.random() * 100 + 1);
		
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
				sum+=intArray[i][j];
			}
			System.out.println( "=> Sum of this row = "+sum ); // 다음 줄로 넘어가기
			sum=0;
		}
	}
}
