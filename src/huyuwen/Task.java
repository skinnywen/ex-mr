package huyuwen;
import java.awt.List;
import java.util.ArrayList;

public class Task{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<Flower> flowers=new ArrayList<Flower>();
		Flower f1=new Flower();
		f1.name="水仙花";f1.price=15.0;
		Flower f2=new Flower();
		f2.name="玫瑰花";f2.price=20.0;
		Flower f3=new Flower();
		f3.name="康乃馨";f3.price=18.5;
		flowers.add(f1);flowers.add(f2);flowers.add(f3);
		for (Flower flower : flowers) {
			System.out.println(flower.name+"(价格￥"+flower.price+")");


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