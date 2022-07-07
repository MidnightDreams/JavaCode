package code1;

import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")//һ����ע����ע�⣬�����Ǹ�������һ��ָ��������Ա���ע�Ĵ���Ԫ���ڲ���ĳЩ���汣�־�Ĭ����������Щ������Ϣ
public class LogIn extends JFrame{
        String[] buttonStr = {"ȷ��ע��","�˳�"};
        String[]  labelStr= {"���������˺�","������������","������������"};
        String[]  comboBoxStr= {"��ͨ��Ա","����Ա"};
        JButton[] jb = new JButton[buttonStr.length];
        JLabel[] jl = new JLabel[labelStr.length];
        JTextField[] jt =new  JTextField[labelStr.length];
        JComboBox<String> department = new JComboBox<> ();      //�����б�(����)<>��������Ϳɸ�
        int hight = 26, legth = 130, x=20,y=20;                                 //����λ�õı���
        public LogIn(String titile) {
            setTitle(titile);                              //���ڱ���   
            setSize(300,257);
            setLocation(500, 60);
            setLayout(null);                         //�޲��ֹ����� 
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ùر��¼�
            
            
            for(int i=0; i<labelStr.length; i++) {                                   //�ӱ�ǩ�뵥���ı���
                  jl[i] = new JLabel(labelStr[i]);
                  jt[i] = new JTextField();
                  add(jl[i]);
                  add(jt[i]);
                  jl[i].setBounds(x, y,legth,hight);
                  x += 110;
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
                department.setFont(new Font ("����", Font.BOLD, 17));
                add( department );
                department.addItem(comboBoxStr[i]);
                department.setBounds(x, y,legth,hight);
            }
            y += 30;                                                   //����һ���ˣ�y+
            x = 20;                                                     //xҲҪ�����
            
            for(int i=0; i<buttonStr.length; i++) {             //�Ӱ���
                 jb[i] = new JButton(buttonStr[i]);
                 jb[i].setFont(new Font ("����", Font.BOLD, 16));
                 add(jb[i]);

                 jb[i].setBounds(x, y,legth-20,hight+1);          //����Ҫ̫������һ��
                 x += 120;                                                              //�¸�����д��һ�У�x+
             }
            //����ʾ����ı�ǩ
            JLabel show_result = new JLabel();
            add(show_result);
            x=20;
            show_result.setBounds(x, y+30,legth-20,hight+1);
            //�ӱ���ͼ���������ӣ�������ס�����������ǩ��
            JLabel photoLabel = new JLabel(new ImageIcon("C:\\Users\\breeze\\Desktop\\1.jpg"));//���ô��ڱ���������ͼƬ��
            photoLabel.setSize(290,300);                           //��ǩ��С������дͼƬ���ز��������ǩ��С���仯��
            add(photoLabel);      
            
            //������
            jb[0].addActionListener((e)->{
        	    String[] line = new String[labelStr.length];		//*����ֻ��Ҫ��ע������Ϣ
        	    for(int i=0; i<labelStr.length; i++) { 			       //���Ͽ�֪M=labelStr.length         
        		    line[i] = jt[i].getText();
        	    }
        	    try {
			saveFile(line,labelStr.length);					//����
			show_result.setText("�ɹ���");
        	    } catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
        	    }
            });
             jb[1].addActionListener((e)->{
        	     dispose();
             });
            
            
        }
        
        private void saveFile(String[] line, int save) throws IOException {
        	 // д��txt�ļ�  
        	File fw = new File("C:\\Users\\breeze\\Desktop\\mima.txt");
        	BufferedWriter out = new BufferedWriter(new FileWriter(fw));  
                for(int i = 0; i<save;i++) {
                	 out.write(line[i]+"\n"); // \n��Ϊ����  
                }
                out.close(); // ���ǵùر��ļ�  
                
        } 
        
}








