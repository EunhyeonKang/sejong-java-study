public class JC17013230PR0101 {
	public static void main(String[] args) {
		System.out.println("17013230 ������");
		int RandomArray[][] ={ //�迭 �ε��� 0���� �ʱ�ȭ
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}};
	
		int cnt=0;
		int i,j;
		//i��°,j��° �ε��� ����
		for(cnt=0; cnt<10;) { 
			i = (int) Math.round(Math.random() * 3); //0~2.5�� �ݿø�
			j = (int) Math.round(Math.random() * 3);
			if(RandomArray[i][j] == 0) {
				RandomArray[i][j] = (int) Math.round(Math.random() * 9+1);
				cnt++;
			}
		}
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++)
				System.out.printf("%d ", RandomArray[i][j]," ");
			System.out.println();
		}
	}
}
