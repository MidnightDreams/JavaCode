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
	public class MyFrame3 extends JFrame{
		int i = 0,data = -1;
		final int U = 10;					//��Ҫ�İ���������
		//���ļ�������ݣ�����Ϊȫ�֣���������ķ������ã�
		File f = new File("C:\\Users\\breeze\\Desktop\\data.txt");
		private JButton[] b = new JButton[U] ;		//��������������ӦGUI�������Ϊnull��������渳ֵ������
		private JLabel show_reult = new JLabel();//�������ı���

		public MyFrame3(String[] str , int save)  {
			setTitle("����ɾ��");
			setSize(500,560);
			setLocation(430,160);
			setLayout(new GridLayout(10,2));				//���ò��ֹ�����ΪGrid�����������У���������������Զ�����Ϊ��λ����
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			JLabel  label = new JLabel("������Ҫɾ���Ķ���");
			JTextField text = new JTextField(20);
			add(label);
			add(text);
			
			b[1] = new JButton("ȷ��");
			add(b[1]);
			
			JTextField t2= new JTextField("��Ʒ����\t��Ʒ���\t��������\t����\t���۽��");//������Ӧ����Ϣ
			add(t2);
			JTextField jt = new JTextField();				//��һ����д��
			add( jt);
			
			add(show_reult);//�������
			
			b[1].addActionListener((e)->{
				
				for(i = 0;i<save;i++) {
					if( str[i].startsWith( text.getText() ) ) //������
					{					
						jt.setText(str[i]);
						data = i;
						break;
					}	
				}
				
				if(data == i){
					String str0 = new String(str[0]+"\n");//��������ͳһΪһ��
					for( i = 1; i<save; i++) {
						if(i != data) {
							str0 += (str[i]+"\n");
						}
					}
					try {
						
						FileWriter fw = new FileWriter(f);
						fw.append(str0);
						fw.close();
						show_reult.setText("ɾ���ɹ���");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else
					show_reult.setText("�޴���Ʒ");
			});
				
			
			b[0] = new JButton("����");
			add(b[0]);
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
