import java.util.Scanner;

public class Yuan {
	private static Scanner s;
	public static void main(String args[]){
	double p =3.14;
	double r;
	System.out.println("������Բ�İ뾶����λΪ���ף���");
	s = new Scanner(System.in);
	r = Double.parseDouble(s.next());
	System.out.println("Բ�������"+p*r*r+"ƽ������");
	System.out.println("Բ���ܳ���"+2*p*r+"����");
	}	
	}