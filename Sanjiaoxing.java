
import java.util.Scanner;

public class Sanjiaoxing {
	private static Scanner s1,s2,s3;

	public static void main(String args[]){
	double a,b,c,L,m,area;
	System.out.println("�����������εĵ�һ���ߵı߳�����λΪ���ף���");
	s1 = new Scanner(System.in);
	a = Double.parseDouble(s1.next());
	System.out.println("�����������εĵڶ����ߵı߳�����λΪ���ף���");
	s2 = new Scanner(System.in);
	b = Double.parseDouble(s2.next());
	System.out.println("�����������εĵ������ߵı߳�����λΪ���ף���");
	s3 = new Scanner(System.in);
	c =Double.parseDouble(s3.next());
	L=a+b+c;//�����ܳ�
	m = (a+b+c)/2;                      //������ܳ�
	area=(Math.sqrt(m*(m-a)*(m-b)*(m-c)));
	System.out.println("�����ε��ܳ���"+L+"����");
	System.out.println("�����ε������"+area+"ƽ������");
	}
}