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

	public void show() { // ����� ���
		int width, height, area; // ����, ����, ����
		width = x2 - x1;
		height = y2 - y1;

		if (width < 0) width = -width;
		if (height < 0) height = -height;
		
		area = width * height;

		System.out.printf("x1 = %d, y1 = %d, x2 = %d, y2 = %d\n", x1, y1, x2, y2);
		System.out.println("���簢���� ���α��� : " + width);
		System.out.println("���簢���� ���α��� : " + height);
		System.out.println("���簢���� ���� : " + area);
	}

	public int square() { // �簢�� ���� ����
		int size = (x1-x2) * (y1-y2); // ���� ���
		if (size <0)
			size = -size; // ������ ������ ��� ����� ����� ��
		return size;
	}

	public void set(int xx1, int yy1, int xx2, int yy2) {
		this.x1 = xx1;
		this.y1 = yy1;
		this.x2 = xx2;
		this.y2 = yy2;
	}

	public boolean equals(JC17013230Q0202 r) {
		int width1 = (r.x1>r.x2?(r.x1-r.x2):r.x2-r.x1); // x�� ���� ����
		int width2 = (x1>x2?(x1-x2):(x2-x1)); // this�� ���� ����
		int height1 = (r.y1>r.y2?(r.y1-r.y2):(r.y2-r.y1)); // x�� ���� ����
		int height2 = (y1>y2?(y1-y2):(y2-y1)); // this�� ���� ����
		// r.set�� s��ü�� �� ���� �� �� ��ü�� ������
		if (width1 == width2 && height1 == height2)
			return true;
		else return false;
	}

	public static void main(String[] args) {
		System.out.println("17013230 ������");
		JC17013230Q0202 r = new JC17013230Q0202(); 
		JC17013230Q0202 s = new JC17013230Q0202(1, 1, 2, 3); 

		r.show();
		s.show();
		System.out.println(s.square());
		
		r.set(-2, 2, -1, 4);
		r.show();

		System.out.println(r.square());

		if (r.equals(s))
			System.out.println("�� �簢���� ���ο� ���ΰ� �����ϴ�.");
		else System.out.println(" �� �簢���� ���ο� ���ΰ� �ٸ��ϴ�.");

	}

}
