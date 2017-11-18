import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {			
	public GridLayoutEx() {				//������ ����
		super("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();		
		c.setLayout(new GridLayout(1, 10));		//ũ�� ����
		
		
		JButton [] btn = new JButton [10];		//10�� ��ư����
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			c.add(btn[i]);
		}
		JLabel [] label = new JLabel [10];			// ���� �ֱ�
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY}; 
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
