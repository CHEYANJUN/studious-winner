import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		System.out.println("\t\t********************************");
		System.out.println("\t\t**��ѡ��ͼ��  **");
		System.out.println("\t\t** 1.Բ�� 2.������ 3.����**");
		System.out.println("\t\t**4.���� 5.ƽ���ı��� **");
		System.out.println("\t\t********************************");
		System.out.println();
		Scanner in=new Scanner(System.in);
		int flag=in.nextInt();
		switch(flag){
		case 1: Yuan yuan=new Yuan();  //Բ��
yuan.main(null);
                                            break;
		case 2:Sanjiaoxing sanjiaoxing=new Sanjiaoxing();  //������
sanjiaoxing.main(null);
                                           break;
		case 3:Juxing juxing=new Juxing();  //����
juxing.main(null);
		           break;
		case 4:Tixing tixing=new Tixing();  //����
tixing.main(null);
		case 5:Pingxingsibianxing pingxingsibianxing = new Pingxingsibianxing(); //ƽ���ı���
pingxingsibianxing.main(null);
		default : System.out.println("����������������г���");
                                              System.exit(0);
		}		
	}
}