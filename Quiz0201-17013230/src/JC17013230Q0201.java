public class JC17013230Q0201 {
	public static void main(String[] args) {
		System.out.println("17013230 ������");
		int intArray[][] = new int[4][]; // �� ���� ���۷��� �迭 ����
		intArray[0] = new int[5]; // ù° ���� ���� 5���� �迭 ����
		intArray[1] = new int[4]; // ��° ���� ���� 4���� �迭 ����
		intArray[2] = new int[3]; // ��° ���� ���� 3���� �迭 ����
		intArray[3] = new int[2]; // ��° ���� ���� 2���� �迭 ����

		int sum=0;
		for (int i=0; i<intArray.length; i++) // �࿡ ���� �ݺ�
			for (int j=0; j<intArray[i].length; j++) // ���� ���� �ݺ�
				intArray[i][j] = (int)(Math.random() * 100 + 1);
		
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" ");
				sum+=intArray[i][j];
			}
			System.out.println( "=> Sum of this row = "+sum ); // ���� �ٷ� �Ѿ��
			sum=0;
		}
	}
}
