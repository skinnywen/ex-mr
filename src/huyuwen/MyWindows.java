package huyuwen;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Set;

import javax.management.ListenerNotFoundException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyWindows {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		  JFrame f=new JFrame("欢迎使用登录系统！");
		  JLabel jl_1=new JLabel("用户名");
          JLabel jl_2=new JLabel("密码");
          final JTextField jtf=new JTextField();
          final JPasswordField jpf=new JPasswordField();
          JButton button_1=new JButton("确定");
          JButton button_2=new JButton("删除");
          JPanel panel=new JPanel();
          panel.setLayout(null);
          jl_1.setBounds(30,50,50,30);
          jl_2.setBounds(30,90,50,30);
          jtf.setBounds(100,50,100,30);
          jpf.setBounds(100,90,100,30);
          button_1.setBounds(110, 130, 80, 30);
          button_2.setBounds(140, 160, 80, 30);
          panel.add(jl_1);
          panel.add(jl_2);
          panel.add(jtf);
          panel.add(jpf);
          panel.add(button_1);
          panel.add(button_2);
          f.add(panel);
          f.setVisible(true);
          f.setSize(300, 250);
          f.setLocation(500,400);
          button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO 自动生成的方法存根
				//删除
				String user =jtf.getText();//用户名
				AdminDao adDao=new AdminDao();//实例化AdminDao方法
				boolean flag= adDao.delItem(user);
				if(flag)
				{
					JOptionPane.showMessageDialog(null,"删除成功","提示",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"删除失败,无该账号","提示",JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
          button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO 自动生成的方法存根
				String user=jtf.getText();//账号
				String password=String.valueOf(jpf.getPassword());
				//连接数据库查询  账号为user参数  并且密码为password参数
				AdminDao adDao=new AdminDao();
				User a=new User();
				a.setName(user);
				a.setPassword(password);
				ArrayList<User> b=adDao.queryAllData(a);
				int sum=b.size();
				
				if(sum>0){
					JOptionPane.showMessageDialog(null,"登录成功","提示",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"登录失败,账号错误","提示",JOptionPane.PLAIN_MESSAGE);
				}
				
					
				//判断是否账号为admin 并且密码为abc.123
				//如果是则提示登录成功
				//否则提示登录失败，用户名或密码错误
				//JOptionPane.showMessageDialog(null,user,"提示",JOptionPane.PLAIN_MESSAGE);
			}
		});
		AdminDao adDao=new AdminDao();//实例化AdminDao
		User a=new User();//实例化User
//		
//		a.setName("everyone");//Name为everyone
//		a.setPassword("123");//password为123
//		ArrayList<User> b=adDao.queryAllData(a);//调用方法查询条件 为User中的属性
//		int sum=b.size();//集合结果中的行数      
	}

}
