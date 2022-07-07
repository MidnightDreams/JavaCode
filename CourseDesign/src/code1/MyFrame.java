package code1;

import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class MyFrame extends JFrame {
		File f1 = new File("C:\\Users\\breeze\\Desktop\\mima.txt");
		String[] buttonStr = {"注册","登录"};
	        String[]  labelStr= {"请输入账号","请输入密码","请输入姓名"};
	        String[]  comboBoxStr= {"普通成员","管理员"};
	        final int N = buttonStr.length ,M = labelStr.length;                  //使修改后便可以得到不同数量的按键
	        private JButton[] jb = new JButton[N];
	        private JLabel[] jl = new JLabel[M];
	        private JTextField[] jt =new  JTextField[M];
	        JComboBox<String> member = new JComboBox<> ();      //下拉列表(泛型)<>里面的类型可改
	        private JCheckBox agreeField = new JCheckBox("同意用户协议");	//复选框
	        public MyFrame(String titile) {
	            setTitle(titile);                              //窗口标题   
	            setSize(290,240);			    //窗口位置与大小
	            setLocation(500, 60);
	            setLayout(null);                         //无布局管理器 
	            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭事件
	            
	            int hight = 26, legth = 130, x=20,y=20;                                 //控制位置的变量
	            for(int i=0; i<labelStr.length; i++) {                                   //加标签与单行文本框
	                  jl[i] = new JLabel(labelStr[i]);
	                  jt[i] = new JTextField();
	                  add(jl[i]);
	                  add(jt[i]);
	                  jl[i].setBounds(x, y,legth,hight);
	                  x += 100;
	                  jt[i].setBounds(x, y,legth,hight);
	                  y += 30;
	                  jl[i].setFont(new Font ("楷体", Font.BOLD, 17));
	                  x = 20;                                                                  //列要对齐
	            }
	            
	            JLabel newLabel = new JLabel("请选择身份");//新建标签用于解释下拉列表
	           newLabel.setFont(new Font ("楷体", Font.BOLD, 17)); 
	           add(newLabel);
	            newLabel.setBounds(x, y,legth,hight);
	            x += 100;                                                                  //下个不是写下一行，x+
	            
	            for(int i=0; i<comboBoxStr.length; i++) {       //加下拉列表
	                member.setFont(new Font ("楷体", Font.BOLD, 17));
	                add( member );
	                member.addItem(comboBoxStr[i]);
	                member.setBounds(x, y,legth,hight);
	            }
	            y += 30;                                                   //到下一行了，y+
	            x = 20;                                                     //x也要变回来
	            
	            for(int i=0; i<buttonStr.length; i++) {             //加按键
	                 jb[i] = new JButton(buttonStr[i]);
	                 jb[i].setFont(new Font ("楷体", Font.BOLD, 17));
	                 add(jb[i]);
	                 jb[i].setEnabled( false );		//将按键设成不可用
	                 jb[i].setBounds(x, y,legth-23,hight);          //不需要太长，减一点
	                 x +=122;                                                            //下个不是写下一行，x+
	             }
	          //界面初始化
	            x=20;
	            add(agreeField);
	            agreeField.setBounds(x, y+30,legth,hight);          //不需要太长，减一点
	            agreeField.setSelected( false );			//显示未勾选
	            agreeField.setContentAreaFilled(false);	//背景设为透明
	            agreeField.addActionListener( (e) -> {	//让用户进行勾选
	        	    for(int i=0; i<buttonStr.length; i++) {           
	        		    checkBox(i);
	        	    }
				
			});
			
	            //加背景图（放最后面加，不会遮住按键与其余标签）
	            JLabel photoLabel = new JLabel(new ImageIcon("C:\\Users\\breeze\\Desktop\\1.jpg"));//设置窗口背景（导入图片）
	            photoLabel.setSize(290,300);                           //标签大小（这样写图片像素并不会随标签大小而变化）
	            add(photoLabel);
	            //监听器（按键部分）
	            jb[0].addActionListener((e)->{				   
	        	    setVisible(false);					   //关掉旧窗口
	        	    JFrame logIn = new LogIn("注册界面");//按键0被点后调用LogIn类来实现注册界面的显示
	        	    logIn.setVisible(true);				    //显示新窗口
	            });
	             jb[1].addActionListener((e)->{			   
	        	    try {
				if( rightOrNot(0,1,2) ) {
					JOptionPane.showMessageDialog(null,"登录成功");
					setVisible(false);
					if(member.getSelectedIndex() == 1)			   //下拉列表的选择
						Test.newWindows();						   //显示实操窗口
					else 
					{
						JFrame labframe = new MianFrame2("成员界面");
						labframe.setVisible(true);
					}
						
				}
				else
					JOptionPane.showMessageDialog(null,"错误");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	            });
	        
		
		
	}
//***********  方法（对比数据）  *************	
public boolean rightOrNot(int x, int y,int z) throws IOException 
	{
       	String mima, user,name; 
		Scanner sc =new Scanner(f1);
                user = sc.nextLine();	
                mima = sc.nextLine();
                name = sc.nextLine();
		System.out.print(jt[x].getText()+jt[y].getText() +jt[z].getText());
		sc.close();
		//登录用户名与密码进行比较
		if( (mima.compareTo(jt[x].getText()) == 0) && (user.compareTo(jt[y].getText() ) == 0) 
			&& (name.compareTo(jt[z].getText()) == 0))
		{
			return true;
		}
		return false;
		
	}
//***********  方法（复选框）  *************
	public void checkBox(int i)	//复选框
	{
		if( agreeField.isSelected() )	{	//判断复选框是否已被选中
			jb[i].setEnabled( true );//按键功能恢复
			}
		else
			jb[i].setEnabled( false );
	}
	
}
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
