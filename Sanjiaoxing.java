
import java.util.Scanner;

public class Sanjiaoxing {
	private static Scanner s1,s2,s3;

	public static void main(String args[]){
	double a,b,c,L,m,area;
	System.out.println("请输入三角形的第一条边的边长（单位为厘米）：");
	s1 = new Scanner(System.in);
	a = Double.parseDouble(s1.next());
	System.out.println("请输入三角形的第二条边的边长（单位为厘米）：");
	s2 = new Scanner(System.in);
	b = Double.parseDouble(s2.next());
	System.out.println("请输入三角形的第三条边的边长（单位为厘米）：");
	s3 = new Scanner(System.in);
	c =Double.parseDouble(s3.next());
	L=a+b+c;//计算周长
	m = (a+b+c)/2;                      //计算半周长
	area=(Math.sqrt(m*(m-a)*(m-b)*(m-c)));
	System.out.println("三角形的周长："+L+"厘米");
	System.out.println("三角形的面积："+area+"平方厘米");
	}
}