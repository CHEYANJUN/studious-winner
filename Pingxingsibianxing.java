import java.util.Scanner;
public class Pingxingsibianxing {
	private static Scanner s1,s2,s3,xiebian;

	public static void main(String args[]){
	double a,b,c,L,m,area;
	System.out.println("������ƽ���ı��εĵױߣ���λΪ���ף���");
	s1 = new Scanner(System.in);
	a = Double.parseDouble(s1.next());
	System.out.println("������ƽ���ı��ε�б�ߣ���λΪ���ף���");
	s2 = new Scanner(System.in);
	b = Double.parseDouble(s2.next());
	System.out.println("������ƽ���ı��εĸߣ���λΪ���ף���");
	s3 = new Scanner(System.in);
	c =Double.parseDouble(s3.next());
	L=2*a+2*b;
	area=a*c/2;
	System.out.println("���ε��ܳ���"+L+"����");
	System.out.println("���ε������"+area+"ƽ������");
	}
}