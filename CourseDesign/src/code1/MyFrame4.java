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
public class MyFrame4 extends JFrame{
	int i = 0,data = -1;
	final int U = 10;					//��Ҫ�İ���������
	//���ļ�������ݣ�����Ϊȫ�֣���������ķ������ã�
	File f = new File("C:\\Users\\breeze\\Desktop\\data.txt");
	private JButton[] b = new JButton[U] ;		//��������������ӦGUI�������Ϊnull��������渳ֵ������
	private JLabel show_reult = new JLabel();//�������ı���

	public MyFrame4(String[] str , int save)  {
		setTitle("�޸�");
		setSize(500,560);
		setLocation(430,160);
		setLayout(new GridLayout(10,2));				//���ò��ֹ�����ΪGrid�����������У���������������Զ�����Ϊ��λ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JLabel  label = new JLabel("��������Ҫ�޸ĵĶ���");
		JTextField text = new JTextField(20);//����
		add(label);
		add(text);                                           //��һ����д��
		
		b[1] = new JButton("ȷ��");
		add(b[1]);
		
		
		JTextField t2= new JTextField();  //������Ӧ����Ϣ
		add(t2);
		JTextField jt = new JTextField(20);				//��һ����д��
		add( jt);
		
		add(show_reult);                                              //�������
		b[1].addActionListener((e)->{

			for(i = 0;i<save;i++) {
				if( str[i].startsWith( text.getText() ) ) //������
				{
				    t2.setText("��Ʒ����\t��Ʒ���\t��������\t����\t���۽��");
					jt.setText(str[i]);
					data = i; 
					show_reult.setText("�ҵ��ˣ�");
					break;
				}	
			}
			if( data != i) {
			    show_reult.setText("�޴���Ʒ");
			}
		});
			
		b[2] = new JButton("ȷ���޸�");
		add(b[2]);
		b[2].addActionListener((e1)->{
			
			
				str[data] = jt.getText();
				String str0 = new String(str[0]+"\n");//��������ͳһΪһ��
				for( i = 1; i<save; i++) {
					
						str0 += (str[i]+"\n");
					
				}
				try {
					
					FileWriter fw = new FileWriter(f);
					fw.append(str0);
					fw.close();
					show_reult.setText("�޸ĳɹ�!");
				} catch (IOException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
			

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
