package code1;
/**
 * 运行时没有账号点击注册新的一个就好
 * @author breeze
 * Start:0620	End:0625
 */
import java.io.IOException;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) throws IOException {
		
		//登录界面
		JFrame frame = new MyFrame("欢迎使用本系统");
	             frame.setVisible(true);
		
//		newWindows();
		
	}	
	//实操
	public static void newWindows() throws IOException {
			JFrame mFrame = new MianFrame();   	//生成类的实例(多态)
			mFrame.setSize(500,300);
			mFrame.setLocation(430,160);
			((MianFrame) mFrame).mine1("销售信息管理");//调用mine（）方法来实现界面
			mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口的默认关闭操作（Exit..表示整个应用程序都停止）
			mFrame.setVisible(true);
		}
}

