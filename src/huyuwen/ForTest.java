package huyuwen;

import java.util.jar.Attributes.Name;

public class ForTest {
	
	public static void main(String[] args) {
		zhengfangxin();
	}

	// ��������
	public static int name() {
		return 1;
	}

	// ��������
	public static void Sanguoxing() {
		for (int i = 5; i>=1; i--) {
			for (int m = 1; m <= 5 - i; m++)
				System.out.print(" ");
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
	}
	//ˮ�ɻ���
	public static void shuixianhua() {
		int a=1;
		 int b=0;
		 int c=0;
		 for(int i=100;i<999;i++)
		 {
		 a=i/100;
		 b=i/10%10;
		 c=i%10;
		 if(i==(a*a*a+b*b*b+c*c*c))
		 System.out.println(i);
		 }
	}
      //1��100ż����
	  public static void oushu() {
		  for(int i=1;i<=100;i++){
			  if(i%2==0)
				  System.out.println(i);
		  }
		
	}
	  //1��100����
	  public static void jishu(){
		  for(int i=1;i<=100;i++){
			  if (i%2==1)
			  System.out.println("����:"+i);
		  }
	  }
	  
	  //����������
	  public static void zhengfangxin(){ 
		  for(int i=0;i<4;i++){
			  for(int j=0;j<5;j++){
				  if(i==0||i==3)
					  System.out.print("*");
				  else {
					if(j==0||j==9)
						System.out.print("*");
					else{
						System.out.print(" ");
					}
					
						
				}
				}
               System.out.println();
		  }
		  
	  }
	  
}			 
				 
				 
			 
		 
		
			
		
