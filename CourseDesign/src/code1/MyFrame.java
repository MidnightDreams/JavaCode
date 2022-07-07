package code1;

import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class MyFrame extends JFrame {
		File f1 = new File("C:\\Users\\breeze\\Desktop\\mima.txt");
		String[] buttonStr = {"ע��","��¼"};
	        String[]  labelStr= {"�������˺�","����������","����������"};
	        String[]  comboBoxStr= {"��ͨ��Ա","����Ա"};
	        final int N = buttonStr.length ,M = labelStr.length;                  //ʹ�޸ĺ����Եõ���ͬ�����İ���
	        private JButton[] jb = new JButton[N];
	        private JLabel[] jl = new JLabel[M];
	        private JTextField[] jt =new  JTextField[M];
	        JComboBox<String> member = new JComboBox<> ();      //�����б�(����)<>��������Ϳɸ�
	        private JCheckBox agreeField = new JCheckBox("ͬ���û�Э��");	//��ѡ��
	        public MyFrame(String titile) {
	            setTitle(titile);                              //���ڱ���   
	            setSize(290,240);			    //����λ�����С
	            setLocation(500, 60);
	            setLayout(null);                         //�޲��ֹ����� 
	            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ùر��¼�
	            
	            int hight = 26, legth = 130, x=20,y=20;                                 //����λ�õı���
	            for(int i=0; i<labelStr.length; i++) {                                   //�ӱ�ǩ�뵥���ı���
	                  jl[i] = new JLabel(labelStr[i]);
	                  jt[i] = new JTextField();
	                  add(jl[i]);
	                  add(jt[i]);
	                  jl[i].setBounds(x, y,legth,hight);
	                  x += 100;
	                  jt[i].setBounds(x, y,legth,hight);
	                  y += 30;
	                  jl[i].setFont(new Font ("����", Font.BOLD, 17));
	                  x = 20;                                                                  //��Ҫ����
	            }
	            
	            JLabel newLabel = new JLabel("��ѡ�����");//�½���ǩ���ڽ��������б�
	           newLabel.setFont(new Font ("����", Font.BOLD, 17)); 
	           add(newLabel);
	            newLabel.setBounds(x, y,legth,hight);
	            x += 100;                                                                  //�¸�����д��һ�У�x+
	            
	            for(int i=0; i<comboBoxStr.length; i++) {       //�������б�
	                member.setFont(new Font ("����", Font.BOLD, 17));
	                add( member );
	                member.addItem(comboBoxStr[i]);
	                member.setBounds(x, y,legth,hight);
	            }
	            y += 30;                                                   //����һ���ˣ�y+
	            x = 20;                                                     //xҲҪ�����
	            
	            for(int i=0; i<buttonStr.length; i++) {             //�Ӱ���
	                 jb[i] = new JButton(buttonStr[i]);
	                 jb[i].setFont(new Font ("����", Font.BOLD, 17));
	                 add(jb[i]);
	                 jb[i].setEnabled( false );		//��������ɲ�����
	                 jb[i].setBounds(x, y,legth-23,hight);          //����Ҫ̫������һ��
	                 x +=122;                                                            //�¸�����д��һ�У�x+
	             }
	          //�����ʼ��
	            x=20;
	            add(agreeField);
	            agreeField.setBounds(x, y+30,legth,hight);          //����Ҫ̫������һ��
	            agreeField.setSelected( false );			//��ʾδ��ѡ
	            agreeField.setContentAreaFilled(false);	//������Ϊ͸��
	            agreeField.addActionListener( (e) -> {	//���û����й�ѡ
	        	    for(int i=0; i<buttonStr.length; i++) {           
	        		    checkBox(i);
	        	    }
				
			});
			
	            //�ӱ���ͼ���������ӣ�������ס�����������ǩ��
	            JLabel photoLabel = new JLabel(new ImageIcon("C:\\Users\\breeze\\Desktop\\1.jpg"));//���ô��ڱ���������ͼƬ��
	            photoLabel.setSize(290,300);                           //��ǩ��С������дͼƬ���ز��������ǩ��С���仯��
	            add(photoLabel);
	            //���������������֣�
	            jb[0].addActionListener((e)->{				   
	        	    setVisible(false);					   //�ص��ɴ���
	        	    JFrame logIn = new LogIn("ע�����");//����0��������LogIn����ʵ��ע��������ʾ
	        	    logIn.setVisible(true);				    //��ʾ�´���
	            });
	             jb[1].addActionListener((e)->{			   
	        	    try {
				if( rightOrNot(0,1,2) ) {
					JOptionPane.showMessageDialog(null,"��¼�ɹ�");
					setVisible(false);
					if(member.getSelectedIndex() == 1)			   //�����б��ѡ��
						Test.newWindows();						   //��ʾʵ�ٴ���
					else 
					{
						JFrame labframe = new MianFrame2("��Ա����");
						labframe.setVisible(true);
					}
						
				}
				else
					JOptionPane.showMessageDialog(null,"����");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	            });
	        
		
		
	}
//***********  �������Ա����ݣ�  *************	
public boolean rightOrNot(int x, int y,int z) throws IOException 
	{
       	String mima, user,name; 
		Scanner sc =new Scanner(f1);
                user = sc.nextLine();	
                mima = sc.nextLine();
                name = sc.nextLine();
		System.out.print(jt[x].getText()+jt[y].getText() +jt[z].getText());
		sc.close();
		//��¼�û�����������бȽ�
		if( (mima.compareTo(jt[x].getText()) == 0) && (user.compareTo(jt[y].getText() ) == 0) 
			&& (name.compareTo(jt[z].getText()) == 0))
		{
			return true;
		}
		return false;
		
	}
//***********  ��������ѡ��  *************
	public void checkBox(int i)	//��ѡ��
	{
		if( agreeField.isSelected() )	{	//�жϸ�ѡ���Ƿ��ѱ�ѡ��
			jb[i].setEnabled( true );//�������ָܻ�
			}
		else
			jb[i].setEnabled( false );
	}
	
}
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
