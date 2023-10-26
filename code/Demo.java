package 项目版本管理实践;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jiami j=new jiami();
		jiemi jj=new jiemi();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("==================================");
			System.out.println("        欢迎使用密码管理系统"           );
			System.out.println("==================================");
			System.out.println("        请选择操作：                 ");
			System.out.println("1. 加密");
			System.out.println("2. 解密");
			System.out.println("3. 判断密码强度");
			System.out.println("4. 密码生成");
			System.out.println("5. 退出");
			System.out.println("请输入选项序号：");
			switch(sc.nextInt()) {
			case 1:	
			System.out.println("==================================");
			System.out.println("        欢迎使用密码管理系统"           );
			System.out.println("==================================");
			System.out.println("请输入要加密的数字密码：");
			System.out.println("加密后的结果是："+j.rev(sc.next()));
				break;
			case 2:
			System.out.println("请输入要解密的数字密码：");
			System.out.println("解密后的结果是："+jj.reduce(sc.next()));
				break;
			case 3:break;
			case 4:break;
			case 5:break;
			}
		}
	}

}
