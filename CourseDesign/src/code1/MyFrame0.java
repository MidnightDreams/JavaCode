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
//	//读文件里的数据（定义为全局，方便下面的方法引用）
//	private JButton[] b = new JButton[2] ;		//（按键）创建相应GUI组件，设为null，方便后面赋值与引用
//
//	
//
//	public int Search(String[] str , int save)  {
//		setTitle("查找");
//		setSize(500,400 );
//		setLocation(200,200);
//		setLayout(new GridLayout(10,20));				//设置布局管理器为Grid（自设行与列），如果不够，会自动以行为单位扩充
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true);
//		
//		JLabel  label = new JLabel("请输入");
//		JTextField text = new JTextField();
//		add(label);
//		add(text);
//		
//		b[1] = new JButton("确定");
//		add(b[1]);
//		b[0] = new JButton("返回");
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
