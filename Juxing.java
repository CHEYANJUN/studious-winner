
import java.util.Scanner;

public class Juxing {
	private static Scanner s1,s2,s3;

	public static void main(String args[]){
	double a,b,c,L,area;
	System.out.println("��������εĳ�����λΪ���ף���");
	s1 = new Scanner(System.in);
	a = Double.parseDouble(s1.next());
	System.out.println("��������εĿ���λΪ���ף���");
	s2 = new Scanner(System.in);
	b = Double.parseDouble(s2.next());
	L=2*a+2*b;//�����ܳ�
	area=a*b;
	System.out.println("���ε��ܳ���"+L+"����");
	System.out.println("���ε������"+area+"ƽ������");
	}
}