import java.util.Scanner;
public class Pingxingsibianxing {
	private static Scanner s1,s2,s3,xiebian;

	public static void main(String args[]){
	double a,b,c,L,m,area;
	System.out.println("请输入平行四边形的底边（单位为厘米）：");
	s1 = new Scanner(System.in);
	a = Double.parseDouble(s1.next());
	System.out.println("请输入平行四边形的斜边（单位为厘米）：");
	s2 = new Scanner(System.in);
	b = Double.parseDouble(s2.next());
	System.out.println("请输入平行四边形的高（单位为厘米）：");
	s3 = new Scanner(System.in);
	c =Double.parseDouble(s3.next());
	L=2*a+2*b;
	area=a*c/2;
	System.out.println("梯形的周长："+L+"厘米");
	System.out.println("梯形的面积："+area+"平方厘米");
	}
}