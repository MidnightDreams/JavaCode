package code1;
/**
 * ����ʱû���˺ŵ��ע���µ�һ���ͺ�
 * @author breeze
 * Start:0620	End:0625
 */
import java.io.IOException;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) throws IOException {
		
		//��¼����
		JFrame frame = new MyFrame("��ӭʹ�ñ�ϵͳ");
	             frame.setVisible(true);
		
//		newWindows();
		
	}	
	//ʵ��
	public static void newWindows() throws IOException {
			JFrame mFrame = new MianFrame();   	//�������ʵ��(��̬)
			mFrame.setSize(500,300);
			mFrame.setLocation(430,160);
			((MianFrame) mFrame).mine1("������Ϣ����");//����mine����������ʵ�ֽ���
			mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ô��ڵ�Ĭ�Ϲرղ�����Exit..��ʾ����Ӧ�ó���ֹͣ��
			mFrame.setVisible(true);
		}
}

