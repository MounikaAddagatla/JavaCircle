import java.lang.Math;
class Circle{
	public static void main(String args[]){
		int x1=5, x2=13;
		int y1=3, y2=10;
		int length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))
		System.out.println(length);
		int x1_1=2, x2_1=1;
		int y1_1=3, y2_1=-19;
		int length_1 = Math.sqrt((x2_1-x1_1)*(x2_1-x1_1)+(y2_1-y1_1)*(y2_1-y1_1));
		System.out.println(length_1);
	}
}