package code1;

import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")//一个批注或者注解，作用是给编译器一条指令，告诉它对被批注的代码元素内部的某些警告保持静默，即忽略这些警告信息
public class LogIn extends JFrame{
        String[] buttonStr = {"确认注册","退出"};
        String[]  labelStr= {"请输入新账号","请输入新密码","请您输入姓名"};
        String[]  comboBoxStr= {"普通成员","管理员"};
        JButton[] jb = new JButton[buttonStr.length];
        JLabel[] jl = new JLabel[labelStr.length];
        JTextField[] jt =new  JTextField[labelStr.length];
        JComboBox<String> department = new JComboBox<> ();      //下拉列表(泛型)<>里面的类型可改
        int hight = 26, legth = 130, x=20,y=20;                                 //控制位置的变量
        public LogIn(String titile) {
            setTitle(titile);                              //窗口标题   
            setSize(300,257);
            setLocation(500, 60);
            setLayout(null);                         //无布局管理器 
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭事件
            
            
            for(int i=0; i<labelStr.length; i++) {                                   //加标签与单行文本框
                  jl[i] = new JLabel(labelStr[i]);
                  jt[i] = new JTextField();
                  add(jl[i]);
                  add(jt[i]);
                  jl[i].setBounds(x, y,legth,hight);
                  x += 110;
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
                department.setFont(new Font ("楷体", Font.BOLD, 17));
                add( department );
                department.addItem(comboBoxStr[i]);
                department.setBounds(x, y,legth,hight);
            }
            y += 30;                                                   //到下一行了，y+
            x = 20;                                                     //x也要变回来
            
            for(int i=0; i<buttonStr.length; i++) {             //加按键
                 jb[i] = new JButton(buttonStr[i]);
                 jb[i].setFont(new Font ("楷体", Font.BOLD, 16));
                 add(jb[i]);

                 jb[i].setBounds(x, y,legth-20,hight+1);          //不需要太长，减一点
                 x += 120;                                                              //下个不是写下一行，x+
             }
            //加显示结果的标签
            JLabel show_result = new JLabel();
            add(show_result);
            x=20;
            show_result.setBounds(x, y+30,legth-20,hight+1);
            //加背景图（放最后面加，不会遮住按键与其余标签）
            JLabel photoLabel = new JLabel(new ImageIcon("C:\\Users\\breeze\\Desktop\\1.jpg"));//设置窗口背景（导入图片）
            photoLabel.setSize(290,300);                           //标签大小（这样写图片像素并不会随标签大小而变化）
            add(photoLabel);      
            
            //监听器
            jb[0].addActionListener((e)->{
        	    String[] line = new String[labelStr.length];		//*本次只需要关注三个信息
        	    for(int i=0; i<labelStr.length; i++) { 			       //由上可知M=labelStr.length         
        		    line[i] = jt[i].getText();
        	    }
        	    try {
			saveFile(line,labelStr.length);					//保存
			show_result.setText("成功！");
        	    } catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
        	    }
            });
             jb[1].addActionListener((e)->{
        	     dispose();
             });
            
            
        }
        
        private void saveFile(String[] line, int save) throws IOException {
        	 // 写入txt文件  
        	File fw = new File("C:\\Users\\breeze\\Desktop\\mima.txt");
        	BufferedWriter out = new BufferedWriter(new FileWriter(fw));  
                for(int i = 0; i<save;i++) {
                	 out.write(line[i]+"\n"); // \n即为换行  
                }
                out.close(); // 最后记得关闭文件  
                
        } 
        
}








