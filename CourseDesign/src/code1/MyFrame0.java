package code1;
//package code1;
//
//import java.awt.GridLayout;
//import java.io.IOException;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
//@SuppressWarnings("serial")
//public class MyFrame1 extends JFrame{
//	int i = 0,data=0;
//	//���ļ�������ݣ�����Ϊȫ�֣���������ķ������ã�
//	private JButton[] b = new JButton[2] ;		//��������������ӦGUI�������Ϊnull��������渳ֵ������
//
//	
//
//	public int Search(String[] str , int save)  {
//		setTitle("����");
//		setSize(500,400 );
//		setLocation(200,200);
//		setLayout(new GridLayout(10,20));				//���ò��ֹ�����ΪGrid�����������У���������������Զ�����Ϊ��λ����
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true);
//		
//		JLabel  label = new JLabel("������");
//		JTextField text = new JTextField();
//		add(label);
//		add(text);
//		
//		b[1] = new JButton("ȷ��");
//		add(b[1]);
//		b[0] = new JButton("����");
//		add(b[0]);
//		
//		
//		b[1].addActionListener((e)->{
//			for(i = 1;i<save+1;i++) {
//				if( str[i].startsWith( text.getText() ) ) 
//				{
//					System.out.println("&");
//					data = i;
//					setVisible(false);
//					
//				}
//			}
//		});
//		
//		b[0].addActionListener( (e) ->{
//			setVisible(false);
//			try {
//				Test.newWindows();
//			} 
//			catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		});
//		
//		return data;
//	}
//}
