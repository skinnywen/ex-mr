package huyuwen;
import java.awt.List;
import java.util.ArrayList;

public class Task{

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList<Flower> flowers=new ArrayList<Flower>();
		Flower f1=new Flower();
		f1.name="ˮ�ɻ�";f1.price=15.0;
		Flower f2=new Flower();
		f2.name="õ�廨";f2.price=20.0;
		Flower f3=new Flower();
		f3.name="����ܰ";f3.price=18.5;
		flowers.add(f1);flowers.add(f2);flowers.add(f3);
		for (Flower flower : flowers) {
			System.out.println(flower.name+"(�۸�"+flower.price+")");


	}

}
}

class Flower
{
	public String name;
	public double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}