import java.util.Scanner;

public class Tixing {
	private static Scanner s1,s2,s3,xiebian;

	public static void main(String args[]){
	double length,width,height,L,m,area;
	System.out.println("请输入梯形的上底（单位为厘米）：");
	s1 = new Scanner(System.in);
	length = Double.parseDouble(s1.next());
	System.out.println("请输入梯形的下底（单位为厘米）：");
	s2 = new Scanner(System.in);
	width = Double.parseDouble(s2.next());
	System.out.println("请输入梯形的高（单位为厘米）：");
	s3 = new Scanner(System.in);
	height =Double.parseDouble(s3.next());
	double xiebian = Math.sqrt(Math.pow((width-length)/2, 2) + Math.pow(height, 2));
	L=2*xiebian+length+width;
	area=(length+width)*height/2;
	System.out.println("梯形的周长："+L+"厘米");
	System.out.println("梯形的面积："+area+"平方厘米");
	}
}