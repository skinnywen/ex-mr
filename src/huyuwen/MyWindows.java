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
		// TODO �Զ����ɵķ������
		  JFrame f=new JFrame("��ӭʹ�õ�¼ϵͳ��");
		  JLabel jl_1=new JLabel("�û���");
          JLabel jl_2=new JLabel("����");
          final JTextField jtf=new JTextField();
          final JPasswordField jpf=new JPasswordField();
          JButton button_1=new JButton("ȷ��");
          JButton button_2=new JButton("ɾ��");
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
				// TODO �Զ����ɵķ������
				//ɾ��
				String user =jtf.getText();//�û���
				AdminDao adDao=new AdminDao();//ʵ����AdminDao����
				boolean flag= adDao.delItem(user);
				if(flag)
				{
					JOptionPane.showMessageDialog(null,"ɾ���ɹ�","��ʾ",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"ɾ��ʧ��,�޸��˺�","��ʾ",JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
          button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO �Զ����ɵķ������
				String user=jtf.getText();//�˺�
				String password=String.valueOf(jpf.getPassword());
				//�������ݿ��ѯ  �˺�Ϊuser����  ��������Ϊpassword����
				AdminDao adDao=new AdminDao();
				User a=new User();
				a.setName(user);
				a.setPassword(password);
				ArrayList<User> b=adDao.queryAllData(a);
				int sum=b.size();
				
				if(sum>0){
					JOptionPane.showMessageDialog(null,"��¼�ɹ�","��ʾ",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"��¼ʧ��,�˺Ŵ���","��ʾ",JOptionPane.PLAIN_MESSAGE);
				}
				
					
				//�ж��Ƿ��˺�Ϊadmin ��������Ϊabc.123
				//���������ʾ��¼�ɹ�
				//������ʾ��¼ʧ�ܣ��û������������
				//JOptionPane.showMessageDialog(null,user,"��ʾ",JOptionPane.PLAIN_MESSAGE);
			}
		});
		AdminDao adDao=new AdminDao();//ʵ����AdminDao
		User a=new User();//ʵ����User
//		
//		a.setName("everyone");//NameΪeveryone
//		a.setPassword("123");//passwordΪ123
//		ArrayList<User> b=adDao.queryAllData(a);//���÷�����ѯ���� ΪUser�е�����
//		int sum=b.size();//���Ͻ���е�����      
	}

}
