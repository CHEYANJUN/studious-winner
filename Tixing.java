import java.util.Scanner;

public class Tixing {
	private static Scanner s1,s2,s3,xiebian;

	public static void main(String args[]){
	double length,width,height,L,m,area;
	System.out.println("���������ε��ϵף���λΪ���ף���");
	s1 = new Scanner(System.in);
	length = Double.parseDouble(s1.next());
	System.out.println("���������ε��µף���λΪ���ף���");
	s2 = new Scanner(System.in);
	width = Double.parseDouble(s2.next());
	System.out.println("���������εĸߣ���λΪ���ף���");
	s3 = new Scanner(System.in);
	height =Double.parseDouble(s3.next());
	double xiebian = Math.sqrt(Math.pow((width-length)/2, 2) + Math.pow(height, 2));
	L=2*xiebian+length+width;
	area=(length+width)*height/2;
	System.out.println("���ε��ܳ���"+L+"����");
	System.out.println("���ε������"+area+"ƽ������");
	}
}