//using objects as parameters

package practicce;

class Rectangel{
	int length;
	int width;
	
	Rectangel(int l, int w){
		length = l;
		width = w;
	}
	
	void compareArea(Rectangel r) {
		int area1 = length * width;
		int area2 = r.length * r.width;
		
		if(area1 > area2) {
			System.out.println("current rect has a larger area");
		} else if(area1 < area2) {
			System.out.println("passed rect has a larger area");
		} else {
			System.out.println("both rects have equal area");
		}
	}
}

public class Rectangle_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangel r1 = new Rectangel(10,5);
		Rectangel r2 = new Rectangel(8,6);
		r1.compareArea(r2);
	}

}
