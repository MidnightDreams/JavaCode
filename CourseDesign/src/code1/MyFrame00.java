package code1;
//package code1;
//package code1;
//
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.util.Scanner;
//
//import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import javax.swing.SwingConstants;
//
//public class myFrame2 extends JFrame{
//	String mima = new String();
//	String user = new String();
//	String[] str1 = {"�û���","����"};		//��ǩ
////	String[] str2 = {"��¼"};				//����
//	JCheckBox agreeField = new JCheckBox("ͬ���û�Э��");	//��ѡ��
////	JComboBox<String> goods = new JComboBox<> ();//�����б�(����)<>��������Ϳɸ�
//	final int NUM = str1.length + 3;			//����
//	private JButton[] b = new JButton[2] ;		//��������������ӦGUI�������Ϊnull��������渳ֵ������
//	private JButton nextButton = new JButton("��¼");
//	private JLabel[] l = new JLabel[NUM];		//����ǩ��
//	private JTextField[] t = new JTextField[NUM];//�������ı���
//	
//	public myFrame2(String titile) {
//		super (titile);					//���ڱ���
//		
//		JPanel root = new JPanel();
//		this.setContentPane(root);	//����һ������
////		setLayout(new GridLayout(8,8));				//���ò��ֹ�����ΪGrid�����������У���������������Զ�����Ϊ��λ����
//		
//
//		
//		for(int i = 0; i<str1.length; i++ ) {             
//			l[i] = new JLabel(str1[i] , JLabel.CENTER);//��ֵ( JLabel.LEFT���ı����ж��룬����룬�Ҷ���ͬ��)
////			l[i].setForeground(new Color(255, 0, 255) );		//���������ǰ��ɫ��Color������RGBɫ������ֵ���԰ٶ�,Ҳ����ϵͳ�ƶ��õģ�
////			JLabel col0rLabel = new colorLab(str1[i], Color.gray);//���ñ�ǩ����ɫ(��̬д��)
////			l[i] = col0rLabel;
//			
//			
//			t[i] = new JTextField(15);					//��Ϊ�գ�20��ʾΪ����Ϊ20��Ӣ����ĸ�ĳ��ȣ�
//			
//			root.add(l[i]);						//���δ��ڱ�ǩ�뵥���ı����Ƕ�Ӧ�ģ���ͬʱadd
//			root.add(t[i]);
//		}
//		
////			for(int i = 0; i<str2.length; i++ ) {		//�Ӱ���
////			b[i] = new JButton(str2[i]); 	
////			root.add(b[i]);
//////			b[i].setBounds(6, 0, 100, 50);			//�޲��ֹ���������λ�ã�x,y����ߣ�0.0��
////		}
//			
////		
////		root.add( goods );
////		goods.addItem("������");	//���һ��������
////		goods.addItem("��֦");
////		goods.addItem("�㽶");
////		
////		
////		goods.addActionListener( (e) -> {
////			combloBox();
////		});
//		
//		
//		root.add(agreeField);
//		root.add(nextButton);
//		
//		//�����ʼ��
//		agreeField.setSelected( false );			//��ʾδ��ѡ
//		nextButton.setEnabled( false );		//��������ɲ�����
//		
//		agreeField.addActionListener( (e) -> {	//���û����й�ѡ
//			checkBox();
//		});
//		
//		
////		b[0].addActionListener( (e) -> {		//Lambda���ʽΪ�����ڲ���ļ򻯣�����ʱ�ỹԭ�������ڲ���
//////			System.out.println("**��������");
////			showTime();
////			
////		} );
//		
//		
//	}
////***********  ������ȡ�õ��Ե�ǰʱ�䣩  *************	
//	public void showTime(int i)
//	{
//		//ȡ�õ��Ե�ǰʱ��
////		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
////		String timeStr = sdf.format(new Date());
////		
//		//������ʾ
////		l[i].setText( timeStr );
//		Scanner sc =new Scanner("C:\\Users\\Administrator\\Desktop\\miam.txt");
//		mima = sc.nextLine();
//		user = sc.nextLine();
//		//��¼�û�����������бȽ�
//		if(mima.compareTo(t[i].getText()) == 0)
//		{
//			System.out.println("right");
//		}
//		
//		
//		
//	}
////***********  ��������ѡ��  *************
//	public void checkBox()	//��ѡ��
//	{
//		if( agreeField.isSelected() )		//�жϸ�ѡ���Ƿ��ѱ�ѡ��
//			nextButton.setEnabled( true );//�������ָܻ�
//		else
//			nextButton.setEnabled( false );
//	}
////***********  �����������б�  *************
////	public void combloBox()	//
////	{
////			int index = goods.getSelectedIndex();    //��ȡ��ѡ�ж�����±�
////			System.out.println(index);
////	}
////***********  �ࣨ��ǩ����/��ǩ����ɫ��  *************
//	public static class colorLab extends JLabel{			//��ǩ����/��ǩ����ɫ����̬�ڲ��ࣨ�൱���ⲿ�ࣩ��
//		
//		public colorLab(String titile,Color bgColor) {
//			this.setText(titile);
//			this.setFont(new Font ("����", Font.BOLD, 20));	//Font�����壨���壬ѡ�����������������С��
//			
//			this.setOpaque(true);			//���ñ���ɫǰ���labelĬ��͸��Ч���ر�
//			this.setBackground(bgColor);			//���ñ���ɫ
//			this.setPreferredSize(new Dimension(200,30));		//���ÿ�Ĵ�С
//			this.setHorizontalAlignment(SwingConstants.CENTER);//�������ֶ��뷽ʽ
//		}
//	}  
//	
//}
