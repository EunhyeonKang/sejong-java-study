public class JC17013230PR0101 {
	public static void main(String[] args) {
		System.out.println("17013230 강은현");
		int RandomArray[][] ={ //배열 인덱스 0으로 초기화
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}};
	
		int cnt=0;
		int i,j;
		//i번째,j번째 인덱스 랜덤
		for(cnt=0; cnt<10;) { 
			i = (int) Math.round(Math.random() * 3); //0~2.5를 반올림
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
