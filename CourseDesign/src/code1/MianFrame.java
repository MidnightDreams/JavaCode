package code1;

import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MianFrame extends JFrame{
	
	int k = 0,  i = 0, save = 0;
	//读文件里的数据（定义为全局，方便下面的方法引用）
	File f = new File("C:\\Users\\breeze\\Desktop\\data.txt");
	String[] str2 = {  "全览","添加","删减","修改","查询","退出" };				//按键
	private JButton[] jb = new JButton[str2.length] ;		//（按键）创建相应GUI组件，设为null，方便后面赋值与引用
	JFrame my_frame = null;
	
	public void mine1(String titile) throws IOException {//文件要抛异常
		setTitle(titile);					    //窗口标题		
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
		
		
		setLayout(new GridLayout(4,2));				//设置布局管理器为Grid（自设行与列），如果不够，会自动以行为单位扩充
		
		JLabel jl =new JLabel("请选择需要执行的功能:");
		jl.setFont(new Font ("楷体", Font.BOLD, 17));
		add(jl);
		add(new JLabel(new ImageIcon("C:\\Users\\breeze\\Desktop\\1.jpg")));
		for(k = 0; k<str2.length; k++ ) {             //加按键
			jb[k] = new JButton(str2[k]); 
			jb[k].setFont(new Font ("楷体", Font.CENTER_BASELINE, 17));
			add(jb[k]);
		}
			
		jb[0].addActionListener( (e) -> {		//为每个按键加上监听器
				my_frame = new MyFrame1(str,save);//显示
				 setVisible(false);
			});
		jb[1].addActionListener( (e) -> {		//为每个按键加上监听器
				my_frame = new MyFrame2(str,save);//添加
				setVisible(false);
			});
		jb[2].addActionListener( (e) -> {		//为每个按键加上监听器
				my_frame = new MyFrame3(str,save);//删除
				setVisible(false);
			});
		jb[3].addActionListener( (e) -> {		//为每个按键加上监听器
				my_frame = new MyFrame4(str,save);//修改
				setVisible(false);
			});
		jb[4].addActionListener( (e) -> {		//为每个按键加上监听器
				my_frame = new MyFrame5(str,save);//查询
				setVisible(false);
			});
		jb[5].addActionListener( (e) -> {		//为每个按键加上监听器
				setVisible(false);
			});
	}
	
}
































