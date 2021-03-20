import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		System.out.println("\t\t********************************");
		System.out.println("\t\t**请选择图形  **");
		System.out.println("\t\t** 1.圆形 2.三角形 3.矩形**");
		System.out.println("\t\t**4.梯形 5.平行四边形 **");
		System.out.println("\t\t********************************");
		System.out.println();
		Scanner in=new Scanner(System.in);
		int flag=in.nextInt();
		switch(flag){
		case 1: Yuan yuan=new Yuan();  //圆形
yuan.main(null);
                                            break;
		case 2:Sanjiaoxing sanjiaoxing=new Sanjiaoxing();  //三角形
sanjiaoxing.main(null);
                                           break;
		case 3:Juxing juxing=new Juxing();  //矩形
juxing.main(null);
		           break;
		case 4:Tixing tixing=new Tixing();  //梯形
tixing.main(null);
		case 5:Pingxingsibianxing pingxingsibianxing = new Pingxingsibianxing(); //平行四边形
pingxingsibianxing.main(null);
		default : System.out.println("输入错误，请重新运行程序");
                                              System.exit(0);
		}		
	}
}