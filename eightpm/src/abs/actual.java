package abs;

public class actual extends abs1 implements int1{

	@Override
	public void areaofTriangle() {
		// TODO Auto-generated method stub
		int b=4;
		int h=5;
		int area =  (b*h)/2;
		System.out.println(area);
	}

	@Override
	void areaofCircle() {
		// TODO Auto-generated method stub
		int r = 3;
		float pi = 3.14f;
		float area = pi * r * r;
		System.out.println(area);
	}
	
public static void main(String[] args) {
	actual a = new actual();
	a.areaofTriangle();
	a.areaofCircle();
}
}
