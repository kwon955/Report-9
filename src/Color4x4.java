import java.awt.*;
import javax.swing.*;

public class Color4x4 extends JFrame {
	public Color4x4() {				//积己磊 积己
		super("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));
		
		JLabel [] label = new JLabel [16];			// 祸惑 持扁
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA}; 

		for(int i=0; i<label.length; i++) {			// 4x4 官迪魄 积己
			label[i] = new JLabel(Integer.toString(i));
			label[i].setOpaque(true);
			label[i].setBackground(color[i]);
			c.add(label[i]);
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Color4x4();
	}

}
