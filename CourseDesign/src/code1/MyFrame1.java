package code1;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame1 extends JFrame{
	
	int i= 0;
	final int U = 10;					//��ť����
	private JButton[] b = new JButton[U] ;		//��������������ӦGUI�������Ϊnull��������渳ֵ������
	

	public MyFrame1(String[] str , int save)  {
		 JTextField[] jt = new JTextField[save];//�������ı���
		setTitle("�鿴");
		setSize(500,900);
		setLocation(430,0);
		setLayout(new GridLayout(30,1));				//���ò��ֹ�����ΪGrid�����������У���������������Զ�����Ϊ��λ����
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JTextField jt1= new JTextField("��Ʒ����\t��Ʒ���\t��������\t����\t���۽��");//��������Ϣ
		add(jt1);
		jt1.setBackground(Color.lightGray);
		for(i = 0; i<save; i++) {
			
				jt[i] = new JTextField();//���ı���	
				add(jt[i]);
				jt[i].setText(str[i]);
				
		}
		
		b[0] = new JButton("����");
		
		add(b[0]);
		
		b[0].addActionListener( (e) ->{
			setVisible(false);
			
			try {
				Test.newWindows();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		
		
	}
}











