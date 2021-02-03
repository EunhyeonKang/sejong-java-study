class JC17013230Q0202 {
	private int x1, x2, y1, y2;
	
	public JC17013230Q0202(int xx1, int yy1, int xx2, int yy2) {
		this.x1 = xx1;
		this.y1 = yy1;
		this.x2 = xx2;
		this.y2 = yy2;
	}

	public JC17013230Q0202() {
		x1 = x2 = y1 = y2 = 0;
	}

	public void show() { // 결과값 출력
		int width, height, area; // 가로, 세로, 넓이
		width = x2 - x1;
		height = y2 - y1;

		if (width < 0) width = -width;
		if (height < 0) height = -height;
		
		area = width * height;

		System.out.printf("x1 = %d, y1 = %d, x2 = %d, y2 = %d\n", x1, y1, x2, y2);
		System.out.println("직사각형의 가로길이 : " + width);
		System.out.println("직사각형의 세로길이 : " + height);
		System.out.println("직사각형의 넓이 : " + area);
	}

	public int square() { // 사각형 넓이 리턴
		int size = (x1-x2) * (y1-y2); // 면적 계산
		if (size <0)
			size = -size; // 면적이 음수인 경우 양수로 만들어 줌
		return size;
	}

	public void set(int xx1, int yy1, int xx2, int yy2) {
		this.x1 = xx1;
		this.y1 = yy1;
		this.x2 = xx2;
		this.y2 = yy2;
	}

	public boolean equals(JC17013230Q0202 r) {
		int width1 = (r.x1>r.x2?(r.x1-r.x2):r.x2-r.x1); // x의 가로 길이
		int width2 = (x1>x2?(x1-x2):(x2-x1)); // this의 가로 길이
		int height1 = (r.y1>r.y2?(r.y1-r.y2):(r.y2-r.y1)); // x의 세로 길이
		int height2 = (y1>y2?(y1-y2):(y2-y1)); // this의 세로 길이
		// r.set과 s객체와 비교 했을 때 두 객체가 같으면
		if (width1 == width2 && height1 == height2)
			return true;
		else return false;
	}

	public static void main(String[] args) {
		System.out.println("17013230 강은현");
		JC17013230Q0202 r = new JC17013230Q0202(); 
		JC17013230Q0202 s = new JC17013230Q0202(1, 1, 2, 3); 

		r.show();
		s.show();
		System.out.println(s.square());
		
		r.set(-2, 2, -1, 4);
		r.show();

		System.out.println(r.square());

		if (r.equals(s))
			System.out.println("두 사각형의 가로와 세로가 같습니다.");
		else System.out.println(" 두 사각형은 가로와 세로가 다릅니다.");

	}

}
