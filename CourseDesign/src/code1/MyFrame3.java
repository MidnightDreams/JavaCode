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
	public class MyFrame3 extends JFrame{
		int i = 0,data = -1;
		final int U = 10;					//想要的按建的数量
		//读文件里的数据（定义为全局，方便下面的方法引用）
		File f = new File("C:\\Users\\breeze\\Desktop\\data.txt");
		private JButton[] b = new JButton[U] ;		//（按键）创建相应GUI组件，设为null，方便后面赋值与引用
		private JLabel show_reult = new JLabel();//（单行文本框）

		public MyFrame3(String[] str , int save)  {
			setTitle("数据删除");
			setSize(500,560);
			setLocation(430,160);
			setLayout(new GridLayout(10,2));				//设置布局管理器为Grid（自设行与列），如果不够，会自动以行为单位扩充
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			JLabel  label = new JLabel("请输入要删除的对象");
			JTextField text = new JTextField(20);
			add(label);
			add(text);
			
			b[1] = new JButton("确定");
			add(b[1]);
			
			JTextField t2= new JTextField("商品名称\t商品编号\t销售数量\t单价\t销售金额");//加上相应的信息
			add(t2);
			JTextField jt = new JTextField();				//给一行让写入
			add( jt);
			
			add(show_reult);//放最后面
			
			b[1].addActionListener((e)->{
				
				for(i = 0;i<save;i++) {
					if( str[i].startsWith( text.getText() ) ) //查数据
					{					
						jt.setText(str[i]);
						data = i;
						break;
					}	
				}
				
				if(data == i){
					String str0 = new String(str[0]+"\n");//所有数据统一为一行
					for( i = 1; i<save; i++) {
						if(i != data) {
							str0 += (str[i]+"\n");
						}
					}
					try {
						
						FileWriter fw = new FileWriter(f);
						fw.append(str0);
						fw.close();
						show_reult.setText("删除成功！");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else
					show_reult.setText("无此商品");
			});
				
			
			b[0] = new JButton("返回");
			add(b[0]);
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
