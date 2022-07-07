package code1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MianFrame2 extends JFrame{
	
	int k = 0,  i = 0, save = 0;
	//读文件里的数据（定义为全局，方便下面的方法引用）
	File f = new File("C:\\Users\\breeze\\Desktop\\data.txt");
	String[] str2 = {  "全览","退出" };				//按键
	private JButton[] jb = new JButton[str2.length] ;		//（按键）创建相应GUI组件，设为null，方便后面赋值与引用
	
	public MianFrame2(String titile) throws IOException {//文件要抛异常
		setTitle(titile);					    //窗口标题
		setSize(300,200);
		setLocation(430,160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口的默认关闭操作（Exit..表示整个应用程序都停止）
		Scanner sc = new Scanner(f);
		while( sc.hasNextLine() )//读到文件末尾
		{	
			sc.nextLine();
			i++;	
			save = i;										//记录商品个数（即行数）
		}
		sc.close();
		i=0;
		System.out.println(save);
		String[] str = new String[save+1];//记得加上1，使添加后不会出格
		Scanner sc1 = new Scanner(f); 
		while( sc1.hasNextLine() )//读到文件末尾
		{	
			str[i] = sc1.nextLine();					//读一个字符串，会以 空格 与 回车符、Tap键   断开
			i++;	
			
		}
		sc1.close();
		
		
		setLayout(new GridLayout(4,1));				//设置布局管理器为Grid（自设行与列），如果不够，会自动以行为单位扩充
		
		JLabel jl =new JLabel("普通成员仅可以查看信息:");
		jl.setFont(new Font ("楷体", Font.BOLD, 17));
		add(jl);
		for(k = 0; k<str2.length; k++ ) {             //加按键
			jb[k] = new JButton(str2[k]); 
			jb[k].setFont(new Font ("楷体", Font.CENTER_BASELINE, 17));
			add(jb[k]);
		}
			
		jb[0].addActionListener( (e) -> {		//为每个按键加上监听器
				dispose();
				 searchAll(str,save);//显示
			});
		jb[1].addActionListener( (e) -> {		//为每个按键加上监听器
				setVisible(false);
			});
	}
	
	private void searchAll(String[] str , int save) {
		JFrame search = new JFrame();
		search.setSize(500,900);
		search.setLocation(430,0);
		search.setLayout(new GridLayout(30,1));				//设置布局管理器为Grid（自设行与列），如果不够，会自动以行为单位扩充
		search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		search.setVisible(true);
		
		JTextField[] t = new JTextField[save];
		JTextField t2= new JTextField("商品名称\t商品编号\t销售数量\t单价\t销售金额");//加区别信息
		search.add(t2);
		t2.setBackground(Color.lightGray);
		for(i = 0; i<save; i++) {
			
			t[i] = new JTextField();//加文本框	
			search.add(t[i]);
			t[i].setText(str[i]);
				
		}
		
		jb[0] = new JButton("退出");
		
		search.add(jb[0]);
		
		jb[0].addActionListener( (e) ->{
			search.setVisible(false);
		});
		
	}
	
}

