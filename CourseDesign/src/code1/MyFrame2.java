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
public class MyFrame2 extends JFrame{
	int i = 0;
	final int U = 10;					//想要的按建的数量
	//读文件里的数据（定义为全局，方便下面的方法引用）
	File f = new File("C:\\Users\\breeze\\Desktop\\data.txt");
	private JButton[] b = new JButton[U] ;		//（按键）创建相应GUI组件，设为null，方便后面赋值与引用
	private JLabel show_reult = new JLabel();//（单行文本框）
	
	public MyFrame2(String[] str , int save)  {
		setTitle("数据添加");
		setSize(500,560);
		setLocation(430,160);
		setLayout(new GridLayout(10,20));				//设置布局管理器为Grid（自设行与列），如果不够，会自动以行为单位扩充
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JTextField jt = new JTextField();				//给一行让写入
		add( jt);
		
		b[1] = new JButton("确定");
		add(b[1]);
		b[0] = new JButton("返回");
		add(b[0]);
		
		add(show_reult);//放最后面
		
		b[1].addActionListener((e)->{
			
			String str0 = new String(str[0]+"\n");//所有数据统一为一行
			for(i = 1;i<save;i++) {
				str0 += (str[i]+"\n");
			}
			str0 += jt.getText();//取出写入的数据(写到最后)
			
			try {
				FileWriter fw = new FileWriter(f);
				fw.append(str0);
				fw.close();
				show_reult.setText("添加成功");
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		

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
