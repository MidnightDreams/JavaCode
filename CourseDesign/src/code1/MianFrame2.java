package code1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MianFrame2 extends JFrame{
	
	int k = 0,  i = 0, save = 0;
	//���ļ�������ݣ�����Ϊȫ�֣���������ķ������ã�
	File f = new File("C:\\Users\\breeze\\Desktop\\data.txt");
	String[] str2 = {  "ȫ��","�˳�" };				//����
	private JButton[] jb = new JButton[str2.length] ;		//��������������ӦGUI�������Ϊnull��������渳ֵ������
	
	public MianFrame2(String titile) throws IOException {//�ļ�Ҫ���쳣
		setTitle(titile);					    //���ڱ���
		setSize(300,200);
		setLocation(430,160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ô��ڵ�Ĭ�Ϲرղ�����Exit..��ʾ����Ӧ�ó���ֹͣ��
		Scanner sc = new Scanner(f);
		while( sc.hasNextLine() )//�����ļ�ĩβ
		{	
			sc.nextLine();
			i++;	
			save = i;										//��¼��Ʒ��������������
		}
		sc.close();
		i=0;
		System.out.println(save);
		String[] str = new String[save+1];//�ǵü���1��ʹ��Ӻ󲻻����
		Scanner sc1 = new Scanner(f); 
		while( sc1.hasNextLine() )//�����ļ�ĩβ
		{	
			str[i] = sc1.nextLine();					//��һ���ַ��������� �ո� �� �س�����Tap��   �Ͽ�
			i++;	
			
		}
		sc1.close();
		
		
		setLayout(new GridLayout(4,1));				//���ò��ֹ�����ΪGrid�����������У���������������Զ�����Ϊ��λ����
		
		JLabel jl =new JLabel("��ͨ��Ա�����Բ鿴��Ϣ:");
		jl.setFont(new Font ("����", Font.BOLD, 17));
		add(jl);
		for(k = 0; k<str2.length; k++ ) {             //�Ӱ���
			jb[k] = new JButton(str2[k]); 
			jb[k].setFont(new Font ("����", Font.CENTER_BASELINE, 17));
			add(jb[k]);
		}
			
		jb[0].addActionListener( (e) -> {		//Ϊÿ���������ϼ�����
				dispose();
				 searchAll(str,save);//��ʾ
			});
		jb[1].addActionListener( (e) -> {		//Ϊÿ���������ϼ�����
				setVisible(false);
			});
	}
	
	private void searchAll(String[] str , int save) {
		JFrame search = new JFrame();
		search.setSize(500,900);
		search.setLocation(430,0);
		search.setLayout(new GridLayout(30,1));				//���ò��ֹ�����ΪGrid�����������У���������������Զ�����Ϊ��λ����
		search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		search.setVisible(true);
		
		JTextField[] t = new JTextField[save];
		JTextField t2= new JTextField("��Ʒ����\t��Ʒ���\t��������\t����\t���۽��");//��������Ϣ
		search.add(t2);
		t2.setBackground(Color.lightGray);
		for(i = 0; i<save; i++) {
			
			t[i] = new JTextField();//���ı���	
			search.add(t[i]);
			t[i].setText(str[i]);
				
		}
		
		jb[0] = new JButton("�˳�");
		
		search.add(jb[0]);
		
		jb[0].addActionListener( (e) ->{
			search.setVisible(false);
		});
		
	}
	
}

