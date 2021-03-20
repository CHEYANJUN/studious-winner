import java.util.Scanner;

public class Yuan {
	private static Scanner s;
	public static void main(String args[]){
	double p =3.14;
	double r;
	System.out.println("请输入圆的半径（单位为厘米）：");
	s = new Scanner(System.in);
	r = Double.parseDouble(s.next());
	System.out.println("圆的面积："+p*r*r+"平方厘米");
	System.out.println("圆的周长："+2*p*r+"厘米");
	}	
	}