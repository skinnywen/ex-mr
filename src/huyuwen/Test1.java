package huyuwen;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Test1 {
	public static void main(String[] args) {
		Test05();
	}
	 
		public static void Yu(){
		//����
		for(int i=0;i<5;i++)
		{
			System.out.println("ѭ������1");
			System.out.println("ѭ������1.1");
		}
		System.out.println("����ѭ������");

	}
	
	public static void test()
	{
		for (int ln = 0; ln < 5; ln++) { // �������
			for (int space = 5; space > ln; space--) { // ��һ��ǰ������ո񣬵ڶ���ǰ���ĸ������ѭ��ִ������ȥ��һ��ѭ��
				System.out.print(" "); // print ȥ��ln ͬ�����
			}
			for (int row = 0; row <= ln; row++) { // �ڲ�����
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" ");
			}
			System.out.println("*");

		}
		
	}
	
	// ����ż��
	public static void one() {
		System.out.print("������һ��������");
		int num = new Scanner(System.in).nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "��һ��ż����");
			int a;
		} else {
			System.out.println(num + "��һ��������");
		}
	}

	// ֱ��������
	public static void zhijiao() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void three() {
		String[] a = new String[3];
		a[0] = "a";
		a[1] = "b";
		a[2] = "c";
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static void zheng() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5) {
					System.out.print("* ");
				} else {
					if (j == 1 || j == 5) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void xing() {
		for (int i = 0; i < 4; i++) {
			// kongge
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			//
			for (int j = 6; j > 0; j--) {
				if (i == 3 || i == 0) {
					System.out.print("* ");
				} else {
					if (j == 6 || j == 1) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();

		}
	}

	public static void Cheng() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				if (j <= i) {
					int a = j * i;
					System.out.print(j + "*" + i + "=" + a + "\t");
				} else {

				}
			}
			System.out.println("");
		}

	}

	public static void shu() {
		int s = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i % 7) != 0) {
				s = s + i;
			}
		}
		System.out.println(s);

} 
    public static void Wen(){
    	for(int i=100;i<1000;i++){
    		int a=1;
    		int b=2;
    		int c=3;
    		if(a*a*a+b*b*b+c*c*c==i){
    			System.out.println(i);
    		
    		}
    		}
    }
    	public static void Phone() {
    		System.out.print("������һλ����:");
    		Scanner scan=new Scanner(System.in);//ʵ���������� 
    		int n=scan.nextInt();//�ӿ���̨��ȡ����
    		int sum=1;//�ӿ���̨��ȡһ������
    		for(int i=1;i<=n;i++){
    			if(i==n)
    				System.out.print(i+"=");
    			else 
					System.out.print(i+"*");
    			sum*=i;
    		}
    		System.out.println(sum);
    		}


  
     public static void Test08(){
    	 System.out.println("�ӷ�����");
    	 Scanner scan=new Scanner(System.in);
    	 System.out.print("�������һλ��:");
    	 int a=scan.nextInt();
    	 System.out.print("������ڶ�λ��:");
    	 int b=scan.nextInt();
    	 Add(a,b);
     }
     public static void Add(int a,int b)
     {
    	 int sum=a+b;
    	 System.out.print(a+"+"+b+"="+sum);
     }
    	 
     

      public static void Test06(){
    	  System.out.println("��������");
    	  Scanner scan=new Scanner(System.in);
    	  System.out.print("�������һλ��:");
    	  int c=scan.nextInt();
    	  System.out.print("������ڶ�λ��:");
    	  int d=scan.nextInt();
    	  jian(c,d);
      }
     public static void jian(int c,int d)
     {
    	 int sum=c-d;
    	 System.out.print(c+"-"+d+"="+sum);
     }

   public static void Test03(){
	   System.out.println("�˷�����");
	   Scanner scan=new Scanner(System.in);
	   System.out.print("�������һλ��");
	   int e=scan.nextInt();
	   System.out.print("������ڶ�λ��");
	   int f=scan.nextInt();
	   cheng(e,f);
   }
   public static void cheng(int e,int f)
   {
	   int sum=e*f;
	   System.out.print(e+"*"+f+"="+sum);
	   
   }
   
   public static void Test05(){
	   System.out.println("��������");
	   Scanner scan=new Scanner(System.in);
	   System.out.print("�������һλ��");
	   int y=scan.nextInt();
	   System.out.print("������ڶ�λ��");
	   int z=scan.nextInt();
	   chu(y,z);
	   }
	   public static void chu(int y,int z){
		   int sum=y/z;
		   System.out.print(y+"/"+z+"="+sum);
	   }
   }
    