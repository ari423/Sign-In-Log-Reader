package LogReader;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		GUI gui = new GUI();
		gui.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		gui.setSize(150,175);
		gui.setResizable(false);
		gui.setLocation((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth() - gui.getSize().getWidth())/2, (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight() - gui.getSize().getHeight())/3);
		gui.setVisible(true);
	}

}
