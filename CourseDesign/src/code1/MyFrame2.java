package code1;

import java.awt.GridLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame2 extends JFrame{
	int i = 0;
	final int U = 10;					//��Ҫ�İ���������
	//���ļ�������ݣ�����Ϊȫ�֣���������ķ������ã�
	File f = new File("C:\\Users\\breeze\\Desktop\\data.txt");
	private JButton[] b = new JButton[U] ;		//��������������ӦGUI�������Ϊnull��������渳ֵ������
	private JLabel show_reult = new JLabel();//�������ı���
	
	public MyFrame2(String[] str , int save)  {
		setTitle("�������");
		setSize(500,560);
		setLocation(430,160);
		setLayout(new GridLayout(10,20));				//���ò��ֹ�����ΪGrid�����������У���������������Զ�����Ϊ��λ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JTextField jt = new JTextField();				//��һ����д��
		add( jt);
		
		b[1] = new JButton("ȷ��");
		add(b[1]);
		b[0] = new JButton("����");
		add(b[0]);
		
		add(show_reult);//�������
		
		b[1].addActionListener((e)->{
			
			String str0 = new String(str[0]+"\n");//��������ͳһΪһ��
			for(i = 1;i<save;i++) {
				str0 += (str[i]+"\n");
			}
			str0 += jt.getText();//ȡ��д�������(д�����)
			
			try {
				FileWriter fw = new FileWriter(f);
				fw.append(str0);
				fw.close();
				show_reult.setText("��ӳɹ�");
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		

		b[0].addActionListener( (e) ->{
			setVisible(false);
			try {
				Test.newWindows();
			} 
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	}
}
