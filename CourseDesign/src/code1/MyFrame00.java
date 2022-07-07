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
//	String[] str1 = {"用户名","密码"};		//标签
////	String[] str2 = {"登录"};				//按键
//	JCheckBox agreeField = new JCheckBox("同意用户协议");	//复选框
////	JComboBox<String> goods = new JComboBox<> ();//下拉列表(泛型)<>里面的类型可改
//	final int NUM = str1.length + 3;			//常量
//	private JButton[] b = new JButton[2] ;		//（按键）创建相应GUI组件，设为null，方便后面赋值与引用
//	private JButton nextButton = new JButton("登录");
//	private JLabel[] l = new JLabel[NUM];		//（标签）
//	private JTextField[] t = new JTextField[NUM];//（单行文本框）
//	
//	public myFrame2(String titile) {
//		super (titile);					//窗口标题
//		
//		JPanel root = new JPanel();
//		this.setContentPane(root);	//设置一个容器
////		setLayout(new GridLayout(8,8));				//设置布局管理器为Grid（自设行与列），如果不够，会自动以行为单位扩充
//		
//
//		
//		for(int i = 0; i<str1.length; i++ ) {             
//			l[i] = new JLabel(str1[i] , JLabel.CENTER);//赋值( JLabel.LEFT标文本居中对齐，左对齐，右对齐同理)
////			l[i].setForeground(new Color(255, 0, 255) );		//设置字体的前景色（Color里面是RGB色表，具体值可以百度,也可用系统制定好的）
////			JLabel col0rLabel = new colorLab(str1[i], Color.gray);//设置标签背景色(多态写法)
////			l[i] = col0rLabel;
//			
//			
//			t[i] = new JTextField(15);					//设为空（20表示为长度为20个英文字母的长度）
//			
//			root.add(l[i]);						//本次窗口标签与单行文本框是对应的，故同时add
//			root.add(t[i]);
//		}
//		
////			for(int i = 0; i<str2.length; i++ ) {		//加按键
////			b[i] = new JButton(str2[i]); 	
////			root.add(b[i]);
//////			b[i].setBounds(6, 0, 100, 50);			//无布局管理器设置位置（x,y）宽高（0.0）
////		}
//			
////		
////		root.add( goods );
////		goods.addItem("火龙果");	//添加一个数据项
////		goods.addItem("荔枝");
////		goods.addItem("香蕉");
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
//		//界面初始化
//		agreeField.setSelected( false );			//显示未勾选
//		nextButton.setEnabled( false );		//将按键设成不可用
//		
//		agreeField.addActionListener( (e) -> {	//让用户进行勾选
//			checkBox();
//		});
//		
//		
////		b[0].addActionListener( (e) -> {		//Lambda表达式为匿名内部类的简化，运行时会还原成匿名内部类
//////			System.out.println("**按键备案");
////			showTime();
////			
////		} );
//		
//		
//	}
////***********  方法（取得电脑当前时间）  *************	
//	public void showTime(int i)
//	{
//		//取得电脑当前时间
////		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
////		String timeStr = sdf.format(new Date());
////		
//		//设置显示
////		l[i].setText( timeStr );
//		Scanner sc =new Scanner("C:\\Users\\Administrator\\Desktop\\miam.txt");
//		mima = sc.nextLine();
//		user = sc.nextLine();
//		//登录用户名与密码进行比较
//		if(mima.compareTo(t[i].getText()) == 0)
//		{
//			System.out.println("right");
//		}
//		
//		
//		
//	}
////***********  方法（复选框）  *************
//	public void checkBox()	//复选框
//	{
//		if( agreeField.isSelected() )		//判断复选框是否已被选中
//			nextButton.setEnabled( true );//按键功能恢复
//		else
//			nextButton.setEnabled( false );
//	}
////***********  方法（下拉列表）  *************
////	public void combloBox()	//
////	{
////			int index = goods.getSelectedIndex();    //获取被选中对象的下标
////			System.out.println(index);
////	}
////***********  类（标签文字/标签背景色）  *************
//	public static class colorLab extends JLabel{			//标签文字/标签背景色（静态内部类（相当于外部类））
//		
//		public colorLab(String titile,Color bgColor) {
//			this.setText(titile);
//			this.setFont(new Font ("楷体", Font.BOLD, 20));	//Font表字体（字体，选择粗体或其他，字体大小）
//			
//			this.setOpaque(true);			//设置背景色前需把label默认透明效果关闭
//			this.setBackground(bgColor);			//设置背景色
//			this.setPreferredSize(new Dimension(200,30));		//设置框的大小
//			this.setHorizontalAlignment(SwingConstants.CENTER);//设置文字对齐方式
//		}
//	}  
//	
//}
