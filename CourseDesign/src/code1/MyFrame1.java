package code1;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame1 extends JFrame{
	
	int i= 0;
	final int U = 10;					//按钮（）
	private JButton[] b = new JButton[U] ;		//（按键）创建相应GUI组件，设为null，方便后面赋值与引用
	

	public MyFrame1(String[] str , int save)  {
		 JTextField[] jt = new JTextField[save];//（单行文本框）
		setTitle("查看");
		setSize(500,900);
		setLocation(430,0);
		setLayout(new GridLayout(30,1));				//设置布局管理器为Grid（自设行与列），如果不够，会自动以行为单位扩充
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JTextField jt1= new JTextField("商品名称\t商品编号\t销售数量\t单价\t销售金额");//加区别信息
		add(jt1);
		jt1.setBackground(Color.lightGray);
		for(i = 0; i<save; i++) {
			
				jt[i] = new JTextField();//加文本框	
				add(jt[i]);
				jt[i].setText(str[i]);
				
		}
		
		b[0] = new JButton("返回");
		
		add(b[0]);
		
		b[0].addActionListener( (e) ->{
			setVisible(false);
			
			try {
				Test.newWindows();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		});
		
		
	}
}











