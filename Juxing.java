
import java.util.Scanner;

public class Juxing {
	private static Scanner s1,s2,s3;

	public static void main(String args[]){
	double a,b,c,L,area;
	System.out.println("请输入矩形的长（单位为厘米）：");
	s1 = new Scanner(System.in);
	a = Double.parseDouble(s1.next());
	System.out.println("请输入矩形的宽（单位为厘米）：");
	s2 = new Scanner(System.in);
	b = Double.parseDouble(s2.next());
	L=2*a+2*b;//计算周长
	area=a*b;
	System.out.println("矩形的周长："+L+"厘米");
	System.out.println("矩形的面积："+area+"平方厘米");
	}
}