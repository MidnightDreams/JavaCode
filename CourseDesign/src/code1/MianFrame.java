package code1;

import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MianFrame extends JFrame{
	
	int k = 0,  i = 0, save = 0;
	//���ļ�������ݣ�����Ϊȫ�֣���������ķ������ã�
	File f = new File("C:\\Users\\breeze\\Desktop\\data.txt");
	String[] str2 = {  "ȫ��","���","ɾ��","�޸�","��ѯ","�˳�" };				//����
	private JButton[] jb = new JButton[str2.length] ;		//��������������ӦGUI�������Ϊnull��������渳ֵ������
	JFrame my_frame = null;
	
	public void mine1(String titile) throws IOException {//�ļ�Ҫ���쳣
		setTitle(titile);					    //���ڱ���		
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
		
		
		setLayout(new GridLayout(4,2));				//���ò��ֹ�����ΪGrid�����������У���������������Զ�����Ϊ��λ����
		
		JLabel jl =new JLabel("��ѡ����Ҫִ�еĹ���:");
		jl.setFont(new Font ("����", Font.BOLD, 17));
		add(jl);
		add(new JLabel(new ImageIcon("C:\\Users\\breeze\\Desktop\\1.jpg")));
		for(k = 0; k<str2.length; k++ ) {             //�Ӱ���
			jb[k] = new JButton(str2[k]); 
			jb[k].setFont(new Font ("����", Font.CENTER_BASELINE, 17));
			add(jb[k]);
		}
			
		jb[0].addActionListener( (e) -> {		//Ϊÿ���������ϼ�����
				my_frame = new MyFrame1(str,save);//��ʾ
				 setVisible(false);
			});
		jb[1].addActionListener( (e) -> {		//Ϊÿ���������ϼ�����
				my_frame = new MyFrame2(str,save);//���
				setVisible(false);
			});
		jb[2].addActionListener( (e) -> {		//Ϊÿ���������ϼ�����
				my_frame = new MyFrame3(str,save);//ɾ��
				setVisible(false);
			});
		jb[3].addActionListener( (e) -> {		//Ϊÿ���������ϼ�����
				my_frame = new MyFrame4(str,save);//�޸�
				setVisible(false);
			});
		jb[4].addActionListener( (e) -> {		//Ϊÿ���������ϼ�����
				my_frame = new MyFrame5(str,save);//��ѯ
				setVisible(false);
			});
		jb[5].addActionListener( (e) -> {		//Ϊÿ���������ϼ�����
				setVisible(false);
			});
	}
	
}
































